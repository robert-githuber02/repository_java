package teme;

import java.util.Scanner;

public class Teme_subprograme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(odd(m,n));
    }

    public static boolean odd(int m, int n) {
        int i, k = 0;
        for (i = m; i <= n; i++) {
            if (i % 2 == 1) {
                k++;
                System.out.println(i);
            } else if (k == 5) {
                break;
            }
            return false;
        }
        return true;
    }
}

