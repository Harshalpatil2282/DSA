import java.util.Scanner;

class Stack_pop {
    int[] stack;
    int top;
    int size;
    int temp;

    Stack_pop(int capacity) {
        stack = new int[capacity];
        top = -1;
        this.size = capacity;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full !");
        } else {
            top += 1;
            stack[top] = item;
            System.out.println("Item Pushed into the Stack!");
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !");
        } else {
            temp = stack[top];
            top -= 1;
            System.out.println(temp + " Pop from the stack .");
        }

    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            
            System.out.println("Top of the Stack is :" + stack[top]);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.print("Stack is :");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_pop sp = new Stack_pop(100);
        int choice;
        int x;
        char ch;
        do {
            System.out.println("----- Stack Operation is -----");

            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("ENTER YOUR CHOICE :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the item for push into stack :");
                    x = sc.nextInt();
                    sp.push(x);
                    break;
                case 2:
                    sp.pop();
                    break;
                case 3:
                    sp.peek();
                    break;
                case 4:
                    sp.display();
                    break;
                case 5:
                    System.out.println("Exiting from Stack Operation! .....");

                    break;
                default:
                    System.out.println("Please enter the valide Choice !");
            }
            System.out.println("Do you want to continue (Y/N):");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
        System.out.println("Exiting from Stack Operation! .....");
        System.out.println("Thanks for Using Stack Operation !");
        sc.close();

    }
}