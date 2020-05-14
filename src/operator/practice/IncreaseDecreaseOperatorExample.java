package operator.practice;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = (++x) + (y--);

        System.out.println("z: " + z);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

}
