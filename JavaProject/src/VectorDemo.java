import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("one");
        vector.add("two");
        vector.add("three");

        System.out.println("Initial vector: ");
        System.out.println(vector);
        System.out.println("Initial vector's size: " + vector.size());

        System.out.println("Vector capacity: " + vector.capacity());

        System.out.println("Adding new elements...");
        vector.add("four");
        vector.add("five");
        vector.add("six");
        vector.add("seven");
        vector.add("eight");
        vector.add("nine");
        vector.add("ten");
        vector.add("eleven");

        System.out.println("Final vector:");
        System.out.println(vector);

        System.out.println("Final vector size: " + vector.size());
        System.out.println("Final vector capacity: " + vector.capacity());
    }
}