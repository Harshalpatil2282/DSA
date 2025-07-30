// public class Doubly_LL {

//     Node head;

//     class Node {
//         int data;
//         Node prev;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.prev = null;
//             this.next = null;
//         }

//     }

//     void Insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             newNode.prev = null;
//             newNode.next = null;
//             return;
//         }
//         Node ptr = head;
//         while (ptr.next != null) {
//             ptr = ptr.next;
//         }
//         ptr.next = newNode;
//         newNode.prev = ptr;
//         newNode.next = null;
//     }

//     void InsertFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             newNode.next = null;
//             newNode.prev = null;
//             return;
//         }
//         newNode.next = head;
//         head.prev = newNode;
//         newNode.prev = null;
//         head = newNode;

//     }

//     void deleteFirst() {
//         if (head == null) {
//             System.out.println("List is Empty !");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         head.next.prev = null;
//         head = head.next;

//     }

//     void deleteLast() {
//         if (head == null) {
//             System.out.println("List is Empty !");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         Node ptr = head;
//         while (ptr.next != null) {
//             ptr = ptr.next;
//         }
//         ptr.prev.next = null;

//     }

//     void InsertAfterGivenNode(int target, int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             System.out.println("List is Empty or Not sufficient legth !");
//             return;
//         }
//         if (head.next == null) {
//             if (head.data == target) {
//                 head.next = newNode;
//                 newNode.next = null;
//                 newNode.prev = head;
//                 return;
//             }
//             System.out.println("Target is Not found!");
//             return;
//         }

//         Node ptr = head;
//         while (ptr != null) {
//             if (ptr.data == target) {
//                 ptr.next.prev = newNode;
//                 newNode.next = ptr.next;
//                 ptr.next = newNode;
//                 newNode.prev = ptr;
//                 return;
//             } else {
//                 ptr = ptr.next;

//             }
//         }
//         System.out.println(target + " is not found!");
//     }

//     void display() {
//         if (head == null) {
//             System.out.println("List is Empty !");
//         }
//         Node ptr = head;
//         do {
//             System.out.print(ptr.data + " -> ");
//             ptr = ptr.next;
//         } while (ptr != null);
//         System.out.println("(Null)");
//     }

//     public static void main(String[] args) {
//         Doubly_LL dll = new Doubly_LL();
//         dll.Insert(20);
//         dll.InsertFirst(10);
//         dll.Insert(30);
//         dll.Insert(40);
//         dll.InsertAfterGivenNode(30, 35);
//         dll.InsertAfterGivenNode(20, 25);

//         dll.display();
//         dll.deleteFirst();
//         dll.display();
//         dll.deleteLast();
//         dll.display();
//     }
// }

public class Doubly_LL{
    Node head = null;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    void insertLast(int data){
        Node NewNode = new Node(data);
        if(head==null){
            head = NewNode;
            NewNode.next = null;
            NewNode.prev = null;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = NewNode;
        NewNode.prev = ptr;
        NewNode.next = null;
    }
    void insertfirst(int data){
        Node NewNode = new Node(data);
        if(head ==null){
            head = NewNode;
            NewNode.prev = null;
            NewNode.next = null;
            return;
        }
        NewNode.next = head;
        head.prev = NewNode; 
        head = NewNode;
        
    }
    void display(){
        System.out.println("Doubly Linked List :");
        if(head == null){
            System.out.println("Doubly Linked list is empty!");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        Doubly_LL dll = new Doubly_LL();
        dll.insertLast(10);
        dll.insertLast(50);
        dll.insertfirst(20);
        dll.insertfirst(30);
        dll.display();
    }
}
