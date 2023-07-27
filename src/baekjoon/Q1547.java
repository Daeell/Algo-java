package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ball = 1;
        for (int i = 0; i < n; i++) {
            String[] changeNums = br.readLine().split(" ");
            int numA = Integer.parseInt(changeNums[0]);
            int numB = Integer.parseInt(changeNums[1]);
            if (ball == numA) {
                ball = numB;
            } else if (ball == numB) {
                ball = numA;
            }
        }
        System.out.println(ball);
    }
}
