//2. Scrie un program care afișează următoarele șiruri de numere, după citirea unei valori n de la tastatură:
//
//        Șirul numerelor naturale până la n (inclusiv), începând cu 0, în ordine crescătoare.
//        Șirul numerelor impare până la n (inclusiv), începând cu 1, în ordine crescătoare.
//        Șirul numerelor pare de la n la 0 (inclusiv), în ordine descrescătoare.
//        Toate numerele multiplu de 5 până la n (inclusiv), începând cu 0, în ordine crescătoare.
//        Exemplu, pentru n == 10:
//
//        Console
//        1. 0 1 2 3 4 5 6 7 8 9 10
//        2. 1 3 5 7 9
//        3. 10 8 6 4 2 0
//        4. 0 5 10

package homework_for_and_while;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
//        int i=1;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while(i<=n){
//            i++;
//          if(i%2 == 1) {
//              System.out.print(i + " ");
//          }
//      }
//      while(i>=n){
//          i--;
//          if(i%2 == 0)
//               System.out.print(i+ " ");
//       }
//        while(i<=n){
//            i++;
//            if(i%5 == 0)
//                System.out.print(i);
//        }
//        4. Implementează un modul software care citește de la tastatură următoarele date (în ordine):
//
//        un mesaj (i.e. message): un șir de caractere (ce poate conține spații)
//        un prag valoric (i.e. upperLimit): un număr întreg
//        o valoare de decrementare (i.e. dec): un număr întreg, pozitiv
//        Programul va număra descrescător de la upperLimit (inclusiv) până la 0 (inclusiv) și va afișa la
//        consolă mesajul message urmat de un tab și apoi de valoarea curentă din șir. De asemenea,
//        se mai afișează 2 mesaje speciale: Start counting… la început și respectiv End counting… la sfârșit.
//        Pentru claritate, urmărește și exemplul următor:
//
//        Input
//        Urmatorul numar este:
//        100
//        9
//        Output
//        Start counting...
//        Urmatorul numar este:    100
//        Urmatorul numar este:    91
//        Urmatorul numar este:    82
//        Urmatorul numar este:    73
//        Urmatorul numar este:    64
//        Urmatorul numar este:    55
//        Urmatorul numar este:    46
//        Urmatorul numar este:    37
//        Urmatorul numar este:    28
//        Urmatorul numar este:    19
//        Urmatorul numar este:    10
//        Urmatorul numar este:    1
//        End counting...
        Scanner sc = new Scanner(System.in);
        System.out.println("The next number is:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        while (n >= 1){
            n -= m;
            System.out.println("Current value: " + n);


        }
        System.out.println("End");
    }
            }
