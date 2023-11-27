package BangunDatar;

public class Persegi extends Titik {
    double sisiPSG;
    Persegi(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.sisiPSG = hitungJarak(new Titik(x2, y2));
    }
    double hitungLuas() {
        return sisiPSG * sisiPSG;
    }
    void tampil() {
        super.tampil();
        System.out.println("Sisi Persegi: " + sisiPSG);
    }
}
