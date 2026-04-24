
import java.util.*;

// Interface
interface Manageable {
    void show();

    default void message() {
        System.out.println("Default Method");
    }

    static void rules() {
        System.out.println("Student Rules");
    }
}

// Abstract Class
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void display();
}

// Class
class Student extends Person implements Manageable {

    Student(String name, int age) {
        super(name, age);
    }

    // Overriding
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void show() {
        display();
    }

    // Overloading
    void display(String course) {
        System.out.println("Course: " + course);
    }
}

// Main Class
public class Interface{
    public static void main(String[] args) {

        Student s = new Student("Rahul", 20);

        s.show();
        s.display("BCA");

        s.message();
        Manageable.rules();
    }
}