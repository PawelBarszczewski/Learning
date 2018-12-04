package learning;

public class Referencja {                       // referencja - przechowuje tylko adres
    public static void main(String[] args) {

        int a = 5;

        Test x = new Test();
        a = x.zmienWartosc(a);
        System.out.println(a);

        Foo foo = new Foo();
        x.zmienZawartosc(foo);

        System.out.println(foo.y);
    }
}


class Test {
    int zmienWartosc(int zm) {
        zm = zm + 3;
        return zm;

    }

    void zmienZawartosc(Foo zm) {
        zm.y = zm.y + 40;
    }
}

class Foo {
    int y = 20;
}


/*
// porównywanie String:
public class Referencja {
    public static void main(String[] args) {

        String imie = new String("Paweł");
        String imie2 = new String("Paweł");

        if (imie.equals(imie2)) {
            System.out.println("Imiona zgodne");
        } else
            System.out.println("Imiona nie zgodne");

    }
}
*/


/*
// STATYCZNOSC
public class Statyczność {
    public static void main(String[] args) {


        matematyka tst = new matematyka();
        double wyniks = tst.dodj(10, 15);

        // System.out.println(wyniks);

        double wynik = matematyka.dodj(10, 5); // dodając "static" w klasie matematyka, możemy pisać wydajniej (bez konieczności pisania instancji klasy)
        System.out.println(wynik);

        System.out.println(matematyka.PI);

        klient a = new klient("Paweł");
        klient b = new klient("Rafał");
        klient c = new klient("Piotr");
        klient d = new klient("Marek");

        System.out.println(a.id + " " + a.imie);
        System.out.println(b.id + " " + b.imie);
        System.out.println(c.id + " " + c.imie);
        System.out.println(d.id + " " + d.imie);

        System.out.println(klient.natepnyId);
    }
}

class matematyka {
    static final double PI = 3.14;

    static double dodj(double pier, double drug) {
        return pier + drug;
    }
}

class klient {

    klient(String imie) {
        this.imie = imie;
        id = natepnyId;
        natepnyId++;
    }

    String imie;
    int id = 0;
    static int natepnyId = 1;

} */



