package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> charCount = new HashMap<>();
        String wordLine;
        int maxCount = 0;

        while ((wordLine = br.readLine()) != null) {

            for (char c : wordLine.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }
        }

        for (int count : charCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        List<Character> answer = new ArrayList<>();

        for (char c : charCount.keySet()) {
            if (charCount.get(c) == maxCount) {
                answer.add(c);
            }
        }

        Collections.sort(answer);

        for (char c : answer) {
            System.out.print(c);
        }
    }
}

