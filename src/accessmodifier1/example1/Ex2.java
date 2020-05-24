package accessmodifier1.example1;

import accessmodifier.example.Ex1;

public class Ex2 {
    // 필드
    Ex1 e1 = new Ex1(true);
//    Ex1 e2 = new Ex1(1); <- default생성자, 다른 패키지 생성자 접근 불가
//    Ex1 e3 = new Ex1("문자열"); <- private생성자, 다른 패키지 생성자 접근불가

}
