//Implementează funcționarea unui modul ATM real: se citește de la tastatură un număr natural nenul
//        n care corespunde unei anumite operații ce poate fi realizată de către ATM
//        (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.). Vezi tabelul de mai jos pentru o
//        listă completă de operații disponibile. În funcție de operația solicitată, ATM-ul trebuie să
//        actualizeze informațiile specifice clientului curent (în cazul de față, sold curent).
//
//        În vederea selectării unei anumite operații, se va folosi o structură condițională de tip
//        switch. Odată ce s-a terminat de efectuat operația solicitată de utilizator, ATM-ul își va
//        continua execuția, așteptând o nouă comandă de la utilizator. Singura posibilitate de a întrerupe
//        acest flux este introducerea unei operații speciale de tip ieșire (exemplu: 6 - Iesire).
//
//        Gândește-te la cât mai multe cazuri de eroare și tratează-le corespunzător (exemple: la retragerea
//        sumei, numărul citit de la tastatură să fie divizibil cu 10, să fie pozitiv, să fie mai mic decât
//        soldul disponibil etc.).
//Exemplu de output: ===== Bine ati venit =====
//        1. Interogare Sold
//        2. Retragere Numerar
//        3. Depunere
//        4. Info
//        5. Curs Valutar
//        6. Iesire
//
//        # INPUT: n == 1
//        Soldul dumneavoastra este 1000 RON.
//
//        # INPUT: n == 2, amount == 300
//        Operatie efectuata cu succes!
//
//        # INPUT: n == 1
//        Soldul dumneavoastra este 700 RON.
//
//        # INPUT: n == 40
//        Optiuni disponibile:
//        1. Interogare Sold
//        2. Retragere Numerar
//        3. Depunere
//        4. Info
//        5. Curs Valutar
//        6. Iesire
package ATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Welcome to our bank! === :)");
        System.out.print("Type current balance:");
        double current_balance = sc.nextInt();
        ///while(True)
        while (true) {
            System.out.println("1-Query soil");
            System.out.println("2-Cash withdrawal");
            System.out.println("3-Cash deposit");
            System.out.println("4-Exchange");
            System.out.println("5-Info");
            System.out.println("6-Exit");
            System.out.println("7-Help");
            System.out.print("Your choice is:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ///Interogare sol
                    ///if(found == true)
                    System.out.println(current_balance);
                    ///else
                    ///break;
                case 2:
                    System.out.print("Type a sum:");
                    double s1 = sc.nextInt();
                    if (s1 <= current_balance) {
                        current_balance -= s1;
                        System.out.println(current_balance);
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Error!");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Type a sum:");
                    double s2 = sc.nextInt();
                    if (s2 >= current_balance) {
                        current_balance += s2;
                        System.out.println(current_balance);
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Error!");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("The sum in EUR is:" + (current_balance * 4.92));
                    break;
                case 5:
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));

                case 6:
                    System.exit(0);

                case 7:
                    System.out.println("1-Query soil");
                    System.out.println("2-Cash withdrawal");
                    System.out.println("3-Cash deposit");
                    System.out.println("4-Exchange");
                    System.out.println("5-Info");
                    System.out.println("6-Exit");
                    System.out.println("7-Help");
                default:
                    System.out.print("Type another command:");
                    choice = sc.nextInt();
            }
        }
    }
        }
///while(True)
///boolean found = true;