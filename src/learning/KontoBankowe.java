package learning;

public  class KontoBankowe {
    public static void main(String[] args) {
        /*
        enkapsulacja (hermetyzacja) ->  pakowanie wlasciwosci w taki sposob, aby
                                        nie bylo do nich bezposredniego dostepu z innych klas
        */

        KontoBank oszczednosciowe = new KontoBank();

        if (oszczednosciowe.wyplac(5590)) {
            System.out.println("kasiura wyplacona");
        } else
            System.out.println("Za malo masz hajsu leszczu xD");

        System.out.println();

        if (oszczednosciowe.wplac(2050)) {
            System.out.println("saldo po wplacie: "+ oszczednosciowe.getBalance());
        };


        // System.out.println(oszczednosciowe.getBalance());
    }
}

class KontoBank {

    public KontoBank() {
        balance = 1000;
    }

    private int balance;

    int getBalance() {
        return balance;
    }

    private boolean setBalance(int balance) {
        this.balance = balance;
        return true;
        // WARUNKI sprawdzajace poprawnosc =>

        //return true;
    }

    boolean wyplac(int ile) {

        if (balance < ile)
            return false;
        else
            setBalance(balance - ile);
        return true;
    }

    boolean wplac(int ile) {

        setBalance(balance + ile);
        return true;

    }

}