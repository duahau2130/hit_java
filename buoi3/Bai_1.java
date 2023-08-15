package hit_java.buoi3;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap chieu dai mang = ");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            a[i] = sc.nextInt();
            b[i] = -1;
        }
        for (int i = 0; i < a.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < b.length; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                    b[j] = 0;
                }
            }
            if (b[i] != 0)
                b[i] = cnt;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println("so " + a[i] + " xuat hien " + b[i] + " lan");
            }
        }
    }
}
