import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.ConsoleAppender;
import com.coralogix.sdk.appenders.CoralogixLogbackAppender;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import org.slf4j.LoggerFactory;

public final class LogbackConfigurer {
    private static LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

    public static void init(Level rootLevel, Map<String, Level> levels, List<Appender<ILoggingEvent>> appenders) {
        context.reset();
        PatternLayoutEncoder logEncoder = new PatternLayoutEncoder();
        logEncoder.setContext(context);
        logEncoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
        logEncoder.start();

        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<ILoggingEvent>();
        consoleAppender.setContext(context);
        consoleAppender.setName("console");
        consoleAppender.setEncoder(logEncoder);
        consoleAppender.start();

        AsyncAppender asyncConsoleAppender = new AsyncAppender();
        asyncConsoleAppender.setContext(context);
        asyncConsoleAppender.addAppender(consoleAppender);
        asyncConsoleAppender.start();

        Logger rootLogger = context.getLogger("ROOT");
        rootLogger.addAppender(asyncConsoleAppender);

        for (Appender<ILoggingEvent> appender : appenders) {
            rootLogger.addAppender(appender);
        }
        rootLogger.setLevel(rootLevel);

        for (String level : levels.keySet()) {
            context.getLogger(level).setLevel(levels.apply(level));
        }
    }


    public static Appender<ILoggingEvent> coralogixAppender(Integer companyId,
                                                            String privateKey,
                                                            String applicationName,
                                                            String subSystemName) {
        CoralogixLogbackAppender appender = new CoralogixLogbackAppender();
        appender.setContext(context);
        appender.setName("coralogix");
        appender.setCompanyId(companyId);
        appender.setPrivateKey(privateKey);
        appender.setApplicationName(applicationName);
        appender.setSubsystemName(subSystemName);
        appender.start();

        return (Appender<ILoggingEvent>) appender;
    }


}
