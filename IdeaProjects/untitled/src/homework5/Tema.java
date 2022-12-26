package homework5;

import java.util.Scanner;

public class Tema {
    //        3. Realizează un modul simplu pentru un bancomat, care să asiste utilizatorul în efectuarea unei operațiuni de eliberare numerar.
//        Se vor implementa următoarele etape:
//
//        Verificarea codului PIN:
//        Se citește 1 număr de la tastatură reprezentând pinClient - codul PIN introdus de client și se compară cu un număr stocat intern (i.e. într-o variabilă)
//        de aplicație pinCorect - codul PIN real al cardului. În cazul în care cele două numere coincid, se va afișa mesajul PIN corect
//        și se va trece la etapa următoare. Altfel, bancomatul va afișa mesajul PIN gresit și se va termina.
//                Verificarea sumei cerute: În cazul în care PIN-ul introdus este corect, se va trece la etapa următoare.
//                În cadrul acesteia, se citește de la tastatură 1 număr întreg, suma, ce reprezintă suma pe care clientul dorește să o scoată de la bancomat.
//                În cadrul algoritmului trebuie să existe și soldCont, ce reprezintă suma totală pe care clientul o are în cont.
//                Aceasta poate fi stocată intern (i.e. într-o variabilă). Programul va afișa mesajul Tranzactie in curs de procesare dacă suma dorită nu depășește
//                fondurile și apoi se trece la pasul următor. În caz contrar, programul va afișa mesajul „Fonduri insuficiente pentru realizarea tranzactiei“ și
//                apoi se va termina.
//                Afișarea sumei rămase: Dacă operațiunea s-a realizat cu succes, utilizatorul este întrebat dacă dorește afișarea sumei de bani rămase în cont:
//                Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA). În caz afirmativ, se va afișa un mesaj relevant cu noua valoare.
//                Altfel, programul va afișa un mesaj de rămas bun (ex: Multumim pentru ca ati ales Banca DevBank) și se va termina.
//        Optional:  Follow-up Ex3. Deși modulul implementat anterior funcționează corect, acesta nu tratează o serie de cazuri de eroare,
//        care ar putea ajuta utilizatorul în operarea corespunzătoare a bancomatului. Proiectează și implementează următoarele cazuri de eroare:
//
//        Introducerea unui cod PIN mai lung de 4 cifre.
//                Folosirea valorii suma de 0 RON.
//                Restricționarea sumei de extras la o valoare multiplu de 10.
//        Introducerea unei alte cifre (i.e. diferite de 0 sau 1) la ultimul pas.
//                Te poți gândi și la alte cazuri de eroare? Alege unul dintre acestea și implementează-l.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("The PIN code is:");
    int PIN_code=sc.nextInt();
    int pinCorrect=1234;
        if (PIN_code > 9999) {
        System.out.println("PIN code is higher than 4!");
    }
        if(PIN_code != pinCorrect) {
        System.out.println("Wrong!");
    }
        else {
            System.out.println("Correct!");
            System.out.print("The sum is:");
            int sum = sc.nextInt();
            if (sum == 0) {
                System.out.println("You can't make the transaction because you have not money!");
            }
            if (sum % 10 == 0) {
                System.out.println("You can't make a transaction with a number which is a multiple of 10");
            }
            int soldCont = 1_000_000;
            if (sum > soldCont) {
                System.out.println("Insufficient funds for making the transaction!");
            } else if (sum < soldCont) {
                System.out.println("----------------------------");
                System.out.println("Transaction in progress...");
                System.out.println("----------------------------");
                int soldCont2;
                soldCont2 = soldCont - sum;
                System.out.println("Do you want displaying the new balance of the actual account?[1 for yes / 0 for no]");
                int answer = sc.nextInt();
                if (answer == 0) {
                    System.out.println("Thanks because you chose DevBank!");
                } else if (answer == 1) {
                    System.out.println("The new soldCont is:" + soldCont2);
                } else {
                    System.out.println("Error!");
                }
            }
        }
    }
}
