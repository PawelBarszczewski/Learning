package potwor;

import potwor.potworServices.Potwor;
import potwor.potworServices.Szkielet;
import potwor.potworServices.Zombie;

public class Main {

    public static void main(String[] args) {
        // POTWOR -> klasa glowna / superklasa

        Potwor p = new Potwor(10, 100);
        Szkielet s = new Szkielet(20, 70);
        Zombie z = new Zombie(15, 90);

        System.out.println("zywotnosc potwora: " + p.zywotnosc);
        System.out.println("zywotnosc szkieletu: " + s.typBroni);
        System.out.println("zywotnosc szkieletu: " + z.zywotnosc);

    }

}
