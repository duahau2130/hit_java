package hit_java.buoi3;

import java.util.Scanner;

public class Bai_4 {
    public static void ktraChuoi(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi = ");
        String str = sc.nextLine();
        ktraChuoi(str);
        }
    }
}
