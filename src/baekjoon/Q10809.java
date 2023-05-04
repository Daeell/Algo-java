package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        String inputString = input();
        output(inputString);
    }

    static String input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    static void output(String inputString) {
        int[] stringArray = new int[26];
        Arrays.fill(stringArray, -1);

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int index = currentChar - 'a';
            if (stringArray[index] == -1) stringArray[index] = i;
        }
        for (int string : stringArray) {
            System.out.print(string + " ");
        }
    }
}
