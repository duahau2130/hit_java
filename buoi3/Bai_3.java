package hit_java.buoi3;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap chieu dai cua mang = ");
        n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i <a.length; i++ ){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if (a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println("mang sau khi sap xep tang dan:");
        for (int i = 0 ; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
