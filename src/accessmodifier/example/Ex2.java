package accessmodifier.example;

public class Ex2 {
    // 필드
    Ex1 e1 = new Ex1(true);
    Ex1 e2 = new Ex1(50);
//    Ex1 e3 = new Ex1("문자열"); <- privte 생성자 접근 불가(컴파일 에러)
}
