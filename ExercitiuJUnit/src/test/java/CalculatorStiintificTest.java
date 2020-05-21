import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorStiintificTest {

    CalculatorStiintific calculatorStiintific = new CalculatorStiintific();

    @Test
    public void ridicareLaPutereTest() {
        double a = 8;
        double b = 2;
        double result = calculatorStiintific.ridicareLaPutere(a, b);
        System.out.println("Testam ridicarea la putere: " + result);
        assert result == 64;
    }

    @Test
    public void radicalTest() {
        double a = 100;
        double result = calculatorStiintific.radical(a);
        System.out.println("Testam radicalul: " + result);
        assert result == 10;
    }

}
