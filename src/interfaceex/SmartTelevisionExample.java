package interfaceex;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision smartTelevision = new SmartTelevision();

        smartTelevision.turnOn();
        smartTelevision.setVolume(100);
        smartTelevision.search("www.google.com");
        smartTelevision.turnOff();

        System.out.println();

        RemoteControl remoteControl = smartTelevision;
        remoteControl.turnOn();
        remoteControl.setVolume(100);
        remoteControl.turnOff();

        System.out.println();

        Searchable searchable = smartTelevision;
        searchable.search("www.gmail.com");
    }
}
