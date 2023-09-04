package hit_java.buoi6.b1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("----nhap thong tin con cho----");
        dog.Input();
        Cat cat = new Cat();
        System.out.println("----nhap thong tin con meo----");
        cat.Input();
        System.out.println("====Thong tin con cho====");
        dog.Output();
        dog.tiengKeu();
        System.out.println("====Thong tin con meo====");
        cat.Output();
        cat.tiengKeu();

    }
}
