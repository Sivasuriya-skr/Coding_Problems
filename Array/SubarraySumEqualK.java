import java.util.*;

class Solution {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hm.containsKey(sum - k)) {
                count += hm.get(sum - k);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum = " + k + " is: " + result);
    }
}