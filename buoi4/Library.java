package hit_java.buoi4;

import java.util.Scanner;

public class Library {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Library() {

    }

    public Library(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma sach: ");
        maSach = sc.nextLine();
        System.out.println();
        System.out.print("Ten sach: ");
        tenSach = sc.nextLine();
        System.out.println();
        System.out.print("Tac gia: ");
        tenTacGia = sc.nextLine();
        System.out.println();
        System.out.print("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.println();
        System.out.print("Nam xuat ban: ");
        namXuatBan = sc.nextInt();
    }

    public void xuat(){
        System.out.printf("%-15s %-30s %-30s %-20s %-15s ", maSach, tenSach, tenTacGia, nhaXuatBan, namXuatBan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library []thuVien = new Library[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach thu " + (i+1));
            thuVien[i] = new Library();
            thuVien[i].nhap();
        }
        System.out.printf("%-15s %-30s %-30s %-20s %-15s ","Ma Sach", "Ten sach", "Tac gia", "Nha Xuat Ban", "Nam xuat ban");
        for (int i = 0 ; i < 5 ; i++){
            System.out.println();
            thuVien[i].xuat();
        }
    }

}
