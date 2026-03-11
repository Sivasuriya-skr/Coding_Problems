//length of the last word 
//https://neetcode.io/problems/length-of-last-word/question?list=allNC

import java.util.Scanner;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}