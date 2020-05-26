package inheritanceex;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
        supersonicAirplane.takeoff();
        supersonicAirplane.fly();
        supersonicAirplane.flymode = SupersonicAirplane.SUPERSONIC;
        supersonicAirplane.fly();
        supersonicAirplane.flymode = SupersonicAirplane.NORMAL;
        supersonicAirplane.fly();
        supersonicAirplane.land();
    }
}
