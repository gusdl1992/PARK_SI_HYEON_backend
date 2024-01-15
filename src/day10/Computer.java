package day10;

import java.util.Arrays;

public class Computer {
    // 클래스 멤버
    // 1. 필드
    // 2. 생성자
    // 3. 메소드
        // 0. 고정 길이 매개변수
    int sum2( int x , int y){
        int result = x + y;
        return  result;
    }
        // 1. 가변길이 매개변수
    int sum (int ...values){
        System.out.println("values = " + values);
        // 배열의 주소값 출력
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        // Arrays.toString(배열명); : 배열의 모든 요소들 값을 문자열로 출력해주는 함수(라이브러리)
        int sum = 0;
        for(int i = 0 ; i< values.length; i++){
            sum += values[i];
        }
        return sum;
    }

        // 2. 배열 매개변수
    int sum3 (int[] values){
        System.out.println("values = " + Arrays.toString(values));
        return 0;
    }

}
