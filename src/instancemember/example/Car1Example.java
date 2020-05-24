package instancemember.example;

public class Car1Example {
    public static void main(String[] args) {
        Car1 instanceCar = new Car1();
        instanceCar.speed = 60;
        instanceCar.run();

        Car1.speed1 = 100;
        Car1.run1();

    }
}
