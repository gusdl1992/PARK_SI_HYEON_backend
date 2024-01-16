package 박시현개인연습.textRPG;

import static 박시현개인연습.textRPG.Game.*;

public class Gameloop {

    static void 게임루프(Character 캐릭터){
        Character character = 캐릭터;

        System.out.println("======================================");
        System.out.println("1.내정보 2.마을 3.사냥터 4.종료");
        System.out.print("입력 > ");
        int ch = sc.nextInt();
        sc.nextLine(); // nextInt 초기화

        if ( ch == 1){
            System.out.println(character.toString());

        } else if (ch == 2) {
            System.out.println("마을입니다!");
        } else if (ch == 3) {
            Monster monster = new Monster("토끼" ,20 ,8 ,3 ,6);
            monsterArray[0] = monster;
            while (true){
                if (monsterArray[0].getHp() <= 0){
                    System.out.println(character.getName() + "의 승리!");
                    break;
                }
                if(character.getHp() <= 0){
                    System.out.println(monsterArray[0].getName() + "의 승리!");
                    break;
                }
                character.attack(monsterArray[0]);
                monsterArray[0].mattack(character);
            }

        } else if (ch == 4) {
            btn = false;
            System.out.println("게임을 종료 합니다.");
        }else {
            System.out.println("[경고] 올바른 입력이 아닙니다.");
        }

    }

}
