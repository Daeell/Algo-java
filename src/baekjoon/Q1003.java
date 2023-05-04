package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        int[] testcases = input();
        output(testcases);
    }

    static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] testcases = new int[t];

        for (int i = 0; i < t; i++) {
            testcases[i] = Integer.parseInt(br.readLine());
        }

        return testcases;
    }

    static void output(int[] testcases) {
        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int testcase : testcases) {
            System.out.println(dp[testcase][0] + " " + dp[testcase][1]);
        }
    }
}
