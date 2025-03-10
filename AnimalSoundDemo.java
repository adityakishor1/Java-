import java.util.Scanner;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class AnimalSoundDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal: 1. Dog  2. Cat");
        int choice = scanner.nextInt();

        Animal animal; // Superclass reference

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice! Defaulting to a generic animal.");
            animal = new Animal();
        }

        // Calling overridden method based on user choice
        animal.makeSound();

        scanner.close();
    }
}
