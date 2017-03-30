package retta;

public class Retta {

    double a, b, c;

    public Retta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getTipo() {
        if ((a != 0) && (b != 0)) {
            return "Obliqua";

        }
        if (a == 0) {
            return "Orizzontale";
        }
        if (b == 0) {
            return "Verticale";
        }
        return null;
    }

    public boolean appartiene(double x, double y) {
        if ((this.a * x) + (this.b * y) + (this.c) == 0) {
            return true;
        }
        return false;
    }

    public String stampa() {
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
