import java.time.Month;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    //sa se modeleze cosul de cumparaturi dintr-un supermarket
    //fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret, de exemplu: mere 5 lei, pere 4 lei, cirese 15 lei
    //cosul de cumparaturi va fi reprezentat de un array de produse
    //sa se afiseze un meniu cu produsele dorite
    //bazat pe ce se introduce de la tastatura adaugam in cosul de cumparaturi
    //sa se calculeze costul total al cosului de cumparaturi
    //simulam plata pentru cosul de cumparaturi

    public static void main(String[] args) {

        Produs[] cosDeCumparaturi = new Produs[10];

        System.out.println("Meniu cumparaturi");
        System.out.println("1. Mere");
        System.out.println("2. Matura");
        System.out.println("3. Set de farfurii");
        System.out.println("4. Mustar");
        System.out.println("5. Apa");
        System.out.println("6. Bere");
        System.out.println("7. Suc");
        System.out.println("Va rugam sa alegeti produsele dorite");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati adaugat in cosul de cumparaturi Mere");
                Produs mere = new Produs("Mere", 5);
                cosDeCumparaturi[0] = mere;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[0].getNume() + " la pretul " + cosDeCumparaturi[0].getPret());
            } else if (optiune == 2) {
                System.out.println("Ati adaugat in cosul de cumparaturi Matura");
                Produs matura = new Produs("Matura", 8);
                cosDeCumparaturi[1] = matura;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[1].getNume() + " la pretul " + cosDeCumparaturi[1].getPret());
            } else if (optiune == 3) {
                System.out.println("Ati adaugat in cosul de cumparaturi Set de farfurii");
                Produs farfurii = new Produs("Set de farfurii", 50);
                cosDeCumparaturi[2] = farfurii;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[2].getNume() + " la pretul " + cosDeCumparaturi[2].getPret());
            } else if (optiune == 4) {
                System.out.println("Ati adaugat in cosul de cumparaturi Mustar");
                Produs mustar = new Produs("Mustar", 4);
                cosDeCumparaturi[3] = mustar;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[3].getNume() + " la pretul " + cosDeCumparaturi[3].getPret());
            } else if (optiune == 5) {
                System.out.println("Ati introdus in cosul de cumparaturi Apa");
                Produs apa = new Produs("Apa", 3);
                cosDeCumparaturi[4] = apa;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[4].getNume() + " la pretul " + cosDeCumparaturi[4].getPret());
            } else if (optiune == 6) {
                System.out.println("Ati introdus in cosul de cumparaturi Bere");
                Produs bere = new Produs("Bere", 5);
                cosDeCumparaturi[5] = bere;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[5].getNume() + " la pretul " + cosDeCumparaturi[5].getPret());
            } else if (optiune == 7) {
                System.out.println("Ati adaugat in cosul de cumparaturi Suc");
                Produs suc = new Produs("Suc", 4);
                cosDeCumparaturi[6] = suc;
                System.out.println("Afisam adaugarea: " + cosDeCumparaturi[6].getNume() + " la pretul " + cosDeCumparaturi[6].getPret());
            } else {
                System.out.println("Optiunea introdusa nu exista");
            }
            optiune = scanner.nextInt();
        }

        System.out.println("Ati apasat tasta 0, programul se inchide.");

        System.out.println("Ati cumparat: ");

        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                //In acest fel afisam numele si pretul fiecarui produs din array
                System.out.println("Produsul cumparat este: " + cosDeCumparaturi[cursor].getNume() + " la pretul " + cosDeCumparaturi[cursor].getPret());
            }
        }

        //declaram variabila pentru stocarea pretului in afara buclei for deoarece nu dorim resetarea variabilei

        int pretTotal = 0;
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                pretTotal += cosDeCumparaturi[cursor].getPret();
            }
        }
        System.out.println("Pretul total este: " + pretTotal);

        //simulam plata pentru cosul de cumparaturi
        System.out.println("S-a platit suma totala! Va multumim! O zi buna!");
        pretTotal = 0;

        //Sa se reprezinte si produse perisabile, acestea vor avea in plus data expirarii
        //Sa se simuleze din nou un cos de cumparaturi
        //Daca utilizatorul cumpara un produs perisabil si data de expirare este depasita, se va afisa un mesaj "produs expirat" si nu il vom mai adauga in cos
        //Adaugam alergeni si cand afisam cosul de cumparaturi sa afisam si alergenii
        //Un cos de cumparaturi pentru produse non-alimentare si un cos pentru produsele alimentare

        ProduseAlimentare[] cosAlimentare = new ProduseAlimentare[10];
        Produs[] cosNonAlimentare = new Produs[10];

        Date dataDeAzi = new Date(2020, 5, 10);
        System.out.println(dataDeAzi);

        System.out.println("Meniu produse");
        System.out.println("1. Mere");
        System.out.println("2. Carne");
        System.out.println("3. Lapte");
        System.out.println("4. Matura");
        System.out.println("5. Bec");
        System.out.println("6. Pronto");
        System.out.println("Va rugam sa introduceti produsele dorite:");

        optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales Mere");
                ProduseAlimentare mere = new ProduseAlimentare("mere", 5, "zaharoza", new Date(2020, 7, 20));
                cosAlimentare[0] = mere;
            } else if (optiune == 2) {
                System.out.println("Ati ales Carne");
                ProduseAlimentare carne = new ProduseAlimentare("carne", 20, "condimente", new Date(2019, 6, 10));
                cosAlimentare[1] = carne;
            } else if (optiune == 3) {
                System.out.println("Ati ales Lapte");
                ProduseAlimentare lapte = new ProduseAlimentare("lapte", 6, "lactoza", new Date(2020, 2, 5));
                cosAlimentare[2] = lapte;
            } else if (optiune == 4) {
                System.out.println("Ati ales Matura");
                Produs matura = new Produs("matura", 8);
                cosNonAlimentare[0] = matura;
            } else if (optiune == 5) {
                System.out.println("Ati ales Bec");
                Produs bec = new Produs("bec", 4);
                cosNonAlimentare[1] = bec;
            } else if (optiune == 6) {
                System.out.println("Ati ales Pronto");
                Produs pronto = new Produs("Pronto", 11);
                cosNonAlimentare[2] = pronto;
            } else {
                System.out.println("Optiunea introdusa de dumneavoastra nu exista");
            }

            optiune = scanner.nextInt();
        }

        System.out.println("Ati cumparat urmatoarele produse alimentare:");

        for (int cursor = 0; cursor < cosAlimentare.length; cursor++) {
            if (cosAlimentare[cursor] != null) {
                System.out.println("Produsul este " + cosAlimentare[cursor].getNume() + " la pretul " + cosAlimentare[cursor].getPret() + ", contine " + cosAlimentare[cursor].getAlergeni() + " si are data de expirare " + cosAlimentare[cursor].getDataExpirare());
                if (cosAlimentare[cursor].getDataExpirare().before(dataDeAzi)) {
                    System.out.println("Produsul este expirat si va fi scos din cos");
                    cosAlimentare[cursor] = null;
                }
            }
        }

        System.out.println("Ati cumparat urmatoarele produse non-alimentare");

        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {
                System.out.println("Produsul este " + cosNonAlimentare[cursor].getNume() + " la pretul " + cosNonAlimentare[cursor].getPret());
            }
        }

        int pretTotalAlimentare = 0;
        int pretToatalNealimentare = 0;

        for (int cursor = 0; cursor < cosAlimentare.length; cursor++) {
            if (cosAlimentare[cursor] != null) {
                pretTotalAlimentare += cosAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru produsele alimentare este: " + pretTotalAlimentare);

        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {
                pretToatalNealimentare += cosNonAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru produse non-alimentare este: " + pretToatalNealimentare);

        int pretTotalProduse = pretTotalAlimentare + pretToatalNealimentare;
        System.out.println("Pretul total al produselor cumparate este: " + pretTotalProduse);
        System.out.println("S-a platit pretul total! Va multumim! O zi buna!");

    }

}
