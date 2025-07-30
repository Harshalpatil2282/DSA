public class Circular_LL {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Insert(int data) {
        Node NewNode = new Node(data);
        if (head == null) {

            head = NewNode;
            NewNode.next = head;
            return;
        }
        Node ptr = head;
        while (ptr.next != head) {
            ptr = ptr.next;
        }
        ptr.next = NewNode;
        NewNode.next = head;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }
        head = head.next;
        tail.next = head;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node tail = head;
        Node prev = head;
        while (tail.next != head) {
            prev = tail;
            tail = tail.next;
        }

        prev.next = head;

    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node ptr = head;
        do {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        } while (ptr != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Circular_LL cll = new Circular_LL();
        cll.Insert(10);
        cll.deleteLast();
        cll.Insert(20);
        cll.Insert(30);
        cll.Insert(40);
        cll.display();
        cll.deleteFirst();
        cll.deleteLast();
        cll.display();

    }

}
