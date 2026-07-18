abstract class Animal {

    // Abstract Method
    abstract void sound();

    // Concrete Method
    void sleep() {

        System.out.println("Animal Sleeps");
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog Barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

        d.sleep();
    }
}
