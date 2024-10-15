import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



@ExtendWith(MockitoExtension.class)
public class MyAppTest {

    @Mock
    private Logger logger;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        MyApp.logger = logger;
    }

    @Test
    public void testMain() {
        MyApp.main(new String[]{});

        // Verify console output
        assertEquals("Hello, World!\nmore text\n", outContent.toString());

        // Verify logger output
        verify(logger).info("Hello, World!");
    }
}