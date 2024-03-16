package Problems;

public class prio {

        private int[] arr = new int[10];
        private int front = -1;
        private int rear = 0;

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        public void enqueue(int obj) {
            if ((rear + 1) % arr.length == front) {
                resize();
            }
            arr[rear] = obj;
            rear = (rear + 1) % arr.length;
            if (front == -1) {
                front = 0;
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int removed = arr[front];
            front = (front + 1) % arr.length;
            if (front == rear) {
                front = -1;
                rear = 0;
            }
            return removed;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public int size() {
            if (isEmpty()) {
                return 0;
            }
            if (rear > front) {
                return rear - front;
            } else {
                return arr.length - front + rear;
            }
        }

        private void resize() {
            int[] newArr = new int[arr.length * 2];
            int i = 0;
            while (!isEmpty()) {
                newArr[i++] = dequeue();
            }
            front = 0;
            rear = i;
            arr = newArr;
        }
    }




