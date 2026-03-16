import java.util.*;

class Solution {

    public static int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;
        int max = 0;

        while(right < prices.length)
        {
            int profit = prices[right] - prices[left];

            if(profit > 0)
            {
                max = Math.max(max, profit);
            }
            else
            {
                left = right;
            }

            right++;
        }

        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days:");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for(int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}