package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1, l2, b, p, h;
        float a;
        do {
            System.out.println("Inserire valore primo lato: ");
            l1 = input.nextInt();
            if (l1 <= 0) {
                System.out.println("Il valore inserito non e' valido...");
            }
        } while (l1 <= 0);
        do {
            System.out.println("Inserire valore secondo lato: ");
            l2 = input.nextInt();
            if (l2 <= 0) {
                System.out.println("Il valore inserito non e' valido...");
            }
        } while (l2 <= 0);
        do {
            System.out.println("Inserire valore base: ");
            b = input.nextInt();
            if (b <= 0) {
                System.out.println("Il valore inserito non e' valido...");
            }
        } while (b <= 0);
        do {
            System.out.println("Inserire valore altezza: ");
            h = input.nextInt();
            if (h <= 0) {
                System.out.println("Il valore inserito non e' valido...");
            }
        } while (h <= 0);
        p = l1 + l2 + b;
        a = (b * h) / 2;
        System.out.println("Il perimetro vale: " + p);
        System.out.println("L'area vale: " + a);
    }
}
