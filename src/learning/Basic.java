package learning;

public class Basic {

/* PODSTAWY BEGIN  {

    public static void main(String[] args) {
        System.out.println("Nowa próba napisania czegokolwiek");
        System.out.println("Juupiii, udało się !!");
    }
}

// przydatne skroty:
// ctrl + alt + L => autoformatowanie kodu
// ctrl + backspace => usuwanie pojedynczego wpisu
// shift + tab => usuniecie wciecia

}
        }
PODSTAWY END */

/*
// OPERATORY_LOGICZNE

    public static void main(String[] args) {
        int a = 5,
                b = 5,
                c = 7;

        if (a != b && c > 5)
            System.out.println("tak");
            System.out.println("nie");


/* true or false
 ! -> negacja
 && -> koniunkcja = "i" => "w tym samym momencie"
    true true - true
    true false - false
    false true - false
    false false - false

 || -> alternatywa => lub / też to
    true true - true
    true false - true
    false true - true
    false false - false
*/


/*    // OINSTRUKCJE_WARUNKOWE => if / else
    public static void main(String[] args) {

        int a = 1,
                b = 2,
                c = 9;

        if (a > b)
            System.out.println("a > b");
        else if (a < b) {
            System.out.println("a < b");
            System.out.println("tak to działa");
        } else
            System.out.println("a = b");
        // if -> wyrażenie
// else -> instrukcja
*/



/*    // OINSTRUKCJE_WARUNKOWE => Switch
    public static void main(String[] args) {
        int a = 50;
        switch (a) {
            case 50:
                System.out.println("a jest równe 50");
                break; // jak spełni się warunek to przerywa sprawdzanie warunku
            case 100:
                System.out.println("a jest równe 100");
                break;
            default:
                System.out.println("a nie jest równe " + a);
        }
// przy Switch nie można porównać: double, String a jedynie Ineteger oraz Char
// Powinieneś używać instrukcji warunkowej switch tylko wtedy, gdy masz wiele warunków do sprawdzenia. Dlaczego?
//Ponieważ switch w takim wypadku zwiększa czytelność kodu.
*/


    /*    // WyrażenieWarunkowe
        public static void main(String[] args) {

            int a = 4;
            if (a % 2 == 0)
                System.out.println("parzysta");
            else
                System.out.println("nieparzysta");

            // lub taki zapis:

            int x = 4;
            String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
         // wyrażenie ? co ma się stać jak prawda : co ma się stać jak fałsz
            System.out.println(czyParzysta);
    */


/*    // Tablice jednowymiarowe

    public static void main(String[] args) {

//        ---------------------------------------------------------
//        tablica[0] tablica[1] tablica[2] tablica[3] tablica[4]
//        ---------------------------------------------------------

        //int[] tablica = new int[4]
        //tablica = new int[4];
        int[] tab2 = {2, 4, 15, 13, 547};

        System.out.println(tab2[1]);
        System.out.println(tab2[tab2.length - 1]); // znajdowanie ostatniego elementu tablicy
*/

 /*   // Tablice wielowymiarowe

    public static void main(String[] args) {

/*   --------------------------------------------
        [0][0]  |   [0][1]    |     [0][2]
     --------------------------------------------

     --------------------------------------------
        [1][0]  |   [1][1]    |     [1][2]
     --------------------------------------------

     --------------------------------------------
        [2][0]  |   [2][1]    |     [2][2]
     --------------------------------------------

     --------------------------------------------
        [3][0]  |   [3][1]    |     [3][2]
     --------------------------------------------
*/

    /* zapis taki:
            int[][] tab = new int[4][3];

            tab[0] [0] = 15;
            tab[0] [1] = 25;

            System.out.println(tab[0] [0]);
            System.out.println(tab[0] [1]);
    */
/* lub zapis taki:
        int[][] tab2 = {
                {1, 15, 35},
                {25, 14, 124},
                {13, 17, 19},
                {7, 9, 99}
        };
        System.out.println(tab2[2][1]);
*/
/*    // PĘTLE - do while
    public static void main(String[] args) {
        String[] kursProgramowania =
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "PL/SQL",
                        "SQL Developer",
                        "Enterprise Architect"
                };
        int i = 0;

        // while  (i < 5) //while -> podczas gdy
       /* while (i < kursProgramowania.length) {
            if (i != 8)
                System.out.println(kursProgramowania[i]);
            i++;
        }

        do {
            System.out.println(kursProgramowania[i]);
            i++;
        } while (1 < kursProgramowania.length);
*/
// home_work =>
  /*
    public static void main(String[] args) {
        int[] zabawaLiczbami = {
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150
        };
        int i = 0;
        /*

       // while (i < 9) {
       // System.out.println(zabawaLiczbami[i]);
       // i++;


        do {
            System.out.println(zabawaLiczbami[i]);
            i++;
        } while (i < zabawaLiczbami.length);
        */

    // petla FOR :
 /*   public static void main(String[] args) {
        String[] kursProgramowania =
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "PL/SQL",
                        "SQL Developer",
                        "Enterprise Architect",
                        "Telefonaria"
                };
/*
        //int i = 0;
        // for (INICJALIZACJA ZMIENNYCH; WARUNEK PETLI; CO MA SIE STAC PO WYKONANIU WSZYSTKICH INSTRUKCJI)
        for (int i = 0; i < kursProgramowania.length; i++ )
        {
            System.out.println(kursProgramowania[i]);
        }
*/

// ENHANCED FOR => ulepszona petla for :
/*        // for (typ_tablicy nazwa_petli: nazwa_tablicy)

        for (String myValue : kursProgramowania) {
            System.out.println(myValue); //
        }
*/

// PETLA W PETLI
/*
    public static void main(String[] args) {

        /* na przykladzie tabliczki mnozenia:
         *
        1*1=1 1*2=2 1*3=3 itp
        2*1=2 2*2=4 2*3=6 itp
         */
/*
        for (int o = 1; o <= 10; o++ ) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(a * o + " ");
            }
            System.out.println();
        }
*/

/*    // BREAKE and CONTINUE
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 2)
                // continue; // kontynuuj wykonywanie petli, ale bez ww awrunku i ==4
            break; // zakonczenie wykonywania instrukcji
            System.out.print(i + " ");
        }
*/


    // sumaWartosci
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3, 5};

        int suma = 0;

        // for (int a = 0; a < liczby.length; a++) {

        for (int liczba : liczby) {
            suma += liczba;

        }
        System.out.println(suma);
    }

/*
    // przyklad petli nieskonczonej
    public static void main(String[] args) {
        int i = 0;
        for (; i < 5; ) {
            System.out.println("test");
        }
    }
*/

}






