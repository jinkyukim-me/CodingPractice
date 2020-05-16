package referencetype.sec02;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95, 88, 79, 99, 94 };

        int sum = 0;
        for(int score: scores) {
            System.out.println(score);
            sum += score;
        }
        System.out.println("점수 총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.printf("점수 평균 = %.2f" ,avg);
    }
}
