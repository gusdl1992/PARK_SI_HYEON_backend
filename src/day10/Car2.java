package day10;

public class Car2 {
    
    // 멤버
    // 1. (정적/인스턴스) 필드
    int speed; // 인스턴스
    static int speed2; // 정적필드
    
    // 2. 생성자
    // 3. (정적/인스턴스) 메소드
    
    void  run(){ // 인스턴스 메소드
        
    }  
    
    static void simuldate(){ // 정적(static) 메소드
        // System.out.println(this.speed);// 오류 :static 메소드에서 인스턴스 필드 호출 불가능
        System.out.println(speed2); // static 메소드에서 정적 필드 호출가능
        // this 는 해당 메소드를 실행한 객체의 주체자.
        // static 객체없이 사용하는 메소드 이니까. 곧 this 가 없다.
    }
    
    void simuldate2(){ // 인스턴스 메소드
        System.out.println(this.speed);// 인스턴스 메소드에서 인스턴스필드 호출가능
        System.out.println(speed2); // 인스턴스 메소드에서 정적 필드 호출 가능
    }
    
    public static void  main(String[] args){ // main 함수는 클래스없이 자바를 실행 하므로 정적메소드로 사용
        
        simuldate(); // stati 구역에서 static 메소드 호출 가능
        // simuldate2(); // 오류 : static 구역에서 인스턴스 메소드 호출 불가능
        // 해결책 : 객체만들기
        new Car2().simuldate2(); // 가능
        
    }
}
