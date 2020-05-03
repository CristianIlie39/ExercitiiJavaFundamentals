public class Main {

    //se da un text
    //sa se afiseze toate cuvintele care incep cu litera s sau cu litera d
    //apoi sa se afiseze litera de la pozitia 3 din fiecare cuvant

    public static void main(String[] args) {
        String text = "Tehnicile și metodele Wikipediei sunt folosite de unele companii intern la colecționarea și oferirea de informații și documentații propriilor angajați. Conform principiilor Wiki informațiile pot fi plasate pe serverul Wiki chiar de către angajații implicați în diversele procese ale întreprinderii. Acest gen de proiecte interne se numesc în engleză în general Enterprise Wiki sau și Corporate Wiki (Wiki de întreprindere). Fiind vorba de informații interne, ele sunt de obicei puse la dispoziție numai angajaților, în cadrul unui intranet al companiei. La nevoie se poate permite un acces (limitat) și unor persoane din afara companiei, în cadrul unui extranet protejat.";
        afisareCuvinte(text);
        literaPozitia3(text);

    }

    public static void afisareCuvinte(String text) {
        String[] sirText = text.split(" ");
        for (int cursor = 0; cursor < sirText.length; cursor++) {
            sirText[cursor] = sirText[cursor].toLowerCase();
            if (sirText[cursor].startsWith("s") || sirText[cursor].startsWith("d")) {
                System.out.println(sirText[cursor]);
            }
        }

    }

    public static void literaPozitia3(String text) {
        String[] sirText = text.split(" ");
        for (int cursor = 0; cursor < sirText.length; cursor++) {
            if(sirText[cursor].length() > 3){
                System.out.println(sirText[cursor].charAt(3));
            }

        }

    }



}
