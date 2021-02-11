package utils;

public class MathUtils {

    public int add (int a, int b){
        return a + b;
    }


    public double computeCircleAres(int radius) {
        return 3.14 * radius * radius;
    }

    public double divide(double num1, double num2) {
        if(num2==0.0){
            throw new ArithmeticException();
        }
        return num1/num2;
    }
}
