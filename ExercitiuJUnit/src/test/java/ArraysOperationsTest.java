import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysOperationsTest {

    ArraysOperations arraysOperations = new ArraysOperations();
    int[] array = {2, 3, 4, 7, 9, 12, 15};

    @Test
    public void arrayLengthTest() {
        int result = arraysOperations.arrayLength(array);
        System.out.println("Testam lungimea array-ului: " + result);

        assertEquals(result, 7);
    }

    @Test
    public void numereMaiMariTest() {
        int result = arraysOperations.numereMaiMari(array);
        System.out.println("Testam cate numere sunt mai mari decat 5: " + result);

        assertEquals(result, 4);
    }

}
