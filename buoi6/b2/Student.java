package hit_java.buoi6.b2;

import java.util.Scanner;

public class Student extends Person{
    private String id;
    private String lop;
    private String school;

    public Student() {
    }


    public Student(String name, Byte age, String address, Date birthDay, String id, String lop, String school) {
        super(name, age, address, birthDay);
        this.id = id;
        this.lop = lop;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("nhap ma sinh vien = ");
        id=sc.nextLine();
        System.out.println("nhap ten lop = ");
        lop=sc.nextLine();
        System.out.println("nhap ten truong = ");
        school=sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("ID = " + id);
        System.out.println("Lop = " +lop);
        System.out.println("Truong = "+school);

    }
}
