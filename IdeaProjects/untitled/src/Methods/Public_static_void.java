package Methods;

public class Public_static_void {
    public static void main(String[] args) {
        double functionResult = mathFunction(2.0, 1.0);
        System.out.println(functionResult);
        functionResult = mathFunction(functionResult, 2.1);
        System.out.println(functionResult);
    }
//    public static void timesTwo(int initialValue) {
//        System.out.println("The initial value of the parameter is: " + initialValue);
//        initialValue *= 2;
//        System.out.println("The parameter value is now: " + initialValue);
//    }
public static double mathFunction(double x, double y) {
    double functionResult = 2 * x + y;
    return functionResult;
}

}
