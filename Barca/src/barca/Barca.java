package barca;

public class Barca {

    int x, y;

    public void Barca() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
}
