import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Integer port = Integer.valueOf(args[0]);

        Javalin app = Javalin.create().start(port);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
