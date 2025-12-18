import java.util.Scanner;
public class BuyAndSellStock {
    public static int maxProfit(int[] prices){
        int Buy_value = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0;i<=prices.length-1;i++){
            if(prices[i]<Buy_value){
                Buy_value = prices[i];
            } else if(prices[i]-Buy_value > max_profit){
                max_profit = prices[i]-Buy_value;
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of days : ");
        int n = s.nextInt();

        int[] prices = new int[n];
        for(int i=0;i<prices.length;i++){
            System.out.print("Price of day " +(i+1)+" : ");
            prices[i] = s.nextInt();
        }

        int result = maxProfit(prices);
        System.out.println("Maximum profit is "+result);
    }
}
