package buoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float S = 0;    
        long P = 0, giaiThua = 1;
        System.out.print("nhập n nguyên dương = ");
        do{
            n = sc.nextInt();
            if(n <= 0)
                System.out.println("nhập lại");
        }while(n <=0);

        for(int i = 1; i <= n ; i++)
            S += 1.0 / i;
        System.out.println("S = " +S);

        for(int i = 1; i <= n ; i++){
            giaiThua *= i;
            P += giaiThua;
        }
        System.out.println("P = " + P);
    }
}
