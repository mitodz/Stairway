import java.util.Scanner;

public class Main {

    public static int getSumStairs(int[] a) {
        int n = a.length;
        int[] b = new int[n + 2];
        int m = b.length;
        for (int i = 1; i < m - 1; i++) {
            b[i] = a[i - 1];
        }
        int count = 0;
        if (n == 2 && a[0]<0) return count;
        if (n==2) return a[0] + a[1] > a[1] ?a[1] + a[0] :a[0];
        for (int i = 2; i < n; i++) {
            if (count + b[i - 1] < count + b[i]) {
                count += b[i];
                i++;
            } else
                count += b[i - 1];
        }
        return count + b[n];
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