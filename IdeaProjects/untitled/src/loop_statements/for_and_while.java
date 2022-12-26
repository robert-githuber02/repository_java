package loop_statements;

public class for_and_while {
    public static void main(String[] args) {
//    int printTimes = 5;
//    int currentPrintNumber = 0;
//
//System.out.println("Before the 'while' statement");
//
//while (currentPrintNumber < printTimes) {
//        System.out.println("This message is printing now!");
//    currentPrintNumber++;
//    }
//
//System.out.println("After the 'while' statement");
//        int finalCountdown = 10;
//
//        while (finalCountdown > 0) {
//            System.out.println("Au mai ramas " + finalCountdown + " secunde din 2022!");
//            finalCountdown--;
//        }
//
//        System.out.println("La multi ani 2023!");
        int upperLimit = 20;
        int iterator = 0;

// Iterate on each number
        while (iterator <= upperLimit) {

            if (iterator % 2 == 1) {
                System.out.print(iterator + " ");
            }

            iterator++;
        }
        System.out.println();

// We have to reset the iterator, which
// is now equal to 'upperLimit'
        iterator = 0;

// Iterate (again) on each number
        while (iterator <= upperLimit) {

            if (iterator % 5 == 0) {
                System.out.print(iterator + " ");
            }

            iterator++;
        }
        System.out.println();
}
}
