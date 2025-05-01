// package com.oopsdemo; // Ignore in beginner setup if not using packages

// Interface - abstraction through interface
interface Greetable {
    void greet();
}

// Abstract class - base for inheritance and abstraction
abstract class Person {
    private String name; // Encapsulation
    private int age;

    // Static member
    static String species = "Homo Sapiens";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter - Encapsulation
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Abstract method - must be implemented
    public abstract void display();
}

// Subclass with inheritance, implements interface
class Student extends Person implements Greetable {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); // super()
        this.studentId = studentId; // this
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void display() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentId);
    }

    // Method from interface
    public void greet() {
        System.out.println("Hello! I am a student.");
    }

    // Method Overloading (Compile-time Polymorphism)
    public void greet(String time) {
        System.out.println("Good " + time + ", I am " + getName());
    }
}

// Driver class
public class BegineersDemo {
    public static void main(String[] args) {
        // Static variable
        System.out.println("Species: " + Person.species);

        // Object creation - polymorphism
        Person p = new Student("Ravi", 21, "S123");
        p.display(); // Runtime Polymorphism

        // Typecast to access Student-specific methods
        if (p instanceof Student) {
            Student s = (Student) p;
            s.greet(); // Interface method
            s.greet("Morning"); // Overloaded method
        }
    }
}

