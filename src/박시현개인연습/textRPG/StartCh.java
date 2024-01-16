package 박시현개인연습.textRPG;

import static 박시현개인연습.textRPG.Game.btn;
import static 박시현개인연습.textRPG.Game.sc;

public class StartCh {
        Character character = null;

        Character 캐릭터생성(){
            System.out.println("==========================================");
            System.out.println("\tRPG 게임에 오신걸 환영 합니다.");
            System.out.println("==========================================");
            System.out.println("1. 캐릭터 생성 \t 2. 종료");
            System.out.print("입력 > ");
            int ch = sc.nextInt();
            sc.nextLine(); // nextInt 엔터값 초기화

            if(ch == 1){

                System.out.print("캐릭터 이름을 입력해주세요! : ");
                String 이름 = sc.nextLine();
                if(이름 != null && 이름.isEmpty()){
                    // isEmpty() 빈문자열 확인 return boolean
                    System.out.println("[경고] 캐릭터 이름 오류 입니다.");
                    this.캐릭터생성();
                }else {
                    // 캐릭터 생성
                    character = new Character(이름);
                }

            }else if(ch == 2){
                // 게임종료 메서드 호출
                종료();
            }else {
                System.out.println("올바른 입력이 아닙니다.");
                this.캐릭터생성(); // 재호출
            }
            return character;
        }

        void 종료(){
            btn = false;
            System.out.println("게임을 종료 합니다.");
            return;
        }


}
