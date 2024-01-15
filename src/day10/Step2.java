package day10;

public class Step2 {

    public static void main(String[] args) {

        // p.234 : 가변길이 매개변수
            // 메소드를 호출할때에는 매개변수의 개수에 맞게 매개값을 제공
            // 가변길이 매개변수를 가지고 있다면 개수와 상관없이 매개값을 줄수있다.

        // - 다른 클래스에 있는 메소드를 사용하고 싶을떄.
        // Arrays.toString(배열명); : 배열의 모든 요소들 값을 문자열로 출력해주는 함수(라이브러리)

        // 1. 객체 생성
        Computer myCom = new Computer();
        // 2. 메소드 호출
        int result0 = myCom.sum2(1,2);
        System.out.println("result0 = " + result0);

        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 = " + result1);
        
        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);

        int[] valuse = { 1 , 2, 3,4,5};
        int result3 = myCom.sum(valuse);
        System.out.println("result3 = " + result3);

        int result4 = myCom.sum( new int[]{1,2,3,4,5} );
        System.out.println("result4 = " + result4);

        // vs
        int result5 = myCom.sum3(valuse);

        // 매개변수 전달이 배열이 아닌경우는 오류발생 ( 매개변수 배열 선언 시)
        // int result6 = myCom.sum3(1,2,3);

    } // m e
} // c e
