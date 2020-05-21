import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeClass
    public static void initialize() {
        System.out.println("Starting tests ... " + System.currentTimeMillis());
    }

    @Before
    public void beforeRunningTest() {
        System.out.println("Ma execut inainte de fiecare test");
    }

    @Test
    public void adunareTest() {
        int a = 16;
        int b = 2;
        int result = calculator.adunare(a, b);
        System.out.println("Testam adunarea: " + result);

        assertEquals(result, 18);
    }

    @Test
    public void scadereTest() {
        int a = 16;
        int b = 2;
        int result = calculator.scadere(a, b);
        System.out.println("Testam scaderea: " + result);

        assertEquals(result, 14);
    }

    @Test
    public void inmultireTest() {
        int a = 16;
        int b = 2;
        int result = calculator.inmultire(a, b);
        System.out.println("Testam inmultirea: " + result);

        assertEquals(result, 32);
    }

    @Test
    public void impartireTest() {
        int a = 16;
        int b = 2;
        int result = calculator.impartire(a, b);
        System.out.println("Testam impartirea: " + result);

        assertEquals(result, 8);
    }

    @After
    public void afterRunningTest() {
        System.out.println("Ma execut dupa fiecare test");
    }

    @AfterClass
    public static void end() {
        System.out.println("End of tests ...... " + System.currentTimeMillis());
    }

}
