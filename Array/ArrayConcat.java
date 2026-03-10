package Arrays;

import java.util.Scanner;

class ArrayConcat {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int newarr[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            newarr[i] = nums[i];
            newarr[n + i] = nums[i];
        }

        return newarr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = getConcatenation(nums);

        System.out.println("Concatenated Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
