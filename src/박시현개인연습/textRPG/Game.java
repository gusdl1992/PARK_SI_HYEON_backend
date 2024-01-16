package 박시현개인연습.textRPG;

import java.util.Scanner;

public class Game {
    // 전역 필드
    // 몬스터 저장 배열
    static Monster[] monsterArray = new Monster[10];
    static Scanner sc = new Scanner(System.in);
    // 게임 흐름 제어
    static boolean btn = true;

    public static void main(String[] args) {
        // 게임시작시 안내 및 캐릭터 생성 클래스
        StartCh startCh = new StartCh();
        // 캐릭터 객체 저장
        Character character = null;



        character = startCh.캐릭터생성();

        while (btn){
            Gameloop.게임루프(character);


        }




    } // m e
} // c e
