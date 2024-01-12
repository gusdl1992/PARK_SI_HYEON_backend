package day09;

import java.util.Scanner;

public class Step2 {

    public static void main(String[] args) {

        // 입력 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 계좌 생성 객체 배열 생성 크기100
        Account[] BankApplication = new Account[100];

        while (true){

            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------");

            System.out.print("선택> ");
            int ch = scanner.nextInt();
            scanner.nextLine(); // scanner.nextInt(); 엔터값 초기화

            if( ch == 1){
                System.out.println("--------");
                System.out.println("계좌생성");
                System.out.println("--------");
                System.out.print("계좌번호 :");
                String 계좌번호 = scanner.nextLine();
                System.out.print("계좌주 :");
                String 계좌주 = scanner.nextLine();
                System.out.print("초기입금액 :");
                String 초기입금액 = scanner.nextLine();

                Account account = new Account(계좌번호 , 계좌주 , 초기입금액);
                for (int i = 0 ; i < BankApplication.length ; i++){
                    if (BankApplication[i] == null){
                        BankApplication[i] = account;
                        System.out.println("결과: 계좌가 생성되었습니다.");
                        break;
                    }
                } // for e
                // 계좌생성 끝
            } else if ( ch == 2) {
                // 계좌 목록
                System.out.println("--------");
                System.out.println("계좌목록");
                System.out.println("--------");

                for (int i = 0; i < BankApplication.length ; i++){
                    if (BankApplication[i] != null){
                        System.out.print(BankApplication[i].accountNumber + "\t" + BankApplication[i].name + "\t" + BankApplication[i].money + "\n");
                    }
                } // for e
                // 계좌조회 끝
            } else if (ch == 3) {
                System.out.println("--------");
                System.out.println("예금");
                System.out.println("--------");
                System.out.print("계좌번호 :");
                String 계좌번호 = scanner.nextLine();
                System.out.print("예금액 :");
                String 예금액 = scanner.nextLine();

                for (int i = 0; i < BankApplication.length; i++){
                    if(BankApplication[i] != null){
                        if(BankApplication[i].accountNumber.equals(계좌번호) ){
                            BankApplication[i].예금(예금액);
                            break;
                        }else {
                            System.out.println("계좌번호를 찾을수 없습니다.");
                            break;
                        } // 2 if e
                    } // 1 if e
                } // for e
            } else if (ch == 4) {
                System.out.println("--------");
                System.out.println("출금");
                System.out.println("--------");
                System.out.print("계좌번호 :");
                String 계좌번호 = scanner.nextLine();
                System.out.print("출금 :");
                String 출금액 = scanner.nextLine();

                for (int i = 0; i < BankApplication.length; i++){
                    if(BankApplication[i] != null){
                        if(BankApplication[i].accountNumber.equals(계좌번호) ){
                            BankApplication[i].출금(출금액);
                            break;
                        }else {
                            System.out.println("계좌번호를 찾을수 없습니다.");
                            break;
                        } // 2 if e
                    } // 1 if e
                } // for e
            } else if (ch == 5) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

        }// w e



    }// m e
} // c e
