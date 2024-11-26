
public class AbstractClass {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {

    void eat() {
        System.out.println("Animal easts");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("walks on four legs");
    }
}

class chicken extends Animal {

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
