package accessmodifier1.example1;

import accessmodifier.example.A1;

public class C1 {
    public C1() {
        A1 a1 = new A1();
        a1.field1 = 1;
//        a1.field2 = 1;
//        a1.field3 = 1;


        a1.method1();
//        a1.method2();
//        a1.method3();
    }

}
