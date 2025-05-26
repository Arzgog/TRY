// Class (like a base class)
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Interface
interface Pet {
    void play();
}

// Class that uses both: inherits from Animal and implements Pet
class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays fetch");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to test the hybrid inheritance
public class hybrid {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // From Animal
        dog.play();  // From Pet (interface)
        dog.bark();  // From Dog
    }
}
