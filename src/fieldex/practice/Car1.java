package fieldex.practice;

public class Car1 {
    // field
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    // constructor
    Car1() {
    }

    Car1(String model) {
        this.model = model;
    }

    Car1(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car1(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
