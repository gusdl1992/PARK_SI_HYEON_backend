package day22.step3;

public interface Rentable <P>{
    // 인터페이스 제네릭타입 가능.ㄴ

    // 1. 추상메소드 ( public abstract )
    // public abstract 생략 가능
        // 메소드의 반환 타입을 제네릭타입 P

    P rent();   // ?? 렌탈 타입은 정해져 있지 않다.
    // 구현클래스 :  추상메소드의 실행부를 오버라이딩.
    // 추상메소드의 반환타입 까지 정의할수 있다.
}
