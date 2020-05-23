package methodex;

public class Car1Example {
    public static void main(String[] args) throws InterruptedException {
        Car1 car1 = new Car1();
        car1.keyTurnOn();
        car1.run();
        int speed = car1.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
