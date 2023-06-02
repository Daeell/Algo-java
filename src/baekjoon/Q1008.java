package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputValues = br.readLine().split(" ");
        double a = Integer.parseInt(inputValues[0]);
        double b = Integer.parseInt(inputValues[1]);

        System.out.println(a/b);
    }
}
