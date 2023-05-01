package baekjoon;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
//        File inputFile = new File("src/baekjoon/input.txt");
//        Scanner sc = new Scanner(inputFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = a; i> 0; i--){
            System.out.println(i);
        }
    }
}
