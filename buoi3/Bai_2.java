package hit_java.buoi3;

import java.util.Scanner;

public class Bai_2 {
    public static int[] chen(int [] a,int k, int x){
        int m = a.length + 1;
        int [] b = new int[m];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        for (int i = m-1; i >k ; i--) {
            b[i] = b[i-1];
        }
        b[k] = x;
        return b;
    }
    public static int[] xoa(int [] a, int k){
        int [] b = new int [a.length-1];
        for (int i = 0; i < k-1; i++) {
            b[i] = a[i];
        }
        for(int i = k; i < a.length-1; i++)
            b[i] = b[i+1];
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,vitri,x;
        System.out.print("nhap so phan tu cua mang = ");
        n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("nhap vi tri can chen,xoa: ");
        vitri=sc.nextInt();
        while(vitri < 0 || vitri >= n){
            System.out.println("vi tri khong hop le! nhap lai");
            vitri = sc.nextInt();
        }
        System.out.print("nhap so can chen: ");
        x = sc.nextInt();
        a = chen(a,vitri,x);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
