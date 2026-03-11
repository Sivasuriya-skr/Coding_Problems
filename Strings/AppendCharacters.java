/// Append Characters to String to Make Subsequence
/// problem link: https://neetcode.io/problems/append-characters-to-string-to-make-subsequence/question?list=allNC

import java.util.Scanner;

public class AppendCharacters {

    public static int appendCharacters(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return t.length() - j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        int result = appendCharacters(s, t);

        System.out.println("Minimum characters to append: " + result);

        sc.close();
    }
}