package abstractex;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("Jayden");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
