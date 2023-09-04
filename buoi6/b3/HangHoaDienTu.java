package hit_java.buoi6.b3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;

    public HangHoaDienTu() {
    }

    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap thoi gian bao hanh hang hoa dien tu = ");
        thoiGianBaoHanh=sc.nextInt();
        System.out.println("Nhap cong suat hang hoa dien tu = ");
        congSuat=sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thoi gian bao hanh = " + thoiGianBaoHanh);
        System.out.println("Cong suat = " +congSuat);
    }
}
