package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sec = 0;
        int minNum = 1;
        while (n > 0) {
            if (n - minNum >= 0) {
                n -= minNum;
            } else {
                minNum = 1;
                n -= minNum;
            }
            minNum++;
            sec++;
        }
        System.out.println(sec);
    }
}
