package fieldex;

public class Car {

    // 필드
    String company = "현대자동차";
    String model = "그랜져";
    String color = "검정";
    int maxSpeed = 350;
    int speed;

    // 생성자
    Car(String company, String model, String color) {
        this.company = company;
        this.model = model;
        this.color = color;
    }

}
