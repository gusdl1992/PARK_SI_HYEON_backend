package day01;  // 1. 현재 파일의 패키지 ( 폴더 ) 위치


public class Step1 {    // 클래스 선언
    // public class : 클래스 선언     [ 자바는 무조건 클래스 단위 + 모든 코드는 클래스 안에서 작성 되야만 한다. ]
    // 클래스명 : Step1
        // * 숫자시작X , 공백X , 첫글자 대문자!!!
    // {  } : 클래스 블록/지역 : 클래스를 정의 하는 곳


    // 1. 소문자로 m -> 엔터
    // 2. sout - > 엔터
    // 3. System.out.println(" 하고싶은말 ");
    // 4. [ 실행 ]컨트롤+시프트+f10
    public static void main(String[] args) {
        
        // main : main() 메소드
        // {  } : 메소드 블록/지역 메소드 정의하는 곳
        // * 실행하면 main() 메소드 블록이 실행 된다. [ 프로그램의 진입점 ]
            // - 실행[ 선언/정의 말고 ]은 무조건 main() 안에서 시작한다.
            // - main()안에 main 스레드 [ 코드를 읽는 흐름 ] 포함

        System.out.println("안녕자바"); // <----> 콘솔에 출력하는 코드 [ Js : console.log ]
        
        
        // 한줄주석
        /* 여러줄 주석 */
        
        // 실행문 : 1. 변수선언 , 2. 변수대입 3. 메소드 호출
            // 코드마다 ; 끝마침!!
    }

}
