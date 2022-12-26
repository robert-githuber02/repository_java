package Strings;

public class String_practice {
    public static void main(String[] args) {
        //string-urile sunt obiecte imutabile.
        //odata ce a fost creat un obiect string,acesta nu main poate fi modificat
        //toate metodele care modifica un string vor returna de fapt un nou obiect de tip string care fi updatat conform metodei
        String s1 = new String("Mere");
        System.out.println(s1);
        s1 = "Mere2";//vom crea un nou obiect in memorie care se numeste tot s1 dar care va avea o alta referinta in memorie
        System.out.println(s1);
        ///formatarea unui string
        int a = 5;
        String s2 = "lei";
        System.out.printf("Robert are %d %s", a, s2);
        //%f
        String result = String.format("\t\nThe animal %s has:%n\t- %d eyes,"
                        + " %n\t- %d legs,%n\t- weighs %f",
                "Tiger Dolu", 2, 4, 210.15);
        System.out.println(result);

        long bigNumber = 123_456_789l;
        int smallInteger = -42;
        double realValue = 3123.14159265358979;

        String ret;

        ret = String.format("Original, unformated values: %d; %d; %f%n",
                bigNumber, smallInteger, realValue);
        System.out.print(ret); // -> 123456789; -42; 3123.141593

        ret = String.format("Padding to length 6: %06d; %06d; %06f%n",
                //%06d este un flag ce stocheaza dimnesiunea pe care vrem sa o afisam din variabila formatata
                bigNumber, smallInteger, realValue);
        System.out.print(ret); // -> 123456789; -00042; 3123.141593

        ret = String.format("Adding sign: %+06d; %+06d; %+06f%n",
                bigNumber, smallInteger, realValue);
        System.out.print(ret); // -> +123456789; -00042; +3123.141593

        ret = String.format("Number digits grouping: %+,06d; %,06d; %,06f%n",
                bigNumber, smallInteger, realValue);
        System.out.print(ret); // -> +123,456,789; -00042; 3,123.141593

        ret = String.format("Number of decimals: %,+d; %+6d; %,10.2f; %,.8f%n",
                bigNumber, smallInteger, realValue, realValue);
        System.out.print(ret); // -> +123,456,789;    -42;   3,123.14; 3,123.14159265

        //manipularea stringurilor
        String entireString = "Today is a great day for science!";
        String substring1 = entireString.substring(9, 20);//preia toate caracterele din string-ul entireString incepand cu
        // pozitia 9 si terminand cu pozitia 20 inclusiv
        //substring 1 va afisa string-ul entireString pornind de la index-ul 9 pana la index-ul 20
        String substring2 = entireString.substring(9);//preia caracterele din string-ul initial incepand cu pozitia 9 si pana la finalul string-ului
        //substring 1 este a iar substring 20 e
        System.out.println(entireString);
        System.out.println(substring1);
        System.out.println(substring2);

        String quoteOfTheDay = "Strive not to be a success, but rather to be of value.";
        String[] words = quoteOfTheDay.split("\\W+");
        String[] splitWithLimit = quoteOfTheDay.split("\\W+", 3);
        //"\\W+" are rolul de a imparti propozitia in cuvinte,unde un cuvant reprezinta un sir de caractere fara spatiu sau fara semne de punctuatie
        System.out.println("Original sentence: " + quoteOfTheDay);
        System.out.println("The sentence words are:");
        for(int i = 0; i < words.length; i++) {
            System.out.println("Word " + i + " is: " + words[i]);
        }
        System.out.println("The first 2 words in the sentence are:");
        for(int i = 0; i < splitWithLimit.length; i++) {
            System.out.println("Word " + i + " is: " + splitWithLimit[i]);
        }
        //conversia caracterelor
        String quoteOfTheDay2 = "You miss 100% of the shots you don’t take.";
        String allSmallLetters = quoteOfTheDay2.toLowerCase();
        System.out.println(allSmallLetters);
        String allCapsLetters = quoteOfTheDay2.toUpperCase();
        System.out.println(allCapsLetters);

        String quoteOfTheDay3 = "You miss 100% of the shots you don’t take.";
        String allSmallLetters2 = quoteOfTheDay.toLowerCase();
        String allCapsLetters2 = quoteOfTheDay.toUpperCase();
//        int indexOf(int ch)    Returnează indexul primei respectiv ultimei apariții din șir a caracterului ch sau o valoare negativă dacă ch nu se află în șir.
//        int lastIndexOf(int ch)
//        int indexOf(int ch, int fromIndex)    Similar cu funcționalitatea anterioară, doar că în acest caz căutarea începe de la un anumit index (i.e. fromIndex).
//                Metoda returnează tot o valoare negativă și dacă fromIndex nu indică o poziție validă din șir (i.e. nu se află în intervalul [0, .length() - 1]).
//        int lastIndexOf(int ch, int fromIndex)
//        int indexOf(String str)    Returnează indexul primei respectiv ultimei apariții din șir a șirului str.
//        int lastIndexOf(String str)
//        int indexOf(String str, int fromIndex)    Similar cu funcționalitatea anterioară
//        - doar că în acest caz căutarea începe de la un anumit index (i.e. fromIndex).
//        int lastIndexOf(String str, int fromIndex)
//        boolean contains(CharSequence s)    Metoda returnează true dacă a fost găsit subșirul căutat în șir și false altfel.
        String quoteOfTheDay4 = "Either you run the day, or the day runs you.";

        System.out.println(quoteOfTheDay);
        System.out.println("Quote has " + countLetters(quoteOfTheDay, 'y') + " 'y'-s.");
        System.out.println("Quote has " + countLetters(quoteOfTheDay, 'a') + " 'a'-s.");
        System.out.println("Quote has " + countLetters(quoteOfTheDay, 'x') + " 'x'-s.");
    }
    //implementeaza o metoda de inserare a unui caracter intr-un string folsoind metoda indexOf
    public static int countLetters(String str,char c){
        int counter = 0;
        int index = str.indexOf(c);
        while(index >= 0){
            counter++;
            index = str.indexOf(c,index+1);
        }
        return counter;
    }

}
//    String replace(char oldChar, char newChar)    Returnează un nou șir de caractere în care toate aparițiile caracterului oldChar au fost înlocuite cu newChar.
//        String replace(CharSequence target, CharSequence replacement)    Returnează un nou șir de caractere în care toate aparițiile șirului target sunt înlocuite cu șirul replacement.
//        String replaceAll(String regex, String replacement)    Similar cu metoda anterioară, însă în acest caz se caută o expresie regulată, nu un șir de caractere.
//        String replaceFirst(String regex, String replacement)    Intuitiv, se înlocuiește doar prima secvență de caractere care validează expresia regulată cu (noul) șir replacement.