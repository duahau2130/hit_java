package hit_java.buoi5.b1;

import java.util.Scanner;

public class Hang {
    private String MaHang;
    private String TenHang;
    private NSX x;

    public Hang() {

    }

    public Hang(String maHang, String tenHang, NSX x) {
        this.MaHang = maHang;
        this.TenHang = tenHang;
        this.x = x;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma Hang = ");
        MaHang = sc.nextLine();
        System.out.println("nhap ten Hang = ");
        TenHang = sc.nextLine();
        x = new NSX();
        x.Nhap();
    }
    public void Xuat(){
        System.out.println("Ma hang = " + getMaHang());
        System.out.println("Ten hang = " + getTenHang());
        x.Xuat();
    }
}
