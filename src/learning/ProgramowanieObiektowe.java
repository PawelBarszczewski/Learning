package basic;
/*
public class programowanieObiektowe {
    public static void main(String[] args) {
        /*
            Oobiekty -"pojemniki" do przechowywania zmiennych i funkcji tematycznie ze soba powiazane
                      do dalszego, łatwiejszego uzycia; inaczej, to każdy element, ktory może zostać opisany przez:
                      - Propoerties - właściwość, np kplor, rozmiar
                      - Metody - np włącz, wyłącz

            Klasy - "foremnki" do tworzenia egzemlarzy obiektow; temetyczny opis w jednym miejscu
         */
 /*       Monitor abc = new Monitor();
        abc.szerokosc = 130;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 150;

        System.out.println(abc.szerokosc);
        System.out.println(abc.wysokosc);
        //System.out.println(abc.turnON);



        new Punkt();
        // "new" -> rezerwuje miejsce w pamieci
        // "()" -> wywolaj domyslny konstruktor

        Punkt p = new Punkt(50, 55);
        Punkt p2 = new Punkt(10, 20);

        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        System.out.println("p.y = " + p2.x);
        System.out.println("p.y = " + p2.y);


    }
}

class Monitor {
    int szerokosc = 19;
    int wysokosc = 21;
}

class Punkt {

    Punkt() {
        System.out.println("Wywołano konstruktor domyślny");
        x = 20;
        y = 20;
    }

    Punkt(int pierwszy, int drugi) {
        System.out.println("Wywołano drugi konstruktor => ");
        x = pierwszy;
        y = drugi;
    }

    int x;
    int y;

} */

/*
public class programowanieObiektowe {
    public static void main(String[] args) {

        Test a = new Test();

        a.wypisz("bladadupa", "dupadupadupa");

        Test a2 = new Test();

        a2.wypisz("aneta", "ruchalska");
    }
}

class Test {
    void wypisz(String imie, String nazwisko) {
        System.out.println("Imię: " + imie );
        System.out.println(" Nazwisko: " + nazwisko);
        System.out.println();
    }

}
*/


public class ProgramowanieObiektowe {
    public static void main(String[] args) {
        Test2 b = new Test2();

        double wynik = b.dodaj(6, 4.23);

        System.out.println(wynik);
    }
}

class Test2 {
    int dodaj(int licz1, int licz2) {
        return licz1 + licz2;
    }

    // overload => przeciążąnie metod:
    double dodaj(double licz1, double licz2) {
        return licz1 + licz2;
    }

    int dzielenie(int dziel1, int dziel2) {

        return dziel1 / dziel2;
    }

    double dzielenie(double dziel1, double dziel2) {
        if (dziel2 == 0)
            return 0;

        return dziel1 / dziel2;

    }
}













