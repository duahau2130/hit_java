package hit_java.buoi6.b1;

import java.util.Scanner;

public class Dog extends Animal{
    private String character;

    public Dog() {
    }

    public Dog(String name, Byte age, float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Nhap tinh cach = ");
        character= sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Tinh cach = " + character);
    }

    @Override
    public void tiengKeu() {
        System.out.println("con cho keu gau gau!!");
    }
}
