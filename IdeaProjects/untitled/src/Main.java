//2. Definește o metodă (i.e. multiplyWithSumI(int, int)) care realizează înmulțirea a două numere
//        (i.e. a și b) folosind doar operatorul de adunare. De exemplu, pentru a calcula a * b se poate realiza
//        o metodă care să adune a + a + … + a de b ori sau b + b + … + b de a ori.
public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        double ans = Math.pow(x, y);
        System.out.println(sum(x, y));
    }
    public static int sum(int a, int b) {
        int counter = 1; //numarul de adunari
        int aux = a; //variabila ajutatoare ce va stoca valoarea lui a
        while (counter != b) {
            aux += a;
            counter++; //crestem counter-ul
        }
        return aux;//returnam suma
    }
}