package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stOne = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stOne.nextToken());
        int M = Integer.parseInt(stOne.nextToken());
        int[] S = new int[N + 1];
        StringTokenizer stTwo = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stTwo.nextToken());
        }
        for (int j = 0; j < M; j++) {
            StringTokenizer stThree = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stThree.nextToken());
            int end = Integer.parseInt(stThree.nextToken());

            System.out.println(S[end] - S[start-1]);
        }
    }
}
