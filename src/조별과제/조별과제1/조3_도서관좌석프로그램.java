package 조별과제.조별과제1;

import java.util.Scanner;

public class 조3_도서관좌석프로그램 {

    public static void main(String[] args) {

        /*
            3. 도서관 좌석 프로그램 ( 1~3 좌석 3개 )
            [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
            1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
             String 좌석1 = "";      String 좌석2= "";       String 좌석3="";
             String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
             String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";

             2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 좌석 상황을 반복적으로 출력합니다.

            3. 입실: 사용자로부터 좌석 선택과 전화번호 를 입력받습니다.
             - 단 해당 층에 차량이 있을경우 '입실불가' 없으면 '입실완료' 출력 합니다.

             4. 퇴실 : 사용자로부터 좌석 과 현재시간(시/분)을 입력받습니다.
             - 단 해당 층에 차량이 있을경우 '퇴실완료[ 좌석을 이용한 시간(분) : 000분 ] ' 없으면 '입실이 없습니다' 출력 합니다.

            5. 계산 : 총 사용시간을 계산합니다.

         */
        Scanner scanner = new Scanner(System.in);
        String 좌석1 = "빈자리";    String 좌석2 = "빈자리";    String 좌석3 = "빈자리";
        String 좌석1시 = "";   String 좌석2시 = "";   String 좌석3시 = "";
        String 좌석1분 = "";   String 좌석2분 = "";   String 좌석3분 = "";
        int 좌석1총분 = 0;  int 좌석2총분 = 0;  int 좌석3총분 = 0;

        boolean button = true;

        while (button){

            System.out.println("==================================================");
            System.out.println(" 1. 입실 | 2. 퇴실 | 3. 좌석 표시 | 4. 종료");
            System.out.println("==================================================");
            System.out.print("사용하 실 번호를 입력 하세요. : ");
            int num = scanner.nextInt();

            // 입실 시작
            if(num == 1){
                System.out.println("===============좌석 상황===============");
                System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                System.out.print("사용하 실 좌석을 입력 해 주세요. : ");
                int 좌석번호입력 = scanner.nextInt();
                System.out.print("\n");
                scanner.nextLine(); // scanner.nextInt(); 사용후 개행문자 제거에 사용

                // 좌석 배정 시작
                if (좌석번호입력 == 1 && 좌석1.equals("빈자리")){
                    System.out.print("전화번호를 입력해주세요. : ");
                    좌석1 = scanner.nextLine();
                    System.out.print("입실 시 를 입력해주세요. : ");
                    좌석1시 = scanner.nextLine();
                    System.out.print("입실 분 를 입력해주세요. : ");
                    좌석1분 = scanner.nextLine();
                    System.out.println("입실이 완료 되었습니다!");
                    좌석1총분 = ((Integer.parseInt(좌석1시)) * 60 + Integer.parseInt(좌석1분));       // 시간을 분으로 계산해서 저장

                    // 입실 후 좌석 상황 출력
                    System.out.println("===============좌석 상황===============");
                    System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                }else if (좌석번호입력 == 2 && 좌석2.equals("빈자리")){
                    System.out.print("전화번호를 입력해주세요. : ");
                    좌석2 = scanner.nextLine();
                    System.out.print("입실 시 를 입력해주세요. : ");
                    좌석2시 = scanner.nextLine();
                    System.out.print("입실 분 를 입력해주세요. : ");
                    좌석2분 = scanner.nextLine();
                    System.out.println("입실이 완료 되었습니다!");
                    좌석2총분 = ((Integer.parseInt(좌석2시)) * 60 + Integer.parseInt(좌석2분));       // 시간을 분으로 계산해서 저장

                    // 입실 후 좌석 상황 출력
                    System.out.println("===============좌석 상황===============");
                    System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                } else if (좌석번호입력 == 3 && 좌석3.equals("빈자리")) {
                    System.out.print("전화번호를 입력해주세요. : ");
                    좌석3 = scanner.nextLine();
                    System.out.print("입실 시 를 입력해주세요. : ");
                    좌석3시 = scanner.nextLine();
                    System.out.print("입실 분 를 입력해주세요. : ");
                    좌석3분 = scanner.nextLine();
                    System.out.println("입실이 완료 되었습니다!");
                    좌석3총분 = ((Integer.parseInt(좌석3시)) * 60 + Integer.parseInt(좌석3분));       // 시간을 분으로 계산해서 저장
                    // 입실 후 좌석 상황 출력
                    System.out.println("===============좌석 상황===============");
                    System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                }else { // 좌석이 빈좌석이 아니면 실행
                    System.out.println("사용중인 좌석이거나 없는 좌석 입니다.");
                } // 좌석 if end
                // 입실 if end

                // 퇴실 시작
            } else if (num == 2) {
                System.out.println("===============좌석 상황===============");
                System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                System.out.print("퇴실하실 좌석을 입력 해 주세요. : ");
                int 좌석번호입력 = scanner.nextInt();
                System.out.print("\n");
                scanner.nextLine(); // scanner.nextInt(); 사용후 개행문자 제거에 사용

                // 좌석 입력받은 후 퇴실 시작
                if(좌석번호입력 == 1 && !(좌석1.equals("빈자리"))){
                    System.out.println("퇴실실행");
                    System.out.print("퇴실 시 를 입력해주세요. : ");
                    String 퇴실시간 = scanner.nextLine();
                    System.out.print("퇴실 분 를 입력해주세요. : ");
                    String 퇴실분 = scanner.nextLine();
                    int 퇴실총분 = Integer.parseInt(퇴실시간) * 60 + Integer.parseInt(퇴실분);
                    if( !(퇴실총분 < 좌석1총분)){
                        System.out.printf("%s 퇴실 하였습니다. \n" , 좌석1);
                        System.out.printf("사용시간 : %d시 %d분 입니다. \n" , (퇴실총분-좌석1총분)/60 , (퇴실총분-좌석1총분)%60);
                        좌석1 = "빈자리";        // 초기화
                        좌석1시 = "";          // 초기화
                        좌석1분 = "";          // 초기화
                        // 퇴실 후 좌석 표시
                        System.out.println("===============좌석 상황===============");
                        System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                    }else {
                        System.out.println("퇴실시간이 입실시간보다 작을수 없습니다! 퇴실시간 확인해주세요.");
                    }

                } else if (좌석번호입력 == 2 && !(좌석2.equals("빈자리"))) {
                    System.out.println("퇴실실행");
                    System.out.print("퇴실 시 를 입력해주세요. : ");
                    String 퇴실시간 = scanner.nextLine();
                    System.out.print("퇴실 분 를 입력해주세요. : ");
                    String 퇴실분 = scanner.nextLine();
                    int 퇴실총분 = Integer.parseInt(퇴실시간) * 60 + Integer.parseInt(퇴실분);
                    if( !(퇴실총분 < 좌석2총분)){
                        System.out.printf("%s 퇴실 하였습니다. \n" , 좌석2);
                        System.out.printf("사용시간 : %d시 %d분 입니다. \n" , (퇴실총분-좌석2총분)/60 , (퇴실총분-좌석2총분)%60);
                        좌석2 = "빈자리";        // 초기화
                        좌석2시 = "";           // 초기화
                        좌석2분 = "";          // 초기화
                        // 퇴실 후 좌석 표시
                        System.out.println("===============좌석 상황===============");
                        System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                    }else {
                        System.out.println("퇴실시간이 입실시간보다 작을수 없습니다! 퇴실시간 확인해주세요.");
                    }
                } else if (좌석번호입력 == 3 && !(좌석3.equals("빈자리"))) {
                    System.out.println("퇴실실행");
                    System.out.print("퇴실 시 를 입력해주세요. : ");
                    String 퇴실시간 = scanner.nextLine();
                    System.out.print("퇴실 분 를 입력해주세요. : ");
                    String 퇴실분 = scanner.nextLine();
                    int 퇴실총분 = Integer.parseInt(퇴실시간) * 60 + Integer.parseInt(퇴실분);
                    if( !(퇴실총분 < 좌석3총분)){
                        System.out.printf("%s 퇴실 하였습니다. \n" , 좌석3);
                        System.out.printf("사용시간 : %d시 %d분 입니다. \n" , (퇴실총분-좌석3총분)/60 , (퇴실총분-좌석3총분)%60);
                        좌석3 = "빈자리";        // 초기화
                        좌석3시 = "";          // 초기화
                        좌석3분 = "";          // 초기화
                        // 퇴실 후 좌석 표시
                        System.out.println("===============좌석 상황===============");
                        System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
                    }else {
                        System.out.println("퇴실시간이 입실시간보다 작을수 없습니다! 퇴실시간 확인해주세요.");
                    }
                }else {
                    System.out.println("입실한 좌석이 아닙니다. 좌석을 확인해주세요.");
                }// 좌석퇴실 if 끝
                // 퇴실 end

                // 좌석 조회 시작
            } else if (num == 3) {
                System.out.println("===============좌석 상황===============");
                System.out.printf("좌석1 : %s | 좌석2 : %s | 좌석3 : %s \n" , 좌석1 , 좌석2 , 좌석3);
            } else if (num == 4) {  // 프로그램 종료
                button = false; // while 문 종료 false 스위치
                System.out.println("프로그램을 종료 합니다.");
            }else {
                // 1 ~ 4 숫자를 입력 안했을 시 실행
                System.out.println("입력이 잘못되었습니다 올바른 입력 부탁드립니다.");
            }

        } // w e


    }   // m e

} // c e
