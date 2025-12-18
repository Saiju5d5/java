public class CommandLineArgument {
    public static void main(String[] arrr) {
        // args is an array of Strings
        System.out.println("Number of arguments: " + arrr.length);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println("Argument " + i + ": " + arrr[i]);
        }
    }
}
