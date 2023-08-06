package buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("phuong trinh bac 4 ax4 + bx2 + c = 0");
        System.out.println("nhap he so a,b,c = ");
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2;
        double delta = b*b - 4 * a * c;
        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0){
            System.out.println("phuong trinh co nghiem");
        }

    }
    
}
