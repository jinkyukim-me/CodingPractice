package accessmodifier.example;

public class Ex1 {
    // field
    Ex1 e1 = new Ex1(true);
    Ex1 e2 = new Ex1(1);
    Ex1 e3 = new Ex1("문자열");

    // constructor
    public Ex1(boolean b) {
    }
    Ex1(int b) {
    }
    private Ex1(String s) {
    }
}
