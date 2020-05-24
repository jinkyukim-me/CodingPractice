package instancemember.example;

public class Person {
    final String nation = "Korea"; // nation은 항상 고정된 값이기 때문에 필드 선언 시 초기값으로 "Korea"로 주었음
    final String ssn; // ssn 필드는 한 번 값이 저장되면 변경할 수 없도록 final 필드로 선언,
    // ssn은 Person 객체가 생성될 때 부여됨으로 Person 클래스 설계 시 초기값을 미리 줄 수 없습니다.
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
