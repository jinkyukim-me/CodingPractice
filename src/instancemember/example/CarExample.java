package instancemember.example;

public class CarExample {
    public static void main(String[] args) throws InterruptedException {
        Car myCar = new Car("포르쉐 boxter gts");
        Car yourCar = new Car("벤츠 c63amg");

        myCar.run();
        yourCar.run();
    }
}
