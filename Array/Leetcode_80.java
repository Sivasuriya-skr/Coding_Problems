import java.util.*;

public class Leetcode_80 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;

        int i = 2;

        for(int j = 2; j < nums.length; j++)
        {
            if(nums[j] != nums[i-2])
            {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        int k = removeDuplicates(nums);

        System.out.println("Length: "+k);

        for(int i=0;i<k;i++)
        System.out.print(nums[i]+" ");
    }
}