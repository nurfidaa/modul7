package BangunDatar;

public class SgtSamaSisi extends Titik {
    double sisiSGT;

    SgtSamaSisi(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1);
        this.sisiSGT = hitungJarak(new Titik(x2, y2));
    }

    double hitungLuas() {
        return 0.5 * sisiSGT * 3;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Luas : " + sisiSGT);
    }
}
