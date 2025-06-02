package pgm1;

public class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice", 25);

        // Call method to display info
        person1.displayInfo();
    }
}
