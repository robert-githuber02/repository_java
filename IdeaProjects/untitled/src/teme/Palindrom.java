package teme;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
//        1. Implementează un sumator de numere cu resurse limitate. Acest sumator va realiza suma numerelor
//        introduse de utilizator, până la introducerea unui număr negativ, dar nu mai mult de 10 numere.
//        Cu alte cuvinte, sumatorul va afișa suma numerelor și se va termina în oricare dintre cele două cazuri:
//
//        Utilizatorul a introdus deja 10 numere.
//                Utilizatorul introduce un număr negativ (i.e. înainte de introducerea a 10 numere).
//        Precizări:
//
//        În cazul în care programul se încheie prin introducerea unui număr negativ (i.e. cazul 2),
//        acesta nu va fi însumat! Suma este alcătuită doar din valorile pozitive introduse de utilizator.
        Scanner sc = new Scanner (System.in);
        int k=0,s=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            k++;
            int ctr = sc.nextInt();
            if (ctr < 0) {
                System.out.println("The user typed a negative number!");
                break;
            }
            if (k >= 10) {
                System.out.println("The user typed more than 10 numbers!");
                break;
            } else {
                s = s + ctr;
            }
            System.out.println(s);
        }
    }
}