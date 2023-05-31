package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] vowels = {"a", "e", "i", "o", "u"};

        while (true) {
            String words = br.readLine();
            if (words.equals("#")) break;
            int cnt = 0;
            for (char c : words.toCharArray()) {
                if (isVowel(Character.toLowerCase(c), vowels)) cnt++;
            }
            System.out.println(cnt);
        }
    }

    static Boolean isVowel(char c, String[] vowels) {
        for (String vowel : vowels) {
            if (vowel.charAt(0) == c) return true;
        }
        return false;
    }
}
