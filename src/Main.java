import java.util.Scanner;

public class Main {

    public static int getSumStairs(int[] a) {
        int n = a.length;
        int[] b = new int[n + 1];
        int m = b.length;
        for (int i = 1; i < m - 1; i++) {
            b[i] = a[i - 1];
        }
        int count = 0;
        for (int i = 2; i <= n + 1; i++) {
            if (b[i - 2] >= b[i - 1] || (b[i - 2] >= 0 && b[i - 1]>=0)) {
                count += b[i - 2];
            } else {
                count += b[i - 1];
                i++;
            }
        }
        return count + a[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getSumStairs(a));
    }
}