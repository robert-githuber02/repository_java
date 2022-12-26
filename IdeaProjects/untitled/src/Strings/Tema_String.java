package Strings;

import java.util.Scanner;

public class Tema_String {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int[] freq = new int[str.length()];//frecventa este egala cu lungimea string-ului
        int i, j;
        char[] string = str.toCharArray();//metoda str.toCharArray() converteste string-ul dat intr-o secventa de caractere
        //Array-ul returnat este egal cu lungimea string-ului
        int counter_char = 0;
        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';//string[j] se initializeaza cu 0
                }
            }
        }
            for (i = 0; i < freq.length-1; i++) {//se parcurge sirul de la pozitia 0 pana la pozitia anterioara frecventei string-ului
                    System.out.println(string[i] + "-" + freq[i]);
        }
    }
}

