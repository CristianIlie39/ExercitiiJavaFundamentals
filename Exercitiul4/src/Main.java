public class Main {

    //Cerinte
    //A. Sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caracterul 'i' si caracterul 'i' se afla pe o pozitie para.

    public static void main(String[] args) {
        String text = "Alex Matei este profesorul nostru de Java";
        System.out.println("Numarul de cuvinte este: " + numarCuvinte(text));

    }

    public static int numarCuvinte(String text) {
        int numarCuvinte = 0;
        String[] rezultatSplit = text.split(" ");
        for (int cursor = 0; cursor < rezultatSplit.length; cursor++) {
            if (rezultatSplit[cursor].length() >2 && rezultatSplit[cursor].contains("i") && rezultatSplit[cursor].indexOf("i") % 2 == 0) {
                numarCuvinte++;
            }
        }
        return numarCuvinte;

    }

}
