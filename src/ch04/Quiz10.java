package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bank = true;
        int balance = 0;


        while (bank) {
            System.out.println("----------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------");

            System.out.print("선택: ");
            String selectNum = scanner.nextLine();

            if (selectNum.equals("1")) {
                System.out.print("예금할 금액: ");
                String depositNum = scanner.nextLine();
                balance += Integer.parseInt(depositNum);
            } else if (selectNum.equals("2")) {
                System.out.print("출금할 금액: ");
                String withdrawNum = scanner.nextLine();
                balance -= Integer.parseInt((withdrawNum));
            } else if (selectNum.equals("3")) {
                System.out.println("잔고:" + balance);
            } else {
                bank = false;
            }
        }
        System.out.println("프로그램 종료");

        //풀이
//        while (bank) {
//            System.out.println("----------------");
//            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//            System.out.println("----------------");
//
//            String selectNum = scanner.next();
//
//            switch (selectNum) {
//                case "1":
//                    System.out.print("예금할 금액: ");
//                    balance += scanner.nextInt();
//                    break;
//                case "2":
//                    System.out.print("출금할 금액: ");
//                    balance -= scanner.nextInt();
//                    break;
//                case "3":
//                    System.out.print("잔고: ");
//                    System.out.print(balance);
//                    break;
//                case "4":
//                    bank = false;
//                    break;
//            }
//        }
//        System.out.println("프로그램 종료");
    }
}

