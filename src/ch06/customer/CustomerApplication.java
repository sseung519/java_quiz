package ch06.customer;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1.고객등록 | 2.모든 고객리스트 확인 | 3.포인트 사용 | 4.포인트 적립 | 5.종료");
            System.out.println("-----------------------------------------------------------------");

            System.out.print("선택: ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    customerList();
                    break;
                case 3:
                    usePoint();
                    break;
                case 4:
                    savePoint();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    //1.고객등록
    private static void createAccount() {
        System.out.println("-------------");
        System.out.println("고객 등록");
        System.out.println("-------------");

        System.out.print("고객명: ");
        String name = scanner.next();

        System.out.print("전화번호 ('-'는 제외하고 입력해주세요. ): ");
        String phone = scanner.next();

        System.out.print("집주소: ");
        String addr = scanner.next();

        System.out.print("포인트: ");
        long totalPoint = scanner.nextLong();

        Customer customer = new Customer(name, phone, addr, totalPoint);

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == null) {
                customerArray[i] = customer;
                System.out.println("고객등록이 완료되었습니다.");
                break;
            }
        }
    }

    //2.고객리스트확인
    private static void customerList() {
        System.out.println("-------------");
        System.out.println("고객 목록");
        System.out.println("-------------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];
            if (customer != null) {
                System.out.println(customer.getName() + " " + customer.getPhone() + " " + customer.getTotalPoint());
            } else {
                break;
            }
        }
    }

    //3.포인트사용 500점이상부터사용
    private static void usePoint() {
        System.out.println("-------------");
        System.out.println("포인트 사용(500점 이상부터 사용 가능)");
        System.out.println("-------------");

        System.out.print("전화번호 ('-'는 제외하고 입력해주세요. ):");
        String phone = scanner.next();

        System.out.print("사용할 포인트: ");
        long point = scanner.nextLong();

        Customer customer = findCustomer(phone);

        if (customer == null) {
            System.out.println("고객 정보가 등록되지 않았습니다.");
            return;
        }
        if( point < 500) {
            System.out.println("500점 이상 사용 가능합니다.");
        }else if (customer.getTotalPoint() < point) {
            System.out.println("포인트가 부족합니다. 보유하신 포인트는: " + customer.getTotalPoint() + "점 입니다.");
        } else {
            customer.setTotalPoint(customer.getTotalPoint() - point);
            System.out.println(point + "점 사용하였습니다. 남은 포인트는: " + customer.getTotalPoint() + "점 입니다.");
        }
    }

    //4.포인트적립 2000점 이상 적립 시, +10% 추가적립
    private static void savePoint() {
        System.out.println("-------------");
        System.out.println("포인트 적립 (2000점 이상 적립시 10% 추가적립)");
        System.out.println("-------------");

        System.out.print("전화번호 ('-'는 제외하고 입력해주세요. ): ");
        String phone = scanner.next();

        System.out.print("적립할 포인트: ");
        long point = scanner.nextLong();

        Customer customer = findCustomer(phone);

        if (customer == null) {
            System.out.println("고객 정보가 등록되지 않았습니다.");
            return;
        }
        if (point < 2000) {
            customer.setTotalPoint(customer.getTotalPoint() + point);
            System.out.println("적립 완료 되었습니다. 현재 포인트: " + customer.getTotalPoint());
        } else {
            customer.setTotalPoint(customer.getTotalPoint() + (long) (point * 1.1));
            System.out.println("적립 완료 되었습니다. 현재 포인트: " + customer.getTotalPoint());
        }
    }

    //5.핸드폰 번호로 해당 고객 객체 찾기
    private static Customer findCustomer(String phone) {
        Customer customer = null;
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] != null) {
                String number = customerArray[i].getPhone();
                if (number.equals(phone)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
