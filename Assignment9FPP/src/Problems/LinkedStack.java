package Problems;

    public class LinkedStack {
        private Node top;

        public LinkedStack() {
            this.top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int removed = top.data;
            top = top.next;
            return removed;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

