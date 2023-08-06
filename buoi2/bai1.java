package hit_java.buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n = ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= n ;j++){
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.println("*");
                else   
                    System.out.println(" ");
            }
            System.out.println("\n");
        }
    }
    
}
