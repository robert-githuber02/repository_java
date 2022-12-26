package teme.metode;

import java.util.Scanner;

//Implementează funcționarea unui modul ATM real: se citește de la tastatură un număr natural nenul n care
//        corespunde unei anumite operații ce poate fi realizată de către ATM
//        (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.).
//        Vezi tabelul de mai jos pentru o listă completă de operații disponibile.
//        În funcție de operația solicitată, ATM-ul trebuie să actualizeze informațiile specifice clientului
//        curent (în cazul de față, sold curent).
//
//        În vederea selectării unei anumite operații, se va folosi o structură condițională de tip switch.
//        Odată ce s-a terminat de efectuat operația solicitată de utilizator, ATM-ul își va continua execuția,
//        așteptând o nouă comandă de la utilizator. Singura posibilitate de a întrerupe acest flux este
//        introducerea unei operații speciale de tip ieșire (exemplu: 6 - Iesire).
//
//        Gândește-te la cât mai multe cazuri de eroare și tratează-le corespunzător (exemple:
//        la retragerea sumei, numărul citit de la tastatură să fie divizibil cu 10, să fie pozitiv,
//        să fie mai mic decât soldul disponibil etc.).
public class ATM {
    public static void main(String[] args) {
        Scanner console2 = new Scanner(System.in);
        int balance = console2.nextInt();
        while(true){
           Scanner console = new Scanner(System.in);
           System.out.println("1-INTEROGARE SOL");
           System.out.println("2-RETRAGERE NUMBERAR");
           System.out.println("3-DEPUNERE NUMERAR");
           System.out.println("4-CURS VALUTAR");
           System.out.println("5-INFO");
           System.out.println("6-IESIRE");
           System.out.println("7-AJUTOR");
           int choice = console.nextInt();
           switch(choice) {
               case 1:
                   System.out.println(balance);
                   break;
               case 2:
                   System.out.println("Insert a sum:");
                   int s = 0;
                   if (s >= balance && s <= balance) {
                       s = balance - s;
                   }
                   break;
               case 3:
//                   System.out.println(5*s);
                   break;

            case 4:
                System.out.println("The name of the bank is Marmorosch Blank,the current date is 15-11-2022 and the hour is 5:18");
                break;
               case 5:
                   System.exit(0);
                   break;
               case 6:

           }

           }
       }

    }
