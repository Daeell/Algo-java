package baekjoon;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q2741 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/baekjoon/input.txt");
        Scanner sc = new Scanner(inputFile);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}
