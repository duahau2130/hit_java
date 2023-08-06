package buoi2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("nhập n nguyên dương = ");
        Scanner sc = new Scanner(System.in);
        int n;
        boolean check = true;

        do{
            n = sc.nextInt();
            if(n <= 0)
                System.out.println("nhập lại");
        }while(n <= 0);

        if(n < 2)
            check = false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }

        if(check == true)
            System.out.println(n + " là số nguyên tố");
        else
            System.out.println(n + " không là số nguyên tố");
    }
    
}
