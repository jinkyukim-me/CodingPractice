package inheritanceex;

public class VeryImportantPerson extends Member {
    String room;
    public VeryImportantPerson(String name, String id, int age, String room) {
        super(name, id, age);
        this.room = room;
    }
}
