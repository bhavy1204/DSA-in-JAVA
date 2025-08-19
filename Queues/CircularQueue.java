public class CircularQueue {

    static class Queue {
        int size;
        int rear;
        int front;
        int arr[];

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
            this.rear = -1;
            this.front = -1;
        }

        boolean isFull() {
            return front == (rear + 1) % size;
        }

        boolean isEmpty() {
            return front == -1;
        }

        void enqueue(int data) {
            if (isFull()) {
                System.out.println("queue full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            return;
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue empty");
            }
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front +1) % size;
            }
        }

        void print() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(arr[i]+" ");
                if(i==rear){
                    break;
                }
                i = (i+1) % size;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();

         q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.print();
    }
}
