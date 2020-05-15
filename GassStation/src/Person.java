public class Person {

    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Person() {

    }

    public String cumparaBenzina(int baniDePlatit) {
        if (baniDePlatit > this.money) {
            return "Nu avem destui bani";
        } else {
            this.money -= baniDePlatit;
            return "Mai avem " + this.money + " bani";
        }
    }

    public String cumparaMotorina(int baniDePlatit) {
        if (baniDePlatit > this.money) {
            return "Nu avem destui bani";
        } else {
            this.money -= baniDePlatit;
            return "Mai avem " + this.money + " bani";
        }
    }

}
