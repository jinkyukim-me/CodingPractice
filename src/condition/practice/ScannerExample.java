package condition.practice;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("메뉴를 고르세요(1/2/3/4):");
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                System.out.println("1번");
                break;

            case 2:
                System.out.println("2번");
                break;

            case 3:
                System.out.println("3번");
                break;

            default:
                System.out.println("4번");
                break;

        }
        System.out.println("프로그램 종료");

    }
}
