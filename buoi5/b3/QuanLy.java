package hit_java.buoi5.b3;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy() {

    }

    public QuanLy(String maQL, String hoTen) {
        MaQL = maQL;
        HoTen = hoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma quan ly = ");
        MaQL=sc.nextLine();
        System.out.println("nhap ho va ten = ");
        HoTen=sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma quan ly = " + getMaQL());
        System.out.println("Ho va ten = " +getHoTen());
    }
}
