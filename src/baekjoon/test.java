package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputString = br.readLine().split("");
        int sumNum = 0;
        for (int i = 0; i < N; i++) {
            sumNum += Integer.parseInt(inputString[i]);
        }
        System.out.println(sumNum);
    }
}

