package day04;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        // p.139 확인문제 7
        Scanner scanner = new Scanner(System.in);
        int 금액 = 0;
        while ( true){ // w s
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            String strnum = scanner.nextLine();

            if(strnum.equals("1")){
                System.out.print("예금액> ");
                금액 += scanner.nextInt();
            } else if (strnum.equals("2")) {
                System.out.print("출금액> ");
                금액 -= scanner.nextInt();
            } else if (strnum.equals("3")) {
                System.out.println("잔고> " + 금액);
            } else if (strnum.equals("4")) {
                break;
            }

        } // w e
        System.out.println("프로그램 종료 완료");
        


    } // m e

} // c e
/*
    은행 프로그램 구현
    1. 반복적으로 기능 사용 [ 단* 종료 기능 선택시 종료 ]
    2. 기능 : 예금 , 출금 , 잔고 , 종료
        예금 : 더하기 작업
            금액 에서 예금액을 입력받아 금액에 더한다
        출금 : 빼기 작업
            금액 에서 출금액을 입력받아 금액에서 빼기한다.
        잔고 : 확인 작업
            금액의 값을 출력한다.
        종료 : 프로그램을 끝내는 작업
            무한루프를 탈출한다. 1. 스위치변수 2. break 3. return
            - 상황에 따라 선택.
    3. 데이터 설계
        금액 : 예금 , 출금 했을때 누적으로 출력

 */