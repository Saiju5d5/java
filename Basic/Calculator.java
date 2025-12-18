import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2 = s.nextInt();
        System.out.print("Enter the choice[1(Addition)/2(Subtraction)/3(Multiplication0/4(Division)]: ");
        int choice= s.nextInt();
        int result;
        switch(choice){
            case 1:
            result = num1+num2;
            System.out.println("The sum of num1 and num2 is "+result);
            break;
            
            case 2:
            result = num1-num2;
            System.out.println("The subtraction of num1 and num2 is "+result);
            break;
            
            case 3:  
            result = num1*num2;
            System.out.println("The mutliplication of num1 and num2 is "+result);
            break;
            
            case 4:
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The division of num1 and num2 is " + result);
            }
            else {
                System.out.println("Error: Cannot divide by zero.");
             }
            break;
            
            default:
            System.out.println("Invalid Input");
        }
        s.close();
        
    }
}