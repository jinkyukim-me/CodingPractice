package methodex;

public class Cacluator2Example {
    public static void main(String[] args) {

        Calulator2 calulator2 = new Calulator2();

        // 정사각형 넓이 구하기
        double result1 = calulator2.areaRectangle(10);

        // 직사각형 넓이 구하기
        double result2 = calulator2.areaRectangle(10,20);

        System.out.println("정사각형의 넓이: " + result1);
        System.out.println("직사각형의 넓이: " + result2);
    }
}
