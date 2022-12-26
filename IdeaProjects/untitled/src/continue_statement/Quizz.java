package continue_statement;

import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {
//  Urmărește cu atenție următoarea secvență de cod. Ce valoare va avea variabila sum la momentul afișării
//  dacă se introduce de la tastatură numărul 29801?
//                Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        while (n > 99) {
//            int lastDigit = n % 10;
//            lastDigit += sum;
//            n /= 10;
//        }
//        System.out.println(sum);
//        ///20
//        Se dă următorul program, care operează cu cifrele unui număr n dat.
//       Ce valoare se va afișa la output în urma rulării programului?
//        int n = 472369;
//        int maxDigit = 0;
//        while (n != 0) {
//            int lastDigit = n % 10;
//            if (lastDigit > maxDigit && lastDigit % 2 == 0) {
//                maxDigit = lastDigit;
//            }
//            n /= 10;
//        }
// Raspunsul este 6
//        System.out.println(maxDigit);

//        Se dă următorul program, care citește de la tastatură un șir de n numere naturale.
//        Ce valoare va avea variabila cnt după ieșirea din instrucțiunea ciclică (i.e. la momentul afișării)
//        dacă se citesc, în ordine, următoarele valori: 6 1 3 0 7 5 8?
                Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente pozitive :");
        int n = sc.nextInt();
        int previousNumber = -1, cnt = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul pozitiv " + (i+1) + "/" + n + ":");
            int crtNumber = sc.nextInt();
            if (crtNumber > previousNumber) {
                previousNumber = crtNumber;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
