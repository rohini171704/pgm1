public class Persontest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        p1.displayInfo();
        System.out.println(); // Line break
        p2.displayInfo();
        System.out.println(); // Line break

        // Compare the two persons
        p1.compareAge(p2);
    }
}
