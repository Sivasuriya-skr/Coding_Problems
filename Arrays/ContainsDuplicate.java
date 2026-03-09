package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class ContainsDuplicate {
    



    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = hasDuplicate(nums);

        if(result) {
            System.out.println("Duplicate element found");
        } else {
            System.out.println("No duplicate elements");
        }

        sc.close();
    }
}

