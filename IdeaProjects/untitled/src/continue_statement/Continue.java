package continue_statement;

public class Continue {
    public static void main(String[] args) {
        int n = 100;
        while (n >= 0) {
            if (n % 5 != 0) {
                n--;
                continue;
            }

            System.out.print(n + " ");
            n--;
        }
        System.out.println();
    }
}
