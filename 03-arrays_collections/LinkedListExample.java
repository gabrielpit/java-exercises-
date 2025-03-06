import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Linked List: " + names);

        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
    }
}
