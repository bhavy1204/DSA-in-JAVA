public class QueueUsingLL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rear;
    public static Node front;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void deueue(){
        if(rear==null){
            System.out.println("Empty\n");
            return;
        }
        front = front.next;
    }

    public void traverse(){
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.traverse();
        q.deueue();
        q.traverse();
    }
}
