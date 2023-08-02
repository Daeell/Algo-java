package baekjoon;

public class Q4673 {
    public static void main(String[] args) {
        int[] intArray = new int[10001];
        for (int i = 1; i < 10001; i++) {
            int dn = getDn(i);
            if (dn < 10000) {
                intArray[dn] = 1;
            }
        }
        for (int i = 1; i < 10000; i++) {
            if (intArray[i] != 1) {
                System.out.println(i);
            }
        }
    }
    static int getDn(int n) {
        int dn = n;
        while (n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
