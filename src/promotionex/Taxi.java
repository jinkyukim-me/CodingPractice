package promotionex;

public class Taxi extends Vehicle {
    @Override
    public void run() {
//        super.run();
        System.out.println("택시가 달립니다.");
    }

    public void stop() {
        System.out.println("멈춥니다.");
    }
}
