package finestre1;

import java.util.Scanner;

public class Finestre1 {

    public static void main(String[] args) {
        int i, n, A, B;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserire numero di finestre da creare: ");
            n = input.nextInt();
        } while ((n <= 0) || (n > 20));
        Finestra f;
        A = 0;
        B = 0;
        for (i = 0; i < n; i++) {
            f = new Finestra();
            f.setVisible(true);
            f.setLocation(A, B);
            A = A + 50;
            B = B + 50;
            f.testo.setText("Sono la finestra " + i);
        }
    }
}
