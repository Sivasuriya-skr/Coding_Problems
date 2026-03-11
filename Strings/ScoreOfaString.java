

import java.util.Scanner;

class ScoreOfaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int sum = 0;

        for(int i = 1; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        System.out.println("Score of the string: " + sum);

        sc.close();
    }
}
