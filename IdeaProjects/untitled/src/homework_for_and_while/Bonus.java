package homework_for_and_while;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Bonus
//        5. Amintește-ți Exercițiul 2 și modul de rezolvare. Dacă pentru afișarea șirurilor ai folosit o
//        instrucțiune condițională (i.e. if) imbricată în structura repetitivă, acest exercițiu este pentru tine!
//        Concret, task-ul tău este să elimini instrucțiunea condițională imbricată în fiecare while,
//        păstrând funcționalitatea anterioară a programului.
//
//                Tips
//        De exemplu, pentru afișarea șirului numerelor impare, există o variantă mai performantă față de
//        cea în care incrementăm iteratorul cu 1 și îi testăm paritatea în vederea afișării.
//        Concret, putem itera direct din 2 în 2, inițializând iteratorul cu 1.
//        Astfel, putem afișa direct valoarea iteratorului, fără a mai fi necesară structura if.
//
//        În plus, programul devine prin această actualizare de 2 ori mai eficient, deoarece va efectua
//        doar jumătate din iterații față de cazul în care incrementăm iteratorul cu 1.
//        Scrie un program care afișează următoarele șiruri de numere, după citirea unei valori n de la tastatură.
//        De această dată, folosește instrucțiunea iterativă for în implementare:
//
//       1 Șirul numerelor naturale până la n (inclusiv), începând cu 0, în ordine crescătoare.
//       2 Șirul numerelor impare până la n (inclusiv), începând cu 1, în ordine crescătoare.
//       3 Șirul numerelor pare de la n la 0 (inclusiv), în ordine descrescătoare.
//       4 Toate numerele multiplu de 5 până la n (inclusiv), începând cu 0, în ordine crescătoare.

//        1
//           for(int i=0;i<=n;i++)
//               System.out.println(i);
//        2
//       for(int i=1;i<=n;i=i+2){
//            System.out.print(i);
//        }
//       3
//        for (int i=n;i>=1;i=i*2)
//            System.out.print(i);
//        4
//        for(int i=0;i<=n;i=i*5)
//            System.out.println(i);
    }

}
