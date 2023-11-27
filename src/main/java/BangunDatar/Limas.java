package BangunDatar;

public class Limas {
    SgtSamaSisi sgt1, sgt2, sgt3, sgt4;
    Persegi persegi;

    Limas(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        sgt1 = new SgtSamaSisi(x1, y1, x2, y2, x3, y3);
        sgt2 = new SgtSamaSisi(x1, y1, x3, y3, x4, y4);
        sgt3 = new SgtSamaSisi(x1, y1, x4, y4, x2, y2);
        sgt4 = new SgtSamaSisi(x2, y2, x3, y3, x4, y4);
        persegi = new Persegi(x2, y2, x4, y4);
    }

    double hitungLuas() {
        return (4 * sgt1.hitungLuas()) + persegi.hitungLuas();
    }

    void tampil() {
        System.out.println("                       ");
        System.out.println("Nama : Wahyu Nurfida A");
        System.out.println("Nim  : 2211103052");
        System.out.println("                       ");
        System.out.println("====== DATA SEGITIGA =======");
        System.out.println("Point : 1.0 , 2.0 ");
        sgt1.tampil();
        System.out.println("====== DATA LIMAS =======");
        System.out.println("Point : 2.0 , 3.0 ");
        sgt2.tampil();
        System.out.println("====== DATA PERSEGI =======");
        System.out.println("Point : 3.0 , 4.0 ");
        persegi.tampil();
        System.out.println("Luas Permukaan Limas: " + hitungLuas());
        System.out.println("============================");
    }
}
