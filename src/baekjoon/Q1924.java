package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1924 {
    public static void main(String[] args) throws IOException {
        int[] inputValues = input();
        output(inputValues[0], inputValues[1]);
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

    static void output(int month, int day) {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += months[i];
        }

        totalDays += day;
        totalDays %= 7;

        System.out.println(days[totalDays]);
    }
}
