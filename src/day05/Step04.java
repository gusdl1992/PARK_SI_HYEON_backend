package day05;

import java.util.Scanner;

public class Step04 {
    public static void main(String[] args) {
        // p.199 ~ 200 확인문제9
        Scanner scanner = new Scanner(System.in);
        int[] 학생수배열 = null;

        while (true){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");

            System.out.print("선택>"); String ch = scanner.nextLine();
            
            if(ch.equals("1") ){
                System.out.println();
                System.out.print("핵생수>"); String no = scanner.nextLine();
                if (Integer.parseInt(no) < 0 ){
                    System.out.println("학생수는 0보다 작을수 없습니다.");
                }else {
                    // [p.172] 입력받은 (문자 -> 정수 변환) 만큼 배열 길이 초기화
                    학생수배열 = new int[Integer.parseInt(no)];  // 기존데이터 사라짐
                }
                for (int index = 0 ; index < 학생수배열.length ; index++){
                    System.out.printf("%d = %s \n" , index , 학생수배열[index]);
                }

            } else if (ch.equals("2")) {
                // [1]번에서 입력받은 학생 수 만큼 입력 받는다.
                for(int i = 0; i < 학생수배열.length ; i++){
                    System.out.printf("scores[%d] > \n" , i);
                    학생수배열[i] = Integer.parseInt(scanner.nextLine() );
                }

            } else if (ch.equals("3")) {
                // [2]번에서 입력받은 점수를 출력
                for(int i = 0; i < 학생수배열.length ; i++){
                    System.out.printf("scores[%d]: %d \n" , i , 학생수배열[i]);
                }
            } else if (ch.equals("4")) {
                int num = 0;    // 임의 최저값 대입
                int sum = 0;    // 평균 값 저장 변수
                
                // 최고점수 찾기
                for (int i = 0; i < 학생수배열.length; i++){
                    if(num <= 학생수배열[i]){
                        num = 학생수배열[i];
                    }
                    sum += 학생수배열[i];
                }
                // 출력
                System.out.println("최고 점수 : " + num);
                System.out.printf("평균 점수 : %.1f \n" , (double)sum/학생수배열.length); // 배열의 길이가 총 학생수
            } else if (ch.equals("5")) {
                System.out.println("프로그램 종료!");
                break;
            }else {
                System.out.println("[경고] 입력오류");
            }
        }




    } // m e
} // c e
