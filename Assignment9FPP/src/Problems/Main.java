package Problems;

public class Main {
    public static void main(String[] args) {
        prio queue = new prio();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);

        System.out.println("Peek: " + queue.peek()); // Should print 5

        System.out.println("Dequeue: " + queue.dequeue()); // Should print 5
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 10

        System.out.println("Size: " + queue.size()); // Should print 2
    }
}
