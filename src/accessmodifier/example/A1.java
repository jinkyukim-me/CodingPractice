package accessmodifier.example;

public class A1 {
    // field
    public int field1;
    int field2;
    private int field3;

    // constructor
    public A1() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    // method
    public void method1() {}
    void method2() {}
    private void method3() {}
}
