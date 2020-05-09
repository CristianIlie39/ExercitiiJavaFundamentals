import java.util.Scanner;

public class Main {

    //vrem sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire, impartire)
    //calculatorul sa fie reprezentat folosind programarea orientata obiect

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Rezultatul adunarii este: " + calculator.adunare(6, 9));
        System.out.println("Rezultatul scaderii este: " + calculator.scadere(6, 9));
        int inmultire = calculator.inmultirea(6, 9);
        System.out.println(inmultire);
        int impartire = calculator.impartirea(6, 6);
        System.out.println(impartire);


        //De aici citim valorile de la tastatura
        //Obiectul care ne ajuta sa facem asta se numeste Scanner
        //Declaram un obiect de tip scaner

        Scanner scanner = new Scanner(System.in);
        //Citeste primul numar de la tastatura
        System.out.println("Va rugam introduceri primul numar: ");
        int primulNumar = scanner.nextInt();
        //Citeste al doilea numar de la tastatura
        System.out.println("Va rugam introduceti al doilea numar");
        int alDoileaNumar = scanner.nextInt();

        System.out.println("Numerele introduse de dvs sunt: " + primulNumar + " si " + alDoileaNumar);

        int adunare = calculator.adunare(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul adunarii este: " + adunare);

        int scadere = calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul scaderii este: " + scadere);

        inmultire = calculator.inmultirea(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        impartire = calculator.impartirea(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul este: " + impartire);



    }

}
