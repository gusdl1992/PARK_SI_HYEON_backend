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

        } //  w e

    } // m e
} // c e
