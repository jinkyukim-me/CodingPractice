package condition.practice;

public class BreakExample {
    public static void main(String[] args) {
        Test: for(char upper='A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Test;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
