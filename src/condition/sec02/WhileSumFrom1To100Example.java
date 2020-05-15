package condition.sec02;

public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i < 101) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
