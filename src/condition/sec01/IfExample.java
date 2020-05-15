package condition.sec01;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다."); // 14라인은 들여쓰기만 되었을 뿐 if문과는 아무런 관련이 없음

    }
}
