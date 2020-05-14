package sec03;

public class StringConcatExample {
    public static void main(String[] args) {
        int value = 10 + 2 + 9;
        System.out.println(value);

        int intValue1 = 10;
        String stringValue = "10";
        String result = intValue1 + stringValue;
        System.out.println();
        System.out.println(result);

        String str1 = 10 + "2" + 8;
        System.out.println();
        System.out.println(str1);

        String str2 = "10" + 2 + 8;
        System.out.println();
        System.out.println(str2);

        String str3 = 10 + 2 + "8";
        System.out.println();
        System.out.println(str3);

        String str4 = "10" + (2 + 8);
        System.out.println();
        System.out.println(str4);
    }
}
