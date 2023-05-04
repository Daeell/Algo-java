package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2920 {
    public static void main(String[] args) throws IOException {
        int[] numbers = input();
        output(numbers);
    }

    static int[] input() throws IOException {
        int[] numbers = new int[8];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");
        for (int i = 0; i < 8; i++) {
            numbers[i] = Integer.parseInt(inputString[i]);
        }
        return numbers;
    }

    static void output(int[] numbers) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < 8; i++) {
            if (numbers[i] > numbers[i - 1]) descending = false;
            else if(numbers[i] < numbers[i - 1]) ascending = false;
        }

        if (ascending) System.out.println("ascending");
        else if (descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
