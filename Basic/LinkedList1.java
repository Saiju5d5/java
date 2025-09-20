class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("First node inserted: " + data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Node inserted at end: " + data);
        }
    }

    void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        SLL linkedlist = new SLL();
        linkedlist.insert(1);
        linkedlist.insert(5);
        linkedlist.insert(10);
        linkedlist.insert(4);
        linkedlist.display(); 
    }
}
