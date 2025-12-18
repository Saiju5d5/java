public class Example {
    public static void main(String[] args) {
        String validNumber = "123";
        String invalidNumber = "abc";

        try {
            // This works fine
            int num1 = Integer.parseInt(validNumber);
            System.out.println("Valid number: " + num1);

            // This will throw NumberFormatException
            int num2 = Integer.parseInt(invalidNumber);
            System.out.println("This line will not execute");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after exception.");
    }
}
