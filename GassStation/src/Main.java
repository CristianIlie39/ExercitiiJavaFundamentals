import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class Main {

    //Sa se modeleze o benzinarie
    //Obiectele:
    //Gas station
    //o sa aiba:
    //motorina
    //benzina
    //reprezentate prin cantitate
    //pret pe litru
    //pentru benzina
    //pentru motorina
    //de fiecare data cand cineva cumpara scadem din cantitate
    //cand cantitatea este mai mica decat 10 litri afisam un mesaj "aducem cisterna"
    //cand cineva cumpara calculam pretul
    //obiect persoana cu o suma de bani - vine si cumpara - el are o suma de bani la el - el o sa poata sa plateasca pentru combustibilul cumparat
    //el o sa poata sa plateasca pentru benzina sau motorina
    //de fiecare data cand plateste scade suma lui de bani
    //persoana poate sa plateasca cu o suma rotunda si benzinaria trebuie sa-i dea rest
    //daca utilizatorul nu are destui bani afisam un mesaj

    public static void main(String[] args) {

        GassStation omv = new GassStation(50, 35, 50, 6);
        Scanner persoana = new Scanner(System.in);
        System.out.println("Introduceti numele persoanei");
        String name = persoana.nextLine();
        Person cumparator = new Person(name, 300);
        Scanner meniu = new Scanner(System.in);
        System.out.println("Va rugam alegeti o optiune");
        System.out.println("1. Motorina");
        System.out.println("2. Benzina");
        int optiune = 0;
        optiune = meniu.nextInt();
        Scanner cantitate = new Scanner(System.in);
        System.out.println("Introduceti cantitatea");
        int litri = cantitate.nextInt();
        System.out.println("Ati introdus cantitatea " + litri);
        while (optiune != 9) {
            if (optiune == 1) {
                System.out.println("Ati ales sa cumparati motorina");
                int pretTotal = omv.vindeMotorina(litri);
                System.out.println("Aveti de platit " + pretTotal);
                String rezultatTranzactie = cumparator.cumparaMotorina(pretTotal);
                if (rezultatTranzactie.startsWith("Nu avem destui bani")) {
                    String incasare = omv.incaseazaBani(pretTotal / 2, pretTotal);
                    System.out.println("Rezul tatul tranzactiei este: " + incasare);
                } else {
                    String incasare = omv.incaseazaBani(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este: " + incasare);
                    System.out.println("A mai ramas atata motorina " + omv.getMotorina());
                }
            } else if (optiune == 2) {
                System.out.println("Ati ales asa cumparati benzina");
                int pretTotal = omv.vindeBenzina(litri);
                System.out.println("Aveti de platit " + pretTotal);
                String rezultaTtranzactie = cumparator.cumparaBenzina(pretTotal);
                if (rezultaTtranzactie.startsWith("Nu avem destui bani")) {
                    String incasare = omv.incaseazaBani(pretTotal / 2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este: " + incasare);
                } else {
                    String incasare = omv.incaseazaBani(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este: " + incasare);
                    System.out.println("A mai ramas atata benzina " + omv.getBenzina());
                }
            } else {
                System.out.println("Nu gasim optiunea");
            }

            optiune = meniu.nextInt();

        }

    }

}
