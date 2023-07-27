package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int ans;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        if (nums[1] % nums[0] == 0) {
            ans = nums[n - 1] * (nums[1] / nums[0]);

        } else {
            ans = nums[n - 1] + (nums[1] - nums[0]);
        }
        System.out.println(ans);
    }
}
