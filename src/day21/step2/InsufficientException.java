package day21.step2;

public class InsufficientException extends Exception{
                                // extends 상속 키워드
    
    // 예외 클래스 만들기
    // 1. Exception 클래스로 부터 상속 받는다.
    // 2. Exception 클래스로부터 message 필드 사용 
    public InsufficientException(String message){
        super(); // super : 상위 객체 vs this : 본인 객체
        /*
            super               vs              this
            필드         X                     this.필드명
            생성자     super()                     X
            메소드     super.메소드명()             X
         */
    }
    
}
