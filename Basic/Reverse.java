import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of original string : ");
        String original = s.nextLine();
        String reversed = "";
        for(int i = original.length()-1;i>=0;i--){
        
            reversed +=original.charAt(i);
        }
        System.out.print(reversed);
    }
}
