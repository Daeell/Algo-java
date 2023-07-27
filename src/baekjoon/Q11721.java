package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = br.readLine();
        int inputLength = inputValue.length();
        StringBuilder outputValue = new StringBuilder();

        for (int i = 0; i < inputLength; i++) {
            outputValue.append(inputValue.charAt(i));
            if ((i + 1) % 10 == 0 && i + 1 != inputLength) {
                outputValue.append("\n");
            }
        }
        System.out.println(outputValue);
    }
}
