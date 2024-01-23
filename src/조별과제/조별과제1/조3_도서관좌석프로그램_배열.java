package 조별과제.조별과제1;

import java.util.Scanner;

public class 조3_도서관좌석프로그램_배열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] 좌석배열 = new String[3];
        String[] 좌석시배열 = new String[3];
        String[] 좌석분배열 = new String[3];
        int[] 좌석총분배열 = new int[3];  // 시간계산 을 위한 좌석 시간 저장

        boolean button = true;  // while 제어

        while (button){

            System.out.println("=================================================");
            // 모든 조회 시작
            for(int index = 0; index < 좌석배열.length ; index++){
                // !!!!! 타입은 클래스 이지만 . null 비교시에는 비교연산자 사용.
                if(좌석배열[index] != null){    // 유효성 검사
                    System.out.printf("좌석%d : %s \n" , index+1 , 좌석배열[index]);
                }
            }
            System.out.println(" ========== 1. 입실 | 2. 퇴실 | 3. 종료 ==========");
            System.out.println("================================================");
            System.out.print("사용하 실 번호를 입력 하세요. : ");
            int num = scanner.nextInt();
            scanner.nextLine(); // scanner.nextInt(); 사용후 개행문자 제거에 사용
            System.out.println();   // 줄 바꿈

            // 입실 시작
            if(num == 1) {
                // 좌석 현황
                for(int index = 0; index < 좌석배열.length ; index++){
                        System.out.printf("좌석%d : %s \n" , index+1 , 좌석배열[index]);
                }
                System.out.print("사용하 실 좌석을 입력 해 주세요. : ");
                int 좌석번호입력 = scanner.nextInt() - 1; // index 0시작으로 -1 
                System.out.print("\n");
                scanner.nextLine(); // scanner.nextInt(); 사용후 개행문자 제거에 사용

                if(좌석번호입력 < 0 || 좌석번호입력 > 좌석배열.length){
                    System.out.println("[경고] 알수없는 위치 입니다.");
                }else {
                    if(좌석배열[좌석번호입력] == null){
                        System.out.print("전화번호를 입력해주세요. : ");
                        좌석배열[좌석번호입력] = scanner.nextLine();
                        System.out.print("입실 시 를 입력해주세요. : ");
                        좌석시배열[좌석번호입력] = scanner.nextLine();
                        System.out.print("입실 분 를 입력해주세요. : ");
                        좌석분배열[좌석번호입력] = scanner.nextLine();
                        System.out.println("입실이 완료 되었습니다!");
                        좌석총분배열[좌석번호입력] = ((Integer.parseInt(좌석시배열[좌석번호입력])) * 60 + Integer.parseInt(좌석분배열[좌석번호입력]));       // 시간을 분으로 계산해서 저장
                    }else {
                        // 좌석이 빈좌석이 아니면 실행
                        System.out.println("사용중인 좌석이거나 없는 좌석 입니다.");
                    }

                }
                // 퇴실 시작
            } else if (num == 2) {
                // 좌석 현황
                for(int index = 0; index < 좌석배열.length ; index++){
                    System.out.printf("좌석%d : %s \n" , index+1 , 좌석배열[index]);
                }
                // 퇴실 좌석 입력
                System.out.print("퇴실하실 좌석을 입력 해 주세요. : ");
                int 좌석번호입력 = scanner.nextInt() - 1; // index 0시작으로 -1 
                System.out.print("\n");
                scanner.nextLine(); // scanner.nextInt(); 사용후 개행문자 제거에 사용

                // 좌석 입력받은 후 퇴실 시작
                if(좌석번호입력 < 0 || 좌석번호입력 > 좌석배열.length){ // 유효성 검사
                    System.out.println("[경고] 알수없는 위치 입니다.");
                }else {
                    if(!(좌석배열[좌석번호입력] == null)){    // 좌석배열[입력받은값] 이 null 이 아닐경우
                        System.out.println("퇴실실행");
                        System.out.print("퇴실 시 를 입력해주세요. : ");
                        String 퇴실시간 = scanner.nextLine();
                        System.out.print("퇴실 분 를 입력해주세요. : ");
                        String 퇴실분 = scanner.nextLine();
                        int 퇴실총분 = Integer.parseInt(퇴실시간) * 60 + Integer.parseInt(퇴실분);

                        if( !(퇴실총분 < 좌석총분배열[좌석번호입력])){
                            System.out.printf("%s 퇴실 하였습니다. \n" , 좌석배열[좌석번호입력]);
                            System.out.printf("사용시간 : %d시 %d분 입니다. \n" , (퇴실총분-좌석총분배열[좌석번호입력])/60 , (퇴실총분-좌석총분배열[좌석번호입력])%60);
                            좌석배열[좌석번호입력] = null;        // 초기화
                            좌석시배열[좌석번호입력] = null;   // 초기화
                            좌석분배열[좌석번호입력] = null;   // 초기화
                        }else {
                            System.out.println("퇴실시간이 입실시간보다 작을수 없습니다! 퇴실시간 확인해주세요.");
                        }
                    }else {
                        System.out.println("입실한 좌석이 아닙니다. 좌석을 확인해주세요.");
                    }
                }

            } else if (num == 3) {
                System.out.println("프로그램을 종료 합니다.");
                button = false;
            } else{
                // 1 ~ 4 숫자를 입력 안했을 시 실행
                System.out.println("입력이 잘못되었습니다 올바른 입력 부탁드립니다.");
            }

        } // w e

    } // m e
} // c e
