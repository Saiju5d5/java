/* 
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

    // Insert at the end
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

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted at beginning: " + data);
    }

    // Insert at a specific position (1-based index)
    void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Node inserted at position " + position + ": " + data);
    }

    // Delete by value
    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Node with value " + value + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found in the list.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Node with value " + value + " deleted.");
        }
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("Node deleted from beginning: " + head.data);
            head = head.next;
        }
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            System.out.println("Node deleted from end: " + head.data);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Node deleted from end: " + temp.next.data);
        temp.next = null;
    }

    // Search for a value
    void search(int value) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Value " + value + " found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Value " + value + " not found in the list.");
    }

    // Get length of the list
    int getLength() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    // Display the list
    void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

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

        // Basic insertions
        linkedlist.insert(1);
        linkedlist.insert(5);
        linkedlist.insert(10);
        linkedlist.insert(4);

        // Display list
        linkedlist.display();

        // Additional operations
        linkedlist.insertAtBeginning(100);
        linkedlist.insertAtPosition(50, 3);   // Insert at position 3
        linkedlist.display();

        linkedlist.deleteByValue(5);
        linkedlist.deleteAtBeginning();
        linkedlist.deleteAtEnd();
        linkedlist.display();

        linkedlist.search(10);
        linkedlist.search(999);

        System.out.println("Length of linked list: " + linkedlist.getLength());
    }
}*/
