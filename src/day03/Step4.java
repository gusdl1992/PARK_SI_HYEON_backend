package day03;

import java.util.Scanner;

public class Step4 {    // class s
    public static void main(String[] args) { // main s
        Scanner scanner = new Scanner(System.in);
            // !!! : Scanner 클래스 입력시 [ 외부 라이브러리 -> 호출 ]
                // 자동완성시 자동으로 클래스 위에 import java.util.Scanner;  확인
                // 직접입력시 직접 클래스 위에 import java.util.Scanner; 작성
                // System , String 등등 package java.lang; 안에 있는 클래스는 import 생략

        // if 조건문
        System.out.print("정수 입력 : "); int point = scanner.nextInt();

        if(point >= 80){ System.out.println("합격"); }
        // 2.
            // 만약에 내가 입력한 값이 저장된 point 변수의
            // 값이 90 이상이면 (true) 합격출력 아니면 불합격 출력
        if(point >= 90){ System.out.println("합격"); }
        else { System.out.println("불합격"); }
        
        // 3. 다수 조건 : { } 는 무조건 한번 실행.
        if (point >= 90){System.out.println("A등급");}
        else if (point >= 80){System.out.println("B등급");}
        else if (point >= 70){System.out.println("C등급");}
        else {System.out.println("탈락"); }
            // vs
        // : { } 는 조건 충족에 따라 여러번 실행 될수 있다.
        if (point >= 90){System.out.println("A등급");}
        if (point >= 80){System.out.println("B등급");}
        if (point >= 70){System.out.println("C등급");}

        // 4. 중첩 조건

        char sex = 'M';
        if(sex == 'M' || sex == 'm'){ //만약에 성별이 남자이면
            // 남자이면서 젖ㅁ수가 90점이면
            if ( point >= 90 ){
                System.out.println("남자 우수상");
            }
        }else{ // 아니고 성별이 여자 이면
            // 여자(조건1 false) 이면서 점수가 90점 이상이면
            if (point >= 90){
                System.out.println("여자 우수상");
            }
        }

        // 예시 ) 스위치 변수 활용 [ step3 16 ]

        String id = scanner.next();
        String pw = scanner.next();
        // equals() : 문자열 비교 메소드 지원 , 문자열.equals

        boolean sw = false;
        if(id.equals("admin") && pw.equals("1234")){
            sw = true;
            if(sw){  System.out.println("로그인성공");
            }else{  System.out.println("로그인실패");  }
        }

    } // main e
} // class e

/*
    if 문 [조건문]
        -경우의수 (조건) 따른 실행 흐름 제어
        - 조건 : boolean
            - if(true) , if (false)
            - boolean 변수 = true; if(변수)
            - if( 3 > 5) , if( 3 > 1 && 3 < 10 )
            - int 변수 = 10; if ( 변수 - 10 > 5)
            - 함수의 리턴값이 boolean 일 경우
        - 삼항연산자 : 간단한 조건식 사용 vs 조건문if : 일반적으로 사용
            1. 삼항연산자 단점 : 조건이 길어지면 읽기 힘듬.
            2. 참·거짓 : 함수 정의/실행 제약
                vs
            2. 조건문
                { } 이용한 코드 묶음 처리
        - 형태
            1.  단일 조건의 참만 있을경우
                if(조건) { (참true) 선언문 ; 실행문 ;}
            2.  단일 조건에 참과 거짓이 있을경우
                if(조건) { (참true) 선언문 ; 실행문 ;}
                else { (거짓false) 선언문 ; 실행문 ; }
            3.  다수조건에 참과 거짓이 있을경우
                - 하나의 {  } 실행 : if ~ else if ~ else if 하나의 조건문으로 취급 [ 다수조건에 따른 결과 1개 ]
                  if(조건1) { (참true1) 선언문 ; 실행문 ;}
                else if(조건2){ (참true2) 선언문 ; 실행문 ; }
                else if(조건3){ (참true3) 선언문 ; 실행문 ; }
                else{ (거짓false) 선언문 ; 실행문 ; }

                        // vs
                - 여러개의 { } 실행 : if{} if{} if{}  :  여러개의 조건문으로 취급 [ 다수조건에 따른 결과 여러개 ]
                if(조건1) { (참true1) 선언문 ; 실행문 ;}
                if(조건2) { (참true2) 선언문 ; 실행문 ;}
                if(조건3) { (참true3) 선언문 ; 실행문 ;}

            4. 중첩
                if(조건1){
                    if(조건1 t -> 조건2){}
                    else{}
                }else{
                    if(조건1 f - > 조건2){}
                    else{}
                }



*/