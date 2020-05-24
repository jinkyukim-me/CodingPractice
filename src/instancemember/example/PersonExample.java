package instancemember.example;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123123-123123","Jayden");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "USA"; Person 클래스에서 final로 선언, 수정 불가
        // p1.ssn = "444555-444555"; Person 클래스에서 final로 선언, 수정 불가
        p1.name = "David";

        System.out.println();

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        System.out.println();

        Person p2 = new Person("333333-333333","Jack");
        System.out.println(p2.nation);
        System.out.println(p2.ssn);
        System.out.println(p2.name);

    }
}
