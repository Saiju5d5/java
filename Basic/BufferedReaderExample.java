import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // Always returns String

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());  // Need to parse manually

        System.out.println("Hello " + name + ", Age: " + age);
    }
}
