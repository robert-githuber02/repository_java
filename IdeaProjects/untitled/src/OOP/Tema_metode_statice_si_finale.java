///o clasa,final si static,3 metode statice si 3 non-statice si sa apelez metode statice in metode non-statice + github
package OOP;

public class Tema_metode_statice_si_finale {
    public static void main(String[] args) {
int x,y;
x=12;
y=12;
        System.out.println(m1(x,y));
        int a,b;
        a=23;
        b=45;
        System.out.println(m2(a,b));
        int c,d;
        c=12;
        d=6;
        System.out.println(m3(c,d));
    }
        final int CNP = 200;
           //CNP = 100;
public static int m1(int x,int y){
        return x*y;
}
public static int m2(int a,int b){
        return a+b;
}
public static int m3(int c,int d){
        return c/d;
}
        public static int inmultire(int x,int y){
                afisare();
                return x*y;
        }
        public static int adunare(int a,int b){
            afisare();
            return a+b;
        }
        public static int impartire(int c,int d){
            afisare();
            return c/d;
        }
public static void afisare(){
            int a,b,c,d,x,y;
}
}
