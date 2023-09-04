package hit_java.buoi6.b1;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected Byte age;
    protected float weight;

    public Animal() {

    }

    public Animal(String name, Byte age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten = ");
        name = sc.nextLine();
        System.out.println("nhap tuoi = ");
        age=sc.nextByte();
        System.out.println("nhap can nang = ");
        weight=sc.nextFloat();
    }
    public void Output(){
        System.out.println("Ten = " + name);
        System.out.println("Tuoi = " +age );
        System.out.println("Can nang = " + weight + " kg");
    }
    public void tiengKeu(){
        System.out.println("....");
    }
}
