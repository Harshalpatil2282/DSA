public class Stack_push {
    int[] arr;
    int top;
    int size;

    Stack_push(int capacity) {
        arr = new int[capacity];
        size = capacity;
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");

        } else {
            top += 1;
            arr[top] = item;
            System.out.println("Item pushed into stack !");

        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty !");
        } else {
            System.out.println("Stack Elments Are :");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Stack_push SP = new Stack_push(5);
        // SP.push(4);
        // SP.push(5);
        // SP.push(6);
        // SP.push(8);
        // SP.push(7);
        // SP.push(99);
        SP.display();
    }
}