package operator.practice;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 1명이 가지는 연필의 개수
        int pencilsPerStudent = pencils / students;
        System.out.println("학생 1명이 가지는 연필의 개수: " + pencilsPerStudent + "개");

        // 남은 연필 개수
        int pencilsLeft = pencils % students;
        System.out.println("남은 연필 개수: " + pencilsLeft + "개");

    }
}
