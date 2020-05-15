public class GassStation {

    private int motorina;
    private int benzina;
    private int pretMotorina;
    private int pretBenzina;

    public GassStation(int motorina, int benzina, int pretMotorina, int pretBenzina) {
        this.motorina = motorina;
        this.benzina = benzina;
        this.pretMotorina = pretMotorina;
        this.pretBenzina = pretBenzina;
    }

    public GassStation() {

    }

    public int getMotorina() {
        return motorina;
    }

    public int getBenzina() {
        return benzina;
    }

    public int getPretMotorina() {
        return pretMotorina;
    }

    public int getPretBenzina() {
        return pretBenzina;
    }

    public int vindeMotorina(int motorinaDeVandut) {
        int pretTotal = 0;
        if (motorinaDeVandut < 10) {
            System.out.println("Nu avem motorina in stoc, chemam cisterna");
        } else {
            if (motorinaDeVandut > this.motorina) {
                System.out.println("Nu avem atata motorina");
            }
            this.motorina -= motorinaDeVandut;
            pretTotal = pretMotorina * motorinaDeVandut;
        }
        return pretTotal;
    }

    public int vindeBenzina(int benzinaDeVandut) {
        int pretTotal = 0;
        if (this.benzina < 10) {
            System.out.println("Nu avem benzina in stoc, aducem cisterna");
        } else {
            if (benzinaDeVandut > this.benzina) {
                System.out.println("Nu avem atata benzina");
            }
            this.benzina -= benzinaDeVandut;
            pretTotal = pretBenzina * benzinaDeVandut;
        }
        return pretTotal;
    }

    public String incaseazaBani(int baniIncasati, int pretTotal) {
        if (baniIncasati == pretTotal) {
            return "Multumim! Va mai asteptam!";
        } else if (baniIncasati > pretTotal) {
            return "Multumim! Poftiti restul!" + (baniIncasati - pretTotal);
        } else {
            return "Chem politia!";
        }
    }


}
