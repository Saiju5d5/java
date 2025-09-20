import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size of array
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[size];

        // Step 3: Take array elements as input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Optional: Print the array
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
