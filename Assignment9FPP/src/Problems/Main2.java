package Problems;


    public class Main2 {
        public static void main(String[] args) {
            LinkedStack stack = new LinkedStack();

            stack.push(5);
            stack.push(10);
            stack.push(15);

            System.out.println("Peek: " + stack.peek()); // Should print 15

            System.out.println("Pop: " + stack.pop()); // Should print 15
            System.out.println("Pop: " + stack.pop()); // Should print 10

            System.out.println("Is Empty: " + stack.isEmpty()); // Should print false
        }
    }

