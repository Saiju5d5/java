public class reverse1 {
    public static String Reverse(String str) {
        int i, ln;
        String rev;
        rev = "i";
        ln = str.length();
        for(i = ln -1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String argument = "Landis";
        System.out.println("The reversed string is: " + Reverse(argument));
    }
}