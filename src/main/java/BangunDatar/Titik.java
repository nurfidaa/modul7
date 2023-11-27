package BangunDatar;

public class Titik {
    double x, y;

    Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void tampil() {
        System.out.println("Sisi : (" + x + ", " + y + ")");
    }

    double hitungJarak(Titik t2) {
        return Math.sqrt(Math.pow((t2.x - this.x), 2) + Math.pow((t2.y - this.y), 2));
    }
}
