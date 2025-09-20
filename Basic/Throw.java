public class Throw {
    public static void main(String[] args) {
        int age = 19;

        if (age < 18) {
            throw new ArithmeticException("You must be 18 or older to vote.");
        }

        System.out.println("You are eligible to vote.");
    }
}
