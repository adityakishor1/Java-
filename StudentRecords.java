import java.util.Scanner;

// Student class to store student details
class Student {
    int id;
    String name;
    int age;

    // Constructor to initialize student details
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10]; // Array to store 10 students

        try {
            // Taking input for 10 students
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                
                students[i] = new Student(id, name, age);
            }

            // Displaying student records
            System.out.println("\nStudent Records:");
            for (int i = 0; i < 10; i++) {
                students[i].display();
            }

            // Accessing an out-of-bound index to trigger exception
            System.out.println("\nTrying to access an invalid index...");
            students[10].display();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}
