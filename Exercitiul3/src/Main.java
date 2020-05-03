public class Main {

    //Cerinta
    //Se da un text, sa se numere cuvintele care au lungimea impara si se termina cu litera e

    public static void main(String[] args) {

        String text = "Istoria este stiinta care studiaza evolutia societatii omenesti din cele mai vechi timpuri si pana in prezent";
        System.out.println("Numar cuvinte gasite este: " + numarCuvinte(text));

    }

    public static int numarCuvinte(String text) {
        int numarCuvinte = 0;
        String[] rezultatSplit = text.split(" ");
        for(int cursor = 0; cursor < rezultatSplit.length; cursor++) {
            if (rezultatSplit[cursor].length() % 2 != 0 && rezultatSplit[cursor].endsWith("e")) {
                numarCuvinte++;
            }

        }
        return numarCuvinte;
    }

}
