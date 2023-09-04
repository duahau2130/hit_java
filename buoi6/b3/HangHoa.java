package hit_java.buoi6.b3;

import java.util.Scanner;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected float soLuong;
    protected float donGia;
    protected VatLieu[] dsVL;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public VatLieu[] getDsVL() {
        return dsVL;
    }

    public void setDsVL(VatLieu[] dsVL) {
        this.dsVL = dsVL;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hang = ");
        maHang=sc.nextLine();
        System.out.println("nhap ten hang = ");
        tenHang=sc.nextLine();
        System.out.println("nhap so luong hang =");
        soLuong=sc.nextFloat();
        System.out.println("nhap don gia hang =");
        donGia=sc.nextFloat();
        int n = (int) soLuong;
        dsVL = new VatLieu[n];
        for(int i = 0 ; i < n ; i ++){
            System.out.println("----nhap vat lieu thu " +(i+1) + "----");
            dsVL[i] = new VatLieu();
            dsVL[i].nhap();
        }
    }
    public void output(){
        System.out.println("Ma hang = " + maHang);
        System.out.println("Ten hang = " + tenHang);
        System.out.println("So luong hang = " + soLuong);
        System.out.println("Don gia hang = " + donGia);
        int n = (int) soLuong;
        for(int i = 0 ; i < n ; i++){
            System.out.println("====Thong tin vat lieu thu " +(i+1) + "====");
            dsVL[i].xuat();
        }
        System.out.println("Tong tien = " + tongTien());
    }

    public float tongTien(){
        return soLuong * donGia;
    }
}
