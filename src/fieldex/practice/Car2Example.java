package fieldex.practice;

public class Car2Example {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);

        System.out.println();

        Car2 car11 = new Car2("Grandeur");
        System.out.println(car11.company);
        System.out.println(car11.model);
        System.out.println(car11.color);
        System.out.println(car11.maxSpeed);

        System.out.println();

        Car2 car2 = new Car2("Sonata","Blue");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);

        System.out.println();

        Car2 car3 = new Car2("Genesis","Brown",250);
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);



    }
}
