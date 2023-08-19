package hit_java.buoi4;

import java.util.Scanner;

public class Student {
    private String maSinhVien;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Student() {

    }

    public Student(String maSinhVien, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
            System.out.print("ma sinh vien: ");
            maSinhVien = sc.nextLine();
            System.out.println();
            System.out.print("ho va ten: ");
            hoTen = sc.nextLine();
            System.out.println();
            System.out.print("diem Ly = ");
            diemLy = sc.nextDouble();
            System.out.println();
            System.out.print("diem Hoa = ");
            diemHoa = sc.nextDouble();
            System.out.println();
            System.out.print("diem Toan = ");
            diemToan = sc.nextDouble();
    }

    double diemTB() {
        return (diemToan + diemLy + diemHoa) * 1.0 / 3;
    }

    public void xuat() {
        System.out.printf("%-15s %-30s %-15s  %-15s  %-15s %-15s", maSinhVien, hoTen, diemLy, diemHoa, diemToan, diemTB());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student []hsinh = new Student[5];
        for(int i = 0; i < 5 ; i++){
            hsinh[i]=new Student();
            System.out.println("Sinh vien thu " + (i+1));
            hsinh[i].nhap();
        }
        System.out.printf("%-15s %-30s %-15s %-15s %-15s %-15s","Ma sinh vien", "Ho va ten", "Diem ly", "Diem Hoa", "Diem Toan", "Diem tbc");
        for(int i = 0; i < 5 ; i++){
            System.out.println();
            hsinh[i].xuat();
        }
    }
}













