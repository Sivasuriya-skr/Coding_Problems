import java.util.*;

class Solution {

    public static int lengthOfLastWord(String s) {

        s = s.trim();   // remove leading and trailing spaces

        String str[] = s.split(" ");

        int n = str.length - 1;

        return str[n].length();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}