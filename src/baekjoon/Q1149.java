package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1149 {
    public static void main(String[] args) throws IOException {
        int[][] houses = input();
        output(houses);
    }

    static int[][] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] houses = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] inputStrings = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                houses[i][j] = Integer.parseInt(inputStrings[j]);
            }
        }
        return houses;
    }

    static void output(int[][] houses){
        int n = houses.length;
        int[][] dp = new int[n][3];

        for (int i = 0; i < 3; i++) {
            dp[0][i] = houses[0][i];
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = houses[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = houses[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = houses[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
    }
}
