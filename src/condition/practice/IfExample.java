package condition.practice;

public class IfExample {
    public static void main(String[] args) {
        int score = 85;

        if(score<70) {
            System.out.print("D");
        }

        if(score<80) {
            System.out.print("C");
        }

        if(score<90) {
            System.out.print("B");
        }

        else {
            System.out.print("A");
        }

        System.out.print("입니다.");


    }
}
