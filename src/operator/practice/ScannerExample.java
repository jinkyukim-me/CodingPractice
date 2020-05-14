package operator.practice;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        String value1 = scanner.nextLine();

        System.out.print("두 번째 수: ");
        String value2 = scanner.nextLine();

        double doubleValue1 = Double.parseDouble(value1);
        double doubleValue2 = Double.parseDouble(value2);

        System.out.println("---------------");
        if (doubleValue2 != 0.0) {
            System.out.println("결과:" + (doubleValue1/doubleValue2));
        }
        else {
            System.out.println("결과:무한대");
        }
    }
}
