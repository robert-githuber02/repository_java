package OOP;

public class Static_and_final {
    public static void main(String[] args) {
        int x,y;
        x = 5;
        y = 10;
        System.out.println(sum(x,y));
//        System.out.println(differnce(a,b)); eraore de compilare pentru ca incercam sa apelam sa apelam o metoda non-statica intr-un context static
        //metoda main este o metoda statica
    }
    final int CNP = 200;
//    CNP = 100;
    //campurile clasei care sunt final sunt imutabile(nu se pot actualiza).
    //camp,metoda desclarate final nu mai pot fi actualizate
    //final se poate aplica pe clase,metode si variabile
    ///asupra campurilor final nu putem aplica o metoda set
    //campurile statice si metodele statice sunt cele care apartin clasei,nu obiectelor
    //asta inseamna ca toate obiectele clasei vor putea apela metodele statice
    //metodele statice pot fi apelate in contexte statice dar metodele non-statice nu pot fi aplicate in contexte non-statice
    //metodele statice pot fi apelate in contexte non-statice
    public static int sum(int x,int y){
        return x+y;
    }
    public int difference(int a,int b){
        return a-b;
    }
    public int inmultire(int c,int d){
        afisare();
        //apel metoda statica in context non-static
        return c*d;
    }
    public static void afisare(){
        int c,d;
//        System.out.println(inmultire(c,d)); apel metoda non-statica in context static
    }
}
///o clasa,final si static,3 metode statice si 3 non-statice si sa apelez metode statice in metode non-statice + github
