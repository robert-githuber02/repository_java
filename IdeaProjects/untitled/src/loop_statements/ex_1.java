package loop_statements;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfIterations = sc.nextInt();

        while (numberOfIterations < 1000) {
            System.out.println("This will never end...");
            numberOfIterations++;
        }
    }
}
