import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(5000);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
