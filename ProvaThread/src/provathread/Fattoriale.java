package provathread;

public class Fattoriale extends Thread {

    private double n;

    public Fattoriale(double n) {
        this.n = n;
    }

    public void run() {
        double f = n;
        double i;
        for (i = n; i > 1; i--) {
            f = f * (i - 1);
        }
        System.out.println("IL FATTORIALE DI " + n + " E'" + f);
    }
}
