public class CircularQueue {
    int[] queue;
    int rear;
    int front;
    int size;
    int temp;

    CircularQueue(int capacity) {
        size = capacity;
        queue = new int[capacity];
        rear = -1;
        front = -1;

    }

    // --------F---------R
    // queue =[2,3,4,5,6,9]
    // F R
    // queue =[2,3,4,5,6,9]
    void Enqueue(int item) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Overflow !");
            return;
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear += 1;

        }
        queue[rear] = item;
        System.out.println(item + " is Enqueue into the Circular Queue !");
    }

    void Dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Underflow !");
            return;
        }
        temp = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front += 1;
        }
        System.out.println(temp + " is Dequeued from Circular Queue! ");
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty :");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.Enqueue(4);
        cq.Enqueue(5);
        cq.Enqueue(6);
        cq.Enqueue(7);
        cq.Dequeue();
        cq.display();
        cq.Enqueue(11);
        cq.display();
    }

}
