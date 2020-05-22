package methodex;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int resultPlus = myCalc.plus(5, 6);
        System.out.println(resultPlus);

        double resultPlus1 = myCalc.plus1(5.4, 6.6);
        System.out.println(resultPlus1);

//        byte x = 10;
//        byte y = 4;
        double resultDivide = myCalc.divide(10, 4);
        System.out.println(resultDivide);

        int[] values = {1, 2, 3};
        int resultSum = myCalc.sum(values);
        System.out.println(resultSum);

        int resultSum1 = myCalc.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println(resultSum1);

        int resultSum2 = myCalc.sum(new int[4]);
        System.out.println(resultSum2);

        int resultSum3 = myCalc.sum2(1, 2, 4);
        System.out.println(resultSum3);

        int resultSum4 = myCalc.sum2(1,2,3,4,5,6,7,8,9,10);
        System.out.println(resultSum4);

        myCalc.powerOff();

    }
}
