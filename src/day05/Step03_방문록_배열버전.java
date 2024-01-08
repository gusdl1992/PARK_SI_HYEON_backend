package day05;

import java.util.Scanner;

public class Step03_방문록_배열버전 {

    public static void main(String[] args) {

        // * 입력객체
        Scanner scanner = new Scanner(System.in);
        // 5-1 저장할 배열 변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];

        // 1. 무한루프
        while (true){
            // 2. 출력
            System.out.println("========== 방문록 ==========");
            // for문 이용한 배열내 모든 항목/요소 호출 : 0부터 2까지 1씩 증가. 나머지는 코드가 반복되네.
            for(int index = 0; index < 내용배열.length ; index++){

                // !!!!! 타입은 클래스 이지만 . null 비교시에는 비교연산자 사용.
                if(내용배열[index] != null){    // 유효성 검사
                    System.out.printf("%2d \t %-5s \t %-20s \n" , index + 1 , 작성자배열[index] , 내용배열[index]);
                }
            }
            System.out.println(" 1.방문록 작성 2.방문록 삭제 3.종료");
            // 3. 입력
            System.out.print(" 선택>  ");   int ch = scanner.nextInt();

            // 4. 입력된 경우의수 판단.
            if( ch == 1){
                // 6-1 입력 : 방문록 작성활 위치(인덱스) 입력 받는다.
                System.out.print("방문록 작성위치 : 1. 2. 3. : ");
                // 입력 : 위치
                int no = scanner.nextInt() - 1;
                scanner.nextLine(); // nextInt 엔터값 초기화용

                // 6-2 입력 : 내용 , 작성자 , 비밀번호
                System.out.print("내용 :");
                String content = scanner.nextLine();
                System.out.print("작성자 :");
                String writer = scanner.next();
                System.out.print("비밀번호 :");
                int password = scanner.nextInt();
                scanner.nextLine(); // nextInt 엔터값 초기화용

                // 6-3 배열에 각각 대입하기.
                내용배열[ no ] = content;
                작성자배열[ no ] = writer;
                비밀번호배열[ no ] = password;

            } else if (ch == 2) {
                // 8-1 입력 : 삭제할 방문록의 위치(인덱스) 입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                // 입력 : 위치
                int no = scanner.nextInt() - 1;
                scanner.nextLine(); // nextInt 엔터값 초기화용

                // 8-2 입력 : 유효성 검사를 위한 비밀번호 입력받기
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();
                scanner.nextLine(); // nextInt 엔터값 초기화용

                // 8-3 초기화 : 만약에 인덱스가 없는 번호를 선택했을때.
                if (no < 0 || no > 내용배열.length){
                    System.out.println("[경고] 알수없는 위치 입니다.");
                } else if (비밀번호배열[ no ] == password) { // 만약에 선택한 방문록의 패스워드 와 방금 입력한 패스워드와 같으면.

                    // 배열의 항목/요소의 자리/길이 삭제할수 없으므로 초기값으로 대입.
                    내용배열[no] = null; 작성자배열[no] = null;  비밀번호배열[no] = 0;
                }else {
                    System.out.println("[경고]");
                }

            } else if (ch == 3) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }else {
                System.out.println("[경고] 알수없는 입력입니다.");
            }

        } // w e

    } // m e
} // c e
