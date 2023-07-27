package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] symbols = {"-", "\\", "(", "@", "?", ">", "&", "%", "/"};
        while (true) {
            String[] inputWords = br.readLine().split("");
            if (inputWords[0].equals("#")) break;
            int n = inputWords.length;
            int ans;
            for (int i = n - 1; i >= 0; i--) {
            }
        }
    }
}
