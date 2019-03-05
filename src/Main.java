import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static int getSumStairs(int[] a) {
        int x,y,z;
        int n = a.length;
        int[] b = new int[n + 2];
        int m = b.length;
        for (int i = 1; i < m - 2; i++) {
            b[i] = a[i - 1];
        }
        int count = 0;
        for (int i = 2; i <= n + 1;i++) {
            x=b[i-2];
            y=b[i-1];
            z=b[i];
            if (y < 0 && x < 0 && z <= y) {
                count += y;
                i++;
            } else
            if (x >= y || x >= 0) {
                count += x;
            } else {
                count += y;
                i++;
            }
        }
        return count + a[n - 1];
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//        System.out.println(getSumStairs(a));
//        System.out.println(getSumStairs(new int[]{2, -1, -1}));//1
        System.out.println(getSumStairs(new int[]{-5, -10, -100, -100, -100}));//-205
//        System.out.println(getSumStairs(new int[]{-100, -1000}));//-1000
//        System.out.println(getSumStairs(new int[]{-1, -1, -1}));//-2
//        System.out.println(getSumStairs(new int[]{0, 0, 0, 4, 6, -5}));//5
//        System.out.println(getSumStairs(new int[]{3, 4, 10, 10, 0, -6, -10, 0}));//21
//        System.out.println(getSumStairs(new int[]{-2, -16, -13, -9, -48}));//-63
//        System.out.println(getSumStairs(new int[]{1, 1, -2, -4, -6, 2, 2}));//2
//        System.out.println(getSumStairs(new int[]{-64, -16, -13, -9, -48}));//-73
    }
}