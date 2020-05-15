package condition.practice;

public class ForSumFrom1To100Example1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        for(i=1; i<101; i++) {
            if(i%3==0) {
                sum += i;
            }
        }
        System.out.println("1~" + (i-1) + " 중에서 3의 배수의 총합: " + sum);
    }
}
