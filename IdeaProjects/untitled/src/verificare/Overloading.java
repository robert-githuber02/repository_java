package verificare;

public class Overloading {
    public static void main(String[] args) {
        int x=10,y=2,i;
        int a=10,b=3,c=2;
        System.out.println(impartire(x,y));
        System.out.println(inmultire(x,y));
        System.out.println(inmultire(a,b,c));
        String1();
        String s = "World";
        String2(s);
    }
        ///O metoda void care primeste ca parametri 2 numere si afiseaza rezultatul sumei
        ///O metoda int care primeste ca parametri 2 numere si afiseaza rezultatul inmultirii
        ///O metoda double care primeste ca parametri 2 numere si afiseaza rezultatul impartirii
    public static int inmultire(int x,int y) {
        int p=x*y;
        return p;
    }
    public static double impartire(int x,int y) {
        int i;
        i=x/y;
        System.out.println(i);
        return i;
    }
    public static int inmultire(int a,int b,int c){
        int it;
        it=a*b*c;
        return it;
    }
    public static void String1(){
        String str = "Hello world";
        System.out.println(str);
    }
    public static void String2(String s){
        System.out.println(s);
    }
}
///Overloading presupune existenta unor metode in aceeasi clasa care au acelasi nume,acelasi tip returnat
///si aceeasi lista de parametri.
///In main cand apelam o metoda cu un parametru si definim acel parametru ce va fi folosit ca si argument
///atunci se numeste ca vom transmite prin valoare parametrul catre valoarea respecitva.
///In Java trasmiterea parametrilor se realizeaza prin valoare(pass by value).
///Nu exista transmitere prin referinta