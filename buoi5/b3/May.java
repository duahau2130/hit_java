package hit_java.buoi5.b3;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {

    }

    public May(String maMay, String tenMay, String tinhTrang) {
        MaMay = maMay;
        TenMay = tenMay;
        TinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        MaMay = maMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        TenMay = tenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma may = ");
        MaMay = sc.nextLine();
        System.out.println("nhap ten may = ");
        TenMay = sc.nextLine();
        System.out.println("nhap tinh trang may = ");
        TinhTrang=sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma may = " + getMaMay());
        System.out.println("Ten may = " + getTenMay());
        System.out.println("Tinh trang may = " +getTinhTrang());
    }
}
