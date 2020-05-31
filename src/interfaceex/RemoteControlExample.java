package interfaceex;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(100);

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(-20);

    }
}
