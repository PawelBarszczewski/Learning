package potwor.potworServices;

public class Zombie extends Potwor {

    public Zombie() {
        System.out.println("Domyslny konstuktor z klasy szkielet");
    }

    public Zombie(double predkoscChodzenia, double zywotnosc) {
        super(predkoscChodzenia, zywotnosc);
    }
}
