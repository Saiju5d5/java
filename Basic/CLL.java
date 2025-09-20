class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            tail = n1;
            n1.next = head;
        } else {
            tail.next = n1;
            tail = n1;
            tail.next = head;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
}
public class CLL{
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  
    }
}
