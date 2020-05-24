package accessmodifier.example;

public class B1 {
    public B1() {
        A1 a1 = new A1();

        a1.field1 = 1;
        a1.field2 = 1;
//        a1.field3 = 1; <- private 메소드 접근 불가 (컴파일 에러)

        a1.method1();
        a1.method2();
//        a1.method3();
    }

}
