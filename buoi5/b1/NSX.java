package hit_java.buoi5.b1;

import java.util.Scanner;

public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public NSX() {

    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        this.MaNSX = maNSX;
        this.TenNSX = tenNSX;
        this.DcNSX = dcNSX;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String dcNSX) {
        DcNSX = dcNSX;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma NSX = ");
        MaNSX = sc.nextLine();
        System.out.println("nhap ten NSX = ");
        TenNSX = sc.nextLine();
        System.out.println("nhap dia chi NSX = ");
        DcNSX = sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma NSX = " + getMaNSX());
        System.out.println("Ten NSX = " + getTenNSX());
        System.out.println("Dia chi NSX = "+ getDcNSX());
    }
}
