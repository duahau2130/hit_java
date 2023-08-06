package hit_java.buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("phuong trinh bac 4 ax4 + bx2 + c = 0");
        System.out.println("nhap he so a,b,c");
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2,x3,x4,s1,s2,x,x01,x02;

        System.out.print("nhap a = ");
        a = sc.nextDouble();
        System.out.print("nhap b = ");
        b = sc.nextDouble();
        System.out.print("nhap c =");
        c = sc.nextDouble();

        double delta = b*b - 4*a*c;
        s1 = (-b + Math.sqrt(delta)) / (2*a);
        s2 = (-b - Math.sqrt(delta)) / (2*a);
        if(a == 0){
            if(b == 0){
                if(c == 0)
                    System.out.println("phuong trinh co vo so nghiem");
                else
                    System.out.println("phuong trinh vo nghiem");
            }else{
                if( c <= 0){
                    x = c / b;
                    x01 = Math.sqrt(x);
                    x02 = Math.sqrt(x);
                    System.out.println("phuong trinh co hai nghiem");
                    System.out.println("x1 = "+x01);
                    System.out.println("x2 = " + -x02);
                }else
                    System.out.println("phuong trinh vo nghiem");
            }
        }else if (a > 0){
            if(s1 >= 0){
                x1 = Math.sqrt(s1);
                x2 = Math.sqrt(s1);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + -x2);
            }
            if(s2 >= 0){
                x3 = Math.sqrt(s2);
                x4 = Math.sqrt(s2);
                System.out.println("x3 = " + x3);
                System.out.println("x4 = " + -x4);
            }
        }else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
