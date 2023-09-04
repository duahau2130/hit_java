package hit_java.buoi6.b3;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
    private String chucNang;

    public HangHoaGiaDung() {
    }

    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, String chucNang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhap chuc nang cua hang hoa gia dung = ");
        chucNang=sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Chuc nang cua hang hoa gia dung = " +chucNang);

    }
}
