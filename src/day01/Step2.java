package day01;

public class Step2 {    // C S
    public static void main(String[] args) {    // M S
        
        // p.37
        // int value; // 변순 선언했지만 초기값이 없기 떄문에  메모리 할당 없음
        // int result = value + 10;    // 오류발생 [ 초기값 없는 변수를 호출 했기 때문에 오류 발생 ]
        // java: variable value might not have been initialized
        // 해결방안 : 초기값을 대입하자.

        int value = 5;
        int result = value + 10;
        System.out.println(result);


        
    } // M E
}   // C E
