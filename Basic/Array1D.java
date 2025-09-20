import java.util.Scanner;
public class Array1D
{
 public static void main(String[] args)
 {
 int[] nums = new int[5];
 int sum = 0;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 5 numbers:");
 for (int i = 0; i < nums.length; i++)
 {
 nums[i] = sc.nextInt();
 sum += nums[i];
 }
 System.out.println("Sum: " + sum);
 System.out.println(nums[3]);
 }
}