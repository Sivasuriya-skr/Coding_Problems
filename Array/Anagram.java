package Array;

import java.util.Scanner;

class Anagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];
        int freq2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        sc.close();
    }
}