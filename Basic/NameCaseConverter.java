import java.util.Scanner;

public class NameCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (name.equals(name.toLowerCase())) {
            System.out.println("Converted to UPPERCASE: " + name.toUpperCase());
        } else if (name.equals(name.toUpperCase())) {
            System.out.println("Converted to lowercase: " + name.toLowerCase());
        } else {
            // Mixed case
            System.out.println("Input is in mixed case. Converting each character:");
            String converted = "";
            for (char ch : name.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    converted += Character.toUpperCase(ch);
                } else {
                    converted += Character.toLowerCase(ch);
                }
            }
            System.out.println("Toggled case: " + converted);
        }

        sc.close();
    }
}
