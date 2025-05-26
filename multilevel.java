// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// First derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second derived class (inherits from Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class to test the inheritance chain
public class multilevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // from Puppy
    }
}
