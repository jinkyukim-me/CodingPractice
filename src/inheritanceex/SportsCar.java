package inheritanceex;

public class SportsCar extends Car {
    @Override
    public void speedUP() {
        speed += 10;
    }

    /*
    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    재정의(overriding)할 수 없음
     */
}
