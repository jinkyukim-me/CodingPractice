package variableandtype.sec03;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "200";
        String str3 = "300000";
        String str4 = "40000000000";
        String str5 = "12.345";
        String str6 = "23.423452353";
        String str7 = "true";
        String str8 = "trued";

        byte byteValue = Byte.parseByte(str1);
        short shortValue = Short.parseShort(str2);
        int intValue = Integer.parseInt(str3);
        long longValue = Long.parseLong(str4);
        float floatValue = Float.parseFloat(str5);
        double doubleValue = Double.parseDouble(str6);
        boolean booleanValue1 = Boolean.parseBoolean(str7);
        boolean booleanValue2 = Boolean.parseBoolean(str8);

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("booleanValue1: " + booleanValue1);
        System.out.println("booleanValue2: " + booleanValue2);

        /*
        String str9 = "Java11";
        int intValue2 = Integer.parseInt(str9);  // NumberFormatException 발생
        System.out.println();
        System.out.println(intValue2);
         */


    }
}
