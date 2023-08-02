package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q1026 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sumNum = 0;
        String[] ANums = br.readLine().split(" ");
        String[] BNums = br.readLine().split(" ");
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(ANums[i]);
            B[i] = Integer.parseInt(BNums[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            sumNum += A[i] * B[i];
        }

        System.out.println(sumNum);
    }
}
