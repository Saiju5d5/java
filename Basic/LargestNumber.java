public class LargestNumber
{
public static void main(String[] args)
{
int[] numbers = {25, 60, 45, 89, 32};
int max = numbers[0];
for (int i = 1; i < numbers.length; i++)
{
if (numbers[i] > max)
{
max = numbers[i];
}
}
System.out.println("Maximum element: " + max);
}
}