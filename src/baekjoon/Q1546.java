package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputString = br.readLine().split(" ");
        int[] points = new int[N];
        int sumV = 0;

        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(inputString[i]);
            sumV += points[i];
        }

        Arrays.sort(points);
        int M = points[N - 1];

        double answer = (double) sumV / M * 100 / N;

        System.out.println(answer);

    }
}
