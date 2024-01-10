package day07;

import java.util.Scanner;

public class Step4_전화번호부_객체 {

    public static void main(String[] args) {

        /*
               [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  null
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 3(객체D)  null    null
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>

         */

        Scanner scanner = new Scanner(System.in);
        Phone[] phoneBook = new Phone[100];

        while (true){
            System.out.println("================== 전화번호부 ==================");
            System.out.println("1.전화번호 등록 | 2.전화번호 삭제 | 3.전화번호 출력");
            System.out.println("=============================================");
            System.out.print("입력 >");
            int ch = scanner.nextInt();
            scanner.nextLine(); // nextInt() 엔터값 없애기

            if (ch == 1){
                System.out.print("이름을 입력해주세요. >");
                String name = scanner.nextLine();
                System.out.print("전화번호를 입력해주세요. >");
                String pon = scanner.nextLine();
                phoneBook[Phone.count] = new Phone( name , pon);

            } else if (ch == 2) {
                System.out.println("============= 삭제할 순번 입력 =============");
                int num = scanner.nextInt();    // 삭제 순번 입력
                scanner.nextLine(); // nextInt() 엔터값 없애기

                for(int i = num ; i < phoneBook.length-1 ; i++){
                    phoneBook[i] = phoneBook[i+1];
                    if(phoneBook[i] != null){
                        phoneBook[i].countNumber -= 1;
                    }
                }


            } else if (ch == 3) {
                System.out.println("============= 전화번호부 =============");
                System.out.println("순번     이름      전화번호");
                for (int i = 0 ; i < phoneBook.length-1 ; i++){
                    if (phoneBook[i] != null){
                        System.out.print(phoneBook[i].countNumber);
                        System.out.print("\t" + phoneBook[i].name);
                        System.out.print("\t" + phoneBook[i].ponNumber);
                        System.out.println();
                    }
                }
            }else {
                System.out.println("[경고] 올바른 입력이 아닙니다.");
            }

        }


    }

}


/*
                // 객체 배열만큼 반복
                for (int i = 0; i < phoneBook.length; i++){
                    // 객체 배열이 null 이 아니면 if 실행
                    if(phoneBook[i] != null){
                        // 입력받을 삭제값과 객체의 countNumber 속성 비교
                        if(num == phoneBook[i].countNumber){
                            // 클래스 안에 스태틱 변수 - 1 (생성시 값을 다시 주기위해)
                            Phone.count -= 1;
                            // 배열에 객체 초기화 (삭제)
                            phoneBook[i] = null;
                            // 찾은 객체번호 cnum에 대입
                            int cnum = i;
                            for (int j = cnum+1; j < phoneBook.length; j++){
                                if(phoneBook[j] != null && phoneBook[j+1] !=null){
                                    phoneBook[cnum] = phoneBook[j];
                                    phoneBook[cnum].countNumber -= 1;
                                    cnum++;
                                } // 2 for 1 if e

                            } // 2 for e
                        } // 1for 2if e
                    } // 1for 1if e

                } // 1 for e
 */