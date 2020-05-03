public class Main {
    public static void main(String[] args) {
        //Cerinte:
        //o functie care primeste 2 stringuri ca parametru si verifica daca al 2-lea string exista in primul string
    String string1 = "Ana are mere acum";
    String string2 = "Ana are mere";
    verificaIncludere(string1, string2);

    }

    public static void verificaIncludere(String string1, String string2) {
        if(string1.contains(string2)) {
            System.out.println("Primul string il contine pe al doilea");
        } else {
            System.out.println("Primul string nu il contine pe al doile");
        }
    }

}
