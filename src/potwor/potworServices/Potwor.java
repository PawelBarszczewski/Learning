package potwor.potworServices;

public class Potwor {

    public double predkoscChodzenia = 15;
    public double zywotnosc;
    public double typBroni;


    public void atakuj() {

        /*
        /// implementacja metody atakuj - do przygotowania
        */

        System.out.println("to metoda atakuj z klasy Potwor ");

    }

    public Potwor() { // konstruktor

        System.out.println("domyslny konstruktor z klasy potwow");

    }

    public Potwor(double predkoscChodzenia, double zywotnosc) {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        this.typBroni = typBroni;

    }

}
