import java.util.*;

class Solution {

    public int[] finalPrices(int[] prices) {

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < prices.length; i++)
        {
            while(!st.isEmpty() && prices[st.peek()] >= prices[i])
            {
                int index = st.pop();
                prices[index] -= prices[i];
            }

            st.push(i);
        }

        return prices;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the prices:");
        for(int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.finalPrices(prices);

        System.out.println("Final Prices:");

        for(int x : result)
        {
            System.out.print(x + " ");
        }
    }
}