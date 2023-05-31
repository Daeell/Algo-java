package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();
            if (num.equals("0")) {
                break;
            }
            if (isPalin(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        br.close();
    }

    static Boolean isPalin(String num) {
        int length = num.length();
        for (int i = 0; i < length / 2 ; i++) {
            if (num.charAt(i) != num.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
