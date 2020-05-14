package operator.practice;

public class ArithmeticOperatorExample2 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2;
        int var4 = (int) (var3 * var2);
        System.out.println(var4);

        int value = 356;
        System.out.println(value / 100 * 100);

        double value1 = 0.1;
        float floatValue1 = 10f;
        float floatValue2 = floatValue1 / 100;
        System.out.println(value1 == floatValue2);
        if (floatValue2 == 0.1) {
            System.out.println("10%입니다.");
        }
        else {
            System.out.println("10%가 아닙니다.");
        }

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((lengthBottom + lengthTop) * height) * 0.5;
        System.out.println("area: " + area);
    }
}
