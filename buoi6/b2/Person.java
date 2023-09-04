package hit_java.buoi6.b2;

import java.util.Scanner;

public class Person {
    protected String name;
    protected Byte age;
    protected String address;
    protected Date birthDay;

    public Person() {
    }

    public Person(String name, Byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten = ");
        name=sc.nextLine();
        System.out.println("nhap tuoi = ");
        age=sc.nextByte();
        sc.nextLine();
        System.out.println("dia chi = ");
        address=sc.nextLine();
        birthDay=new Date();
        birthDay.input();
    }
    public void output(){
        System.out.println("Ten = " +name);
        System.out.println("Tuoi = "+age);
        birthDay.output();
        System.out.println("Dia chi = "+address);
    }
}
