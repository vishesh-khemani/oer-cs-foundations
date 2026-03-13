import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectSquareDeciderTest {

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPerfectSquares() {
        for (int i = 1; i < 10; i++) {
            System.setIn(new ByteArrayInputStream(
                    String.valueOf(i * i).getBytes()));
            PerfectSquareDecider.main(new String[] {});
            assertTrue(outContent.toString().contains("YES"));
        }
    }

    @Test
    public void testImperfectSquares() {
        for (int i = 1; i < 10; i++) {
            System.setIn(new ByteArrayInputStream(
                    String.valueOf(i * i + 1).getBytes()));
            PerfectSquareDecider.main(new String[] {});
            assertTrue(outContent.toString().contains("NO"));
        }
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
}
