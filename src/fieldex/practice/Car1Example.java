package fieldex.practice;

public class Car1Example {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);

        System.out.println();

        Car1 car2 = new Car1("Sonata","Blue");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);

        System.out.println();

        Car1 car3 = new Car1("Genesis","Brown",250);
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);



    }
}
