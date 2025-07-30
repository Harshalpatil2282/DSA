public class Enqueue_Dequeue {
    int queue[];
    int front;
    int rear;
    int size;
    int temp;

    Enqueue_Dequeue(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full !");
            return;
        }
        if (front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear += 1;
        }
        queue[rear] = item;
        System.out.println(item + " is Enqueued into Queue !");
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty !");
        } else {
            temp = queue[front];
            System.out.println(temp + " Is dequeued from queue !");
            front += 1;

        }
        System.out.println();
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty !");

        } else {
            System.out.print("Queue :");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Enqueue_Dequeue ed = new Enqueue_Dequeue(5);
        ed.enqueue(3);
        ed.enqueue(5);
        ed.enqueue(8);
        ed.enqueue(6);
        ed.enqueue(1);
        ed.enqueue(2);
        ed.display();
        ed.dequeue();
        ed.display();
    }

}
