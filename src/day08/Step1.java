package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {

    public static void main(String[] args) {
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[100];
            // 500번지 { 500번지 [null] , 501번지[null] , 502번지[null] , 503번지[null]  }
            // 첫번째 붕어빵 구웠을떄
            // 500번지 { 500번지 [ 101번지 ] , 501번지[null] , 502번지[null] , 503번지[null]}
            // 두번쨰 붕어빵 구웠을떄
            //  500번지 { 500번지 [ 101번지 ] , 501번지[102번지] , 502번지[null] , 503번지[null]}
        Scanner scanner = new Scanner(System.in);

        while ((true)){

            System.out.println(Arrays.toString(붕어빵트레이));    // 배열내 객체들 주소 확인

            for(int i = 0 ; i < 붕어빵트레이.length; i++){
                if (붕어빵트레이[i] != null){
                    System.out.print(i + "인덱스" + 붕어빵트레이[i].속재료 + "\t\t");
                }
            }
            System.out.println();
            System.out.print("1.굽기 2.판매");
            int ch = scanner.nextInt();

            if (ch == 1){

                System.out.print("속재료 : "); String 입력속재료 = scanner.next();
                // 1. 객체생성 : 1.new -> 2. 클래스/생성자()
                붕어빵틀 붕어빵 = new 붕어빵틀(); // (1개의 주소 생성) 붕어빵 생성.
                                    // 101 번지 {}

                붕어빵.속재료 = 입력속재료;
                for(int i = 0 ; i < 붕어빵트레이.length; i++){
                    // 만약에 i번쨰 공간이 비어있으면 거기에 붕어빵 넣어라
                    if(붕어빵트레이[i] == null){
                        붕어빵트레이[i] = 붕어빵;
                        // 트레이[배열]에 붕어빵 넣었으면 끝
                        break;
                    }
                }

                // { 500 번지 = 101 번지}
            }   // if 가 끝나면 ' 붕어빵 ' 의 지역변수는 사라짐 -> 곧 객체도 사라짐.

            if(ch == 2){
                System.out.print("판매할 붕어빵 위치 :");
                int dNo = scanner.nextInt();

                // - 자바는 힙영역에 객체를 제거 하는 방법을 제공하지 않는다. 그래서 초기값 null 사용
                    // GC : 힙의 객체가 NULL 이면 자동삭제.
                붕어빵트레이[dNo] = null;
                // - 만약에 삭제할 객체 인덱스에 뒤로 객체가 존재하면 한칸씩 인덱스 옮기기

                for(int i = dNo ; i < 붕어빵트레이.length; i++){
                    // i는 삭제한 객체의 인덱스 위치 부터 마지막 인덱스 까지 반복.
                    // i+1 : 삭제한 인덱스 뒤.
                    if (i+1 == 붕어빵트레이.length){break;}   // 마지막 인덱스이면 할필요없다.
                        붕어빵트레이[i] = 붕어빵트레이[i+1];    // 뒤에 객체를 앞으로 이동.
                        // Index 5 out of bounds for length 5
                        // 길이 1 ~ 5 , 인덱스 0 ~ 4 : 1 차이

                }
            }

        } //  w e

    } // m e
} // c e
