
public class SuperKeyword {

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.Color);
    }
}

class Animal {

    String Color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {

    Horse() {
        super.Color = "brown";
        System.out.println("Horse  constructor is called");
    }
}
