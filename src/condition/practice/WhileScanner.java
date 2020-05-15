package condition.practice;

import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("예금액> ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;

                case 2:
                    System.out.print("출금액> ");
                    int withdrawal = scanner.nextInt();
                    if(balance < withdrawal) {
                        System.out.println("예금 계좌에 잔액이 부족합니다.");
                    }
                    else {
                        balance -= withdrawal;
                    }
                    break;

                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;

                case 4:
                    run = false;
                    System.out.println();
            }
        }
        System.out.println("프로그램 종료");
    }
}
