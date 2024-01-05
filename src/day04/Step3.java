package day04;

import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;         // 무한루프의 상태를 저장하고 있는 변수 [ on / off ]
        int speed = 0;
        while(run){ // 무한루프 시작
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 '대기' 상태로 됨.

            if (strNum.equals("1")){    // if start
                speed++;
                System.out.println("현재속도는 : " + speed + " 입니다");
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재속도는 : " + speed + " 입니다");
            } else if (strNum.equals("3")) {
                run = false;    // while 문 다시이동후 조건 검사 후 빠져나가기
                // break 34번 while 문 종료로 바로 이동
                // return main 함수 종료칸인 39번줄로 이동후 현재함수 종료 
            }else {
                System.out.println("올바른 번호를 입력 하세요.");
            } // if end

        } // 무한루프 끝

        System.out.println("프로그램 종료");

    } // m e

} // c e

/*
    무한루프 = 무한반복 * 무한루프는 중지할 장치는 있어야 한다 .
        1. while(true){}
        2.
            boolean run = true;
            while( run ){ }
 */