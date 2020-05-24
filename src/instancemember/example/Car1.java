package instancemember.example;

public class Car1 {
    // instance member
    int speed;
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    // static member
    static int speed1;
    static void run1() {
        System.out.println(speed1 + "으로 걸어갑니다.");
    }

}
