public class LL {

    Node head = null;
    int count = 0;

    class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    void FirstAdd(int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        count++;
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    void removeFirst() {
        if (head == null) {
            System.out.println("Empty List! ");
            return;
        }
        head = head.next;
        count--;
    }

    void removeLast() {
        if (head == null) {
            System.out.println("Empty List! ");
            return;
        }
        count--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;

        }
        currNode.next = null;
    }

    void removeBeforeNode(int target) {
        if (head == null || head.next == null || head.next.data == target) {
            System.out.println("No node exists before the target or List too short!");
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next = head.next;

        while (next != null && next.data != target) {
            prev = curr;
            curr = next;
            next = next.next;
        }

        if (next == null) {
            System.out.println("Target not found in the list.");
            return;
        }

        // Delete node before target
        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
        }
        count--;
        System.out.println("Node before " + target + " removed.");
    }

    void search(int target) {
        if (head == null) {
            System.out.println("Empty Liked List! ");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            if (ptr.data == target) {
                System.out.println(target + " found in linked List.");
                break;
            }
            ptr = ptr.next;
        }

    }

    void display() {
        if (head == null) {
            System.out.println("Empty Linked list !");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("Null");
    }

    int getSize() {
        return count;
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.FirstAdd(4);
        l.FirstAdd(6);
        l.addLast(6);
        l.addLast(8);
        l.search(8);
        System.out.println("Size of Linked List: " + l.getSize());
        l.display();
        l.removeLast();
        System.out.println("Size of Linked List: " + l.getSize());
        l.removeBeforeNode(8);
        l.display();
        l.removeFirst();
        System.out.println("Size of Linked List: " + l.getSize());
        l.display();

    }
}
