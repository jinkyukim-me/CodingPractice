package sec03;

public class OperationPromotion {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        double result = (double) x / y;
        System.out.println(result);

        double result1 = x / (double) y;
        System.out.println(result1);

        double result2 = (double) x / y;
        System.out.println(result2);

        float result3 = (float) x / y;
        System.out.println(result3);
    }
}
