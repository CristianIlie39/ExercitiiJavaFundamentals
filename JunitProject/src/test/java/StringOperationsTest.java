import org.junit.*;

import java.util.SortedMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringOperationsTest {

    StringOperations stringOperations = new StringOperations();

    @BeforeClass
    public static void initialize() {
        System.out.println("Starting tests ..... " + System.currentTimeMillis());
    }

    @Before
    public void beforeRunningTest() {
        System.out.println("Ma execut inainte de fiecare test");
    }

    @Test
    public void stringLengthTest() {
        System.out.println("Rulam testul stringlength");
        String text = "Alex";
        int result = stringOperations.stringLength(text);

        assert result == 4;
    }

    @Test
    public void stringConcatenationsTest() {
        System.out.println("Rulam testul stringConcatenations");
        String text1 = "Ana are ";
        String text2 = "mere";
        String result = stringOperations.stringConcatenations(text1, text2);

        assertEquals(result, "Ana are mere");
    }

    @Test
    public void stringContainsTest() {
        System.out.println("Rulam testul stringContains");
        String text1 = "contine";
        String text2 = "tine";
        boolean result = stringOperations.stringContains(text1, text2);

        assertTrue(result);
    }

    @After
    public void afterRunningTest() {
        System.out.println("Ma execut dupa fiecare test");
    }

    @AfterClass
    public static void end() {
        System.out.println("End tests ....... " + System.currentTimeMillis());
    }

}

