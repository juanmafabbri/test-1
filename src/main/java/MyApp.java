import java.util.logging.Logger;

public class MyApp {

    static Logger logger = Logger.getLogger(MyApp.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        logger.info("Hello, World!");
    }
}
