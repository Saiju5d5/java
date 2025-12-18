public class TypeConversionExample {
    public static void main(String[] args) {

        
        System.out.println("=== Implicit Conversion (Widening) ===\n");

        byte b = 10;
        short s = b;       // byte → short
        int i = s;         // short → int
        long l = i;        // int → long
        float f = l;       // long → float
        double d = f;      // float → double
        char c = 'A';
        int ci = c;        // char → int
        long cl = c;       // char → long
        float cf = c;      // char → float
        double cd = c;     // char → double

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("char to int ci = " + ci);
        System.out.println("char to long cl = " + cl);
        System.out.println("char to float cf = " + cf);
        System.out.println("char to double cd = " + cd);

        System.out.println("\n=== Explicit Conversion (Narrowing) ===");

        double dd = 123.456;
        float ff = (float) dd;   // double → float
        long ll = (long) dd;     // double → long
        int ii = (int) dd;       // double → int
        short ss = (short) dd;   // double → short
        byte bb = (byte) dd;     // double → byte
        char cc = (char) ii;     // int → char

        System.out.println("double dd = " + dd);
        System.out.println("double → float ff = " + ff);
        System.out.println("double → long ll = " + ll);
        System.out.println("double → int ii = " + ii);
        System.out.println("double → short ss = " + ss);
        System.out.println("double → byte bb = " + bb);
        System.out.println("int → char cc = " + cc);
    }
}
