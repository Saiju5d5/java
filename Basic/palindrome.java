import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String original = s.nextLine();
        String reversed = "";

        int i = original.length() - 1;
        do {
            reversed += original.charAt(i);
            i--;
        } while (i >= 0);

        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
