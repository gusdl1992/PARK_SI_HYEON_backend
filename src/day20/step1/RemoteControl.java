package day20.step1;


// 인터페이스 선언
public interface RemoteControl {
    // 멤버
    // 1. 상수 [ public static final --> 생략가능 ]필드
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    // 2. [ public abstract -- > 생략가능 ]추상 메소드 ********* 구현클래스에서 오버라이딩 필수
    void turnOn();      // 선언부 작성 , 실행부 작성안함
    void turnOff();
    void setVolume(int volume);

    // 3. 디폴트 [ default ] 인스턴스 메소드
    default void setMute(boolean mute){     // 선언부 작성 , 실행부 작성
        if (mute){
            System.out.println("무음 처리 합니다.");
            setVolume(MIN_VOLUME);

        }else {
            System.out.println("무음 해제합니다.");
        }

    }

    // 4. 정적[ static ] 메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다.");
        System.out.println(MAX_VOLUME); // 상수필드 호출 가능
        // turnOn(); // 실행부가 없으므로 불가능.
        // setMute(); // 실행부는 있지만 인스턴스 메소드라 불가
    }

    // 5. private vs public 메소드
        // private : 내부 ( 클래스 , 인터페이스 ) 에서 접근가능.
    // 1. 추상메소드 : 다른 곳에서 구현을 해줘야하는 메소드.
        // private abstract void turnOff2();
    // 2. 디폴트 메소드 : 구현객체
        // private default void turnOff2(){}
    private void turnOff2(){}

    // 3. 정적메소드 : 구현객체 필요없음.
    private static void turnOff3(){}

}
