public class ArraysOperations {

    public int arrayLength(int[] array) {
        return array.length;
    }

    public int numereMaiMari(int[] array) {
        int numar = 0;
        for (int cursor = 0; cursor < array.length; cursor++) {
            if (array[cursor] > 5) {
                numar++;
            }
        }
        return numar;
    }

}
