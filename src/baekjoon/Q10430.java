package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10430 {
    public static void main(String[] args) throws IOException{
        String[] inputValues = input();
        int a = Integer.parseInt(inputValues[0]);
        int b = Integer.parseInt(inputValues[1]);
        int c = Integer.parseInt(inputValues[2]);

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

    static String[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().split(" ");
    }
}
