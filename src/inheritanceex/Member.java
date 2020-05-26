package inheritanceex;

public class Member {
    public String name;
    public String id;
    public int age;
    public Member(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String ShowInfo() {
        return this.name + "+" + this.id + "+" + this.age;
    }
}
