import java.util.Scanner;

public class Main {

    //Sa se modeleze o sedinta de training
    //vom avea:
    //trainee(student) cu atributele:
    //stamina
    //strength
    //se va antrena luni,miercuri si vineri
    //va porni cu stamina 1000
    //cu fiecare antrenament stamina o sa-i scada
    //cu fiecare antrenament puterea o sa-i creasca
    //porneste cu puterea 50
    //luni face antrenament cardio
    //ati ars 300 calorii
    //miercuri face body pump
    //ati ars 500 calorii
    //vineri face box
    //ati ars 250 calorii
    //cardio scade stamina cu 30
    //body pump scade stamina cu 50
    //box scade cu 70
    //stamina > 0
    //puterea creste cu 10 pe fiecare antrenament

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Va rugam introduceti numele trainee-ului: ");
        String nume = name.nextLine();
        Trainee ion = new Trainee(nume);

        Scanner zi = new Scanner(System.in);
        System.out.println("Introduceti ziua curenta: ");
        String ziCurenta = zi.nextLine();
        while ((ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")) && ion.getStamina() > 0) {
            switch (ziCurenta) {
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la " + ion.getStamina() + ", si puterea la " + ion.getStrength());
                    break;
                case "Miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la " + ion.getStamina() + ", si puterea la " + ion.getStrength());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la " + ion.getStamina() + ", si puterea la " + ion.getStrength());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta");
                    break;
            }

            ziCurenta = zi.nextLine();
        }
        if (!ziCurenta.equals("Luni") || !ziCurenta.equals("Miercuri") || !ziCurenta.equals("Vineri")) {
            System.out.println("Ai introdus o zi in care nu se antreneaza " + ziCurenta);
        }

        if (ion.getStamina() <= 0) {
            System.out.println("Trainee-ul " + ion.getName() + " a obosit.");
        }

        System.out.println("Puterea trainee-ului " + ion.getName() + " a ajuns la " + ion.getStrength());

    }


}
