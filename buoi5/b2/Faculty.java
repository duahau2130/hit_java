package hit_java.buoi5.b2;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x;

    public Faculty() {

    }

    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten khoa = ");
        Name = sc.nextLine();
        System.out.println("nhap ngay/thang/nam vao khoa = ");
        Date = sc.nextLine();
        x = new School();
        System.out.println("nhap ten truong = ");
        x.setName(sc.nextLine());
        System.out.println("nhao ngay/thang/nam vao truong = ");
        x.setDate(sc.nextLine());
    }

    public void Output(){
        System.out.println("Ten khoa = " + getName());
        System.out.println("Ngay vao khoa = " + getDate());
        System.out.println("Ten truong = " + x.getName());
        System.out.println("Ngay vao truong = " + x.getDate());
    }
}
