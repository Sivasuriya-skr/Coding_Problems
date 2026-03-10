package Array;

import java.util.*;

class Solution {

    public static int[] replaceElements(int[] arr) {
        int largest = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = largest;
            largest = Math.max(temp, largest);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = replaceElements(arr);

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
