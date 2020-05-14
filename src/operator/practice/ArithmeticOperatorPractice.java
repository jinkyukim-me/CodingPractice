package operator.practice;

public class ArithmeticOperatorPractice {
    public static void main(String[] args) {
        int int1 = 10;
        int int2 = 20;
        int result1 = int1 / int2;
        double result2 = int1 / int2;
        double result3 = (int1 * 1.0) / int2;
        double result4 = (double) int1 / int2;
        double result5 = int1 / (double) int2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
