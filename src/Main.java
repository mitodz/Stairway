import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n + 1];
        int m = b.length;
        for (int i = 1; i <= m - 1; i++) {
            b[i] = a[i-1];
        }
        for(int i=2; i<=n; i++){
            b[i]+=Math.max(b[i-1], b[i-2]);
        }
        System.out.println(b[n]);
    }
}