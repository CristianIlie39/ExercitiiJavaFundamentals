

import java.util.Scanner;

public class Main {

    //Vrem sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire si impartire)
    //Calculatorul sa fie reprezentat folosind programarea orientata obiect.

    public static void main(String[] args) {

        //Instantierea obiectului default
        Calculator calculator = new Calculator();

        System.out.println("Rezultatul adunarii este: " + calculator.adunare(5, 10));

        System.out.println("Rezultatul scaderii este: " + calculator.scadere(10, 5));

        int inmultire = calculator.inmultire(2, 2);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        int impartire = calculator.impartire(10, 2);
        System.out.println("Rezultatul impartirii este: " + impartire);

        //De aici citim valorile de la tastatura
        //Obiectul care ne ajuta sa facem asta se numeste "Scanner"

        Scanner scanner = new Scanner(System.in);

        //Citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti primul numar: ");
        int primulNumar = scanner.nextInt();

        //Citeste al doilea numar de la tastatura
        System.out.println("Va rugam introduceti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();

        //Afisam numerele introduse
        System.out.println("Numerele introduse de dvs sunt: " + primulNumar + " si " + alDoileaNumar);

        int adunare = calculator.adunare(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul adunarii este: " + adunare);

        int scadere = calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul scaderii este: " + scadere);

        inmultire = calculator.inmultire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        impartire = calculator.impartire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul impartirii este: " + impartire);

        //Sa se modeleze un calculator stiintific care sa permita operatiile calculatorului simplu si pe langa asta urmatoarele operatii:
        // -- un numar ridicat la puterea altui numar
        // -- radical dintr-un numar
        // -- logaritm in baza 10 dintr-un numar
        // -- logaritm dintr-un numar

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();

        System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(10, 20));
        System.out.println("Rezultatul scaderii este; " + calculatorStiintific.scadere(40, 20));
        System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.inmultire(5, 10));
        System.out.println("Rezultatul impartirii este: " + calculatorStiintific.impartire(10, 5));

        // -- un numar ridicat la puterea altui numar
        double ridicareLaPutere = calculatorStiintific.ridicareLaPutere(4, 5);
        System.out.println("Rezultatul ridicarii la putere este: " + ridicareLaPutere);

        // -- radical dintr-un numar
        double radicalDinNumar = calculatorStiintific.radicalDinNumar(9);
        System.out.println("Rezultatul radicalului este: " + radicalDinNumar);

        // -- logaritm in baza 10 dintr-un numar
        double logaritmBaza10 = calculatorStiintific.logaritmBaza10(50);
        System.out.println("Rezultatul logaritmului in baza 10 este: " + logaritmBaza10);

        // -- logaritm dintr-un numar
        double logaritmNumar = calculatorStiintific.logaritmNumar(20);
        System.out.println("Rezultatul logaritmului este: " + logaritmNumar);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Va rugam introduceti primul numar pentru ridicare la putere");
        primulNumar = scanner1.nextInt();

        System.out.println("Va rugam introduceti al doilea numar pentru ridicarea la putere");
        alDoileaNumar = scanner1.nextInt();

        ridicareLaPutere = calculatorStiintific.ridicareLaPutere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul ridicarii la putere al numerelor " + primulNumar + " si " + alDoileaNumar + " este: " + ridicareLaPutere);

        System.out.println("Va rugam introduceti numarul pentru calcularea radicalului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul caulcularii radicalului numarului " + primulNumar + " este: " + calculatorStiintific.radicalDinNumar(primulNumar));

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului in baza 10");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii logaritmului in baza 10 a numarului " + primulNumar + " este: " + calculatorStiintific.logaritmBaza10(primulNumar));

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii logaritmului numarului " + primulNumar + " este: " + calculatorStiintific.logaritmNumar(primulNumar));

        //Sa se introduca 2 numere
        //Afisam numerele
        //Sa se afiseze meniul
        //1.Adunare
        //2.Inmultire
        //3.Radical
        //4.Scadere
        //Afisam mesajul "Va rugam alegeti o optiune"
        //In functie de optiunea aleasa se realizeaza operatia respectiva, daca operatia presupune folosirea unui singur numar,
        // -- facem operatia si pentru al doilea numar
        //Afisam rezultatul

        int optiune = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam introduceti cele 2 numere");
        primulNumar = sc.nextInt();
        alDoileaNumar = sc.nextInt();
        System.out.println("Numerele introduse sunt: " + primulNumar + " si " + alDoileaNumar);
        System.out.println("Meniu");
        System.out.println("1. Adunare");
        System.out.println("2. Inmultire");
        System.out.println("3. Radical");
        System.out.println("4. Scadere");
        System.out.println("Va rugam alegeti o optiune");
        optiune = sc.nextInt();  //utilizatorul introduce un numar la tastatura

        while (optiune != 9) {  //daca utilizatorul introduce orice alt numar in afara de 9

            if (optiune == 1) {
                System.out.println("S-a ales optiunea adunare");
                System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(primulNumar, alDoileaNumar));
            } else if (optiune == 2) {
                System.out.println("S-a ales optiunea 2");
                System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.inmultire(primulNumar, alDoileaNumar));
            } else if (optiune == 3) {
                System.out.println("S-a ales optiunea 3");
                System.out.println("Rezultatul calcularii radicalului primului numar este: " + calculatorStiintific.radicalDinNumar(primulNumar));
                System.out.println("Rezultatul calcularii radicalului celui de-al doilea numar este: " + calculatorStiintific.radicalDinNumar(alDoileaNumar));
            } else if (optiune == 4) {
                System.out.println("S-a ales optiunea 4");
                System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(primulNumar, alDoileaNumar));
            } else {
                System.out.println("Nu gasim optiunea aleasa de dvs!");
            }
            optiune = sc.nextInt();
        }
        System.out.println("Ne pare rau. Ati apasat tasta 9. Am iesit din program, o zi buna!");


    }


}
