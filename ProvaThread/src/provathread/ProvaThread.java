package provathread;

public class ProvaThread {

    public static void main(String[] args) {
        double i;
        for(i=10;i>1;i--){
            Fattoriale f = new Fattoriale(i);
            f.start();
        }
    }
}
