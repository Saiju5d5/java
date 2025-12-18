import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] subjects = {"English", "Nepali", "Mathematics", "Physics", "Chemistry"};
        int total = 0;
        s.close();

        for (String subject : subjects) {
            System.out.print("Enter the marks of " + subject + ": ");
            total += s.nextInt();
        }
        System.out.println("Total marks is "+total);
        float perc = (total/5);
        System.out.println("percentage is "+perc);
        if(perc>=90){
            System.out.println("Grade A");
        }
        else if(perc>=80){
            System.out.println("Grade B");
        }
        else if(perc>=70){
            System.out.println("Grade C");
        }
        else if(perc>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
