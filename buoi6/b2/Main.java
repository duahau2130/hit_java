package hit_java.buoi6.b2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong sinh vien = ");
        n=sc.nextInt();
        ArrayList<Student> hsinh =new ArrayList<Student>(n);
        for(int i = 0 ; i < n ; i++){
            System.out.println("----nhap sinh vien thu " + (i+1) + "----");
            Student sv = new Student();
            sv.input();
            hsinh.add(sv);
        }
        int i = 0;
        for(Student sinhVien : hsinh){
            System.out.println("====Thong tin sinh vien thu " +(i+1) +"====");
            ++i;
            sinhVien.output();
        }

    }
}
