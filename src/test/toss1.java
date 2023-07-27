package test;

import java.util.Arrays;

public class toss1 {
    public static void main(String[] args) {
        System.out.println(solution("1451232125", 2));
        System.out.println(solution("313253123", 3));
        System.out.println(solution("12412415", 4));
    }
    static int solution(String s, int n) {
        int[] digits = new int[n];
        int G = -1;
        for (int i = 0; i < s.length() - n + 1; i++) {
            String subString = s.substring(i, i + n);
            boolean[] used = new boolean[n + 1];

            boolean isValid = true;
            for (int j = 0; j < n; j++) {
                int digit = Character.getNumericValue(subString.charAt(j));
                if (digit < 1 || digit > n || used[digit]) {
                    isValid = false;
                    break;
                }
                used[digit] = true;
            }

            if (isValid) {
                int number = Integer.parseInt(subString);
                if (number > G) {
                    G = number;
                }
            }
        }
        return G;
    }
}
