public class stack {
    int top;
    int arr[];

    stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

        void print() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Stack main called");

        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(40);
        s.push(30);
        s.print();

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        s.print();
    }
}
