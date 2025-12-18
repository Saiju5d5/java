import java.util.Scanner;

public class WordSearchInParagraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String paragraph = "Java is a high-level, class-based, object-oriented programming language "
                         + "that is designed to have as few implementation dependencies as possible.";

        System.out.println("Paragraph:\n" + paragraph);
        System.out.println("paragraph length is "+paragraph.length());
        System.out.print("\nEnter a word to search: ");
        String word = scanner.nextLine();
        if (paragraph.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("The word \"" + word + "\" exists in the paragraph.");
        } else {
            System.out.println("The word \"" + word + "\" does not exist in the paragraph.");
        }
        scanner.close();
    }
}
