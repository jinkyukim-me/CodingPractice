package operator.practice;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디: ");
        String ID = scanner.nextLine();

        System.out.print("패스워드: ");
        int PassWord = scanner.nextInt();

        if (ID.equals("java")) {
            if (PassWord == 12345) {
                System.out.println("로그인 성공");
            }
            else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        }
        else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }

    }
}
