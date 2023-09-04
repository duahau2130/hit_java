package hit_java.buoi6.b1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cat extends Animal{
    private String color;
    private String soThich;
    private String bietDanh;

    public Cat() {
    }

    public Cat(String name, Byte age, float weight, String color, String soThich, String bietDanh) {
        super(name, age, weight);
        this.color = color;
        this.soThich = soThich;
        this.bietDanh = bietDanh;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mau long = ");
        color=sc.nextLine();
        System.out.println("nhap so thich = ");
        soThich=sc.nextLine();
        System.out.println("nhap biet danh = ");
        bietDanh=sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Mau long = " + color);
        System.out.println("So thich = " + soThich);
        System.out.println("Biet danh = " +bietDanh);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Con meo keu meo meo!!!");
    }
}
