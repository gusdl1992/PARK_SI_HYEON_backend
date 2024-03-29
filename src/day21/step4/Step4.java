package day21.step4;

public class Step4 {
    public static void main(String[] args) {

        // 1.
        Home home = new Home();
        // 익명 구현객체가 대입된 필드 사용
        home.use1();
        // 익명 구현 객체가 대입된 로컬 변수 사용
        home.use2();
        // 2. 매개변수에 익명 구현 객체 대입
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });

    }// m e
} // c e
