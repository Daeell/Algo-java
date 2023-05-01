package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10817 {
    public static void main(String[] args) throws IOException {
        int[] inputValues = input();
        output(inputValues);
    }

    static int[] input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrings = br.readLine().split(" ");
        int[] inputValues = new int[inputStrings.length];

        for (int i = 0; i < inputStrings.length; i++) {
            inputValues[i] = Integer.parseInt(inputStrings[i]);
        }
        return inputValues;
    }

    static void output(int[] inputValues) {
        Arrays.sort(inputValues);
        System.out.println(inputValues[1]);
    }
}
