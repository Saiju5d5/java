import java.util.Scanner;

interface inter {
    public void print(int x, int y);// does not contain body

    public void display(String c);// does not contain body
}

interface multi {
    default void show() {
        System.out.println("java do not support multi inheritance but it supports interface");
    }
}

class face implements inter, multi {
    public void print(int x, int y)// The body of print() is provided here
    {

        System.out.println("sum is " + (x * y));
    }

    public void display(String c)// The body of display() is provided here
    {

        System.out.println("String: " + c);
    }
}

public class Interface1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer value of a : ");
        int a = s.nextInt();
        System.out.print("Enter the integer value of b : ");
        int b = s.nextInt();
        System.out.print("Enter the String value of d : ");
        String d = s.next();
        face ob = new face();
        ob.print(a, b);
        ob.display(d);
        ob.show();
    }
}