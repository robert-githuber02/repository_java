package loop_statements;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Introduceti numarul de elemente:");
//        int n = sc.nextInt();
//        int oddNumbers = 0; // number of odd numbers
//        for (int i = 0; i < n; i++) {
//            System.out.println("Introduceti numarul " + (i+1) + "/" + n + ":");
//            int crtNumber = sc.nextInt();
//
//            // test if the number is odd
//            if (crtNumber % 2 == 1) {
//                oddNumbers++;
//        System.out.println("Numarul de numere impare: " + oddNumbers);
//        System.out.println("Numarul de numere pare: " + (n - oddNumbers));
//        1. Implementează un algoritm care citește de la tastatură un număr natural n și un mesaj,
//        care poate conține spații. Programul va afișa mesajul de n ori,
//        fiecare afișare pe câte o linie nouă și însoțită de numărul curent, ca în exemplul următor:
//
//        Console
//# INPUT:
//        4
//        Programming is really fun!
//# OUTPUT:
//        1. Programming is really fun!
//                2. Programming is really fun!
//                3. Programming is really fun!
//                4. Programming is really fun!
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("Programming is fun!");
//        }
//        Scrie un program care citește de la tastatură un număr natural n, ce reprezintă numărul de elemente,
//        urmat de n numere întregi.
//        Programul va afișa, la final, numărul de numere pozitive și respectiv numărul de numere negative introduse.
        Scanner sc= new Scanner(System.in);
        int cnt_poz=0;
        int cnt_neg=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int current_number=sc.nextInt();
           if(current_number>0)
               cnt_poz++;
           if(current_number<0)
               cnt_neg++;
        }
        System.out.println(cnt_poz);
        System.out.println(cnt_neg);
    }
}
