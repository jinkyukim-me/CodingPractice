package operator.sec02;

public class IncreaseOperatorExample {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int result1 = ++x + 10;
        int result2 = y++ + 10;
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
