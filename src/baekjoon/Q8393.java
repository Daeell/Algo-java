package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8393 {
    public static void main(String[] args) throws IOException {
        int n = input();
        output(n);
    }

    static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    static void output(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
