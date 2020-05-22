package fieldex;

public class KoreanExample {
    public static void main(String[] args) {

        Korean korean1 = new Korean("Kim", "1234");
        Korean korean2 = new Korean("Park","5678");

        System.out.println(korean1.name + "+" + korean1.ssn + "+" + korean1.nation);
        System.out.println(korean2.name + "+" + korean2.ssn + "+" + korean2.nation);

    }
}
