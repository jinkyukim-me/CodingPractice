package methodex;

public class Car1 {
    // field
    int speed;

    // constructor

    // method
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() throws InterruptedException {
        for(int i=0; i<=50; i++) {
            speed = i;
            System.out.println("달립니다. (시속: " + speed + "km/h)");
            Thread.sleep(500);
        }
    }
}
