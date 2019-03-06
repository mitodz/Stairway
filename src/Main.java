import java.util.Scanner;

public class Main {

    public static int getSumStairs(int[] a) {
        int count = 0;
        int n = a.length;
        int[] b = new int[n + 2];
        int m = b.length;
        for (int i = 1; i < m - 2; i++) {
            b[i] = a[i - 1];
        }
        for (int i = 2; i <= n + 1; i++) {
            if (b[i]<=0 && b[i-1]<=0 && b[i-2]<=0 && b[i]<=b[i-1]) {
                count += b[i - 1];
                i++;
            } else
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
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//          System.out.println(getSumStairs(a));
        System.out.println(getSumStairs(new int[]{2,-1,-1}));//1
        System.out.println(getSumStairs(new int[]{-100,-1000}));//-1000
        System.out.println(getSumStairs(new int[]{-5,-10,-100,-100,-100}));//-205
        System.out.println(getSumStairs(new int[]{-1,-1,-1}));//-2
        System.out.println(getSumStairs(new int[]{0,0,0,4,6,-5}));//5
        System.out.println(getSumStairs(new int[]{-64,-16,-13,-9,-48}));//-73
        System.out.println(getSumStairs(new int[]{3,4,10,10,0,-6,-10,0}));//21
        System.out.println(getSumStairs(new int[]{-2,-16,-13,-9,-48}));//-63
        System.out.println(getSumStairs(new int[]{1,1,-2,-4,-6,2,2}));//2
        System.out.println(getSumStairs(new int[]{-64,-16,-13,-9,-48}));//-73
        System.out.println(getSumStairs(new int[]{-5, 8, 10, 7, -2, 4}));//29

        System.out.println(getSumStairs(new int[]{1, 2, 3, 4, 6}));//16
        System.out.println(getSumStairs(new int[]{1, 2, -1, 4, 6}));//13)
        System.out.println(getSumStairs(new int[]{1}));//1;
        System.out.println(getSumStairs(new int[]{1,-1}));//0
        System.out.println(getSumStairs(new int[]{-1, 2, 1}));//3
        System.out.println(getSumStairs(new int[]{2, -1, -1}));//1
        System.out.println(getSumStairs(new int[]{-1, -1, -1}));//-2
        System.out.println(getSumStairs(new int[]{ 1, 0, -6, 1}));//2
        System.out.println(getSumStairs(new int[]{ 1, 0, -6, -2}));//-1
        System.out.println(getSumStairs(new int[]{3, 4, 10, 10, 0, -6, -10, 0}));//21
        System.out.println(getSumStairs(new int[]{-5, -4, -3, 0, 0}));//-4
        System.out.println(getSumStairs(new int[]{-1, -4, -3, 0, 0}));//-4
        System.out.println(getSumStairs(new int[]{-2, -4, -3, 0, 0}));//-4 не работает
        System.out.println(getSumStairs(new int[]{-2, -6, -3, 0, 0}));//-5
        System.out.println(getSumStairs(new int[]{-5, 8, 10, 7, -2, 4}));//29
        System.out.println(getSumStairs(new int[]{-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2}));//-12 не работает
        System.out.println(getSumStairs(new int[]{-60,-37,-22,-14,-7,-4,-2,-1}));//-56

    }
}