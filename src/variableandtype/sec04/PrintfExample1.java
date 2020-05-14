package variableandtype.sec04;

public class PrintfExample1 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("정수: %d\n", value);
        System.out.printf("정수: %6d\n", value);
        System.out.printf("정수: %-6d\n", value);
        System.out.printf("정수: %06d\n", value);

        System.out.println();

        double doubleValue = 123.456;
        System.out.printf("실수: %10.2f\n", doubleValue);
        System.out.printf("실수: %.2f\n", doubleValue);
        System.out.printf("실수: %-10.2f\n", doubleValue);
        System.out.printf("실수: %010.2f\n", doubleValue);

        System.out.println();

        String str = "abc";
        System.out.printf("문자열: %s\n", str);
        System.out.printf("문자열: %6s\n", str);
        System.out.printf("문자열: %-6s\n", str);

    }
}
