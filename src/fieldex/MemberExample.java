package fieldex;

public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member();

        member.name = "최하얀";
        member.id = "white choi";
        member.password = "1234";
        member.age = 23;

        System.out.println("이름: " + member.name);
        System.out.println("id: " + member.id);
        System.out.println("패스워드: " + member.password);
        System.out.println("age: " + member.age);
    }
}
