package hit_java.buoi4;

import java.util.Scanner;

public class HCN {
    private float D;
    private float R;

    public HCN(){

    }
    public HCN(float d, float r){
        D = d;
        R = r;
    }
    public float getD() {
        return D;
    }
    public void setD(float d) {
        D = d;
    }
    public float getR() {
        return R;
    }
    public void setR(float r) {
        R = r;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai = ");
        D = sc.nextFloat();
        System.out.print("nhap chieu rong = ");
        R = sc.nextFloat();
    }
    public void veHCN(){
        System.out.println("Hinh chu nhat co chieu dai:" + D + ", chieu rong: " + R + " la:");
        for(int i = 1; i <= D; i++){
            for (int j = 1; j <= R; j++) {
                if (i == 1 || i == D || j == 1 || j == R) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public float chuVi(){
        return (D + R) *2;
    }
    public float dienTich(){
        return D * R;
    }
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        hcn.veHCN();
        System.out.print("chu vi hinh chu nhat =");
        System.out.println(hcn.chuVi());
        System.out.print("dien tich hinh chu nhat =");
        System.out.println(hcn.dienTich());
    }
}


