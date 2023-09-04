package hit_java.buoi6.b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap so luong hang hoa = ");
        n = sc.nextInt();
        ArrayList<HangHoaDienTu> hhDT = new ArrayList<HangHoaDienTu>(n);
        ArrayList<HangHoaGiaDung> hhGD = new ArrayList<HangHoaGiaDung>(n);
        
        System.out.println("--------Nhap thong tin hang hoa gia dung---------");
        for(int i = 0 ; i < n ; i++){
            System.out.println("----thong tin hang hoa gia dung" + (i + 1));
            HangHoaGiaDung hhGD1 = new HangHoaGiaDung();
            hhGD1.input();
            hhGD.add(hhGD1);
            System.out.println();
        }

        System.out.println("--------Nhap thong tin hang hoa dien tu---------");
        for (int i = 0 ; i < n ; i++){
            System.out.println("----thong tin hang hoa dien tu" + (i + 1));
            HangHoaDienTu hhDT1 = new HangHoaDienTu();
            hhDT1.input();
            hhDT.add(hhDT1);
            System.out.println();
        }

        System.out.println("========Thong tin cac mat hang========");
        int i = 0;
        System.out.println("---Thong tin hang hoa gia dung----");
        for (HangHoaGiaDung hangGD : hhGD){
            System.out.println("+++++ Mat hang " +(i+1)+ " ++++");
            hangGD.output();
            ++i;
        }

        int j =0;
        System.out.println("...................................................");
        System.out.println("---Thong tin hang hoa dien tu----");
        for (HangHoaDienTu hangDT : hhDT){
            System.out.println("++++ Mat hang "+(j+1) +" ++++");
            hangDT.output();
            ++j;
        }
    }
}
