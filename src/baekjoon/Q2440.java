package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2440 {
    public static void main(String[] args) throws IOException {
        int n = input();
        output(n);
    }

    static int input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    static void output(int n) {
        for (int i = n; i > 0; i--) {
            String stars = "*".repeat(i);
            System.out.println(stars);
        }
    }
}
