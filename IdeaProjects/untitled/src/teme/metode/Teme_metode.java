package teme.metode;

import java.util.Scanner;

public class Teme_metode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    //
//    Question 2
//
//    Write a method named isEven that accepts an int argument. The method should return true if the
//    argument is even, or false otherwise. Also write a program to test your method.
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}