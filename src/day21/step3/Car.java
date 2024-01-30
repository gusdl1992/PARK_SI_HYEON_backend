package day21.step3;

public class Car {

    private Tire tire1 = new Tire();

    // 익명 자식 객체
        // 상속 하거나 인터페이스 구현 일 경우 
    // - 익명 자식 객체 : private Tire tire2 = new Tire(){ 재정의 };
        // - 클래스가 없다 -> 설계도 없다 -> 재사용 불가능 -> 단일 객체 만들때 사용.
    
    // 1. 필드에 익명 자식객체 대입
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("금호타이어가 굴러 갑니다.");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        // 2. 지역변수 에 익명자식객체 대입
        Tire tire = new Tire(){

            @Override
            public void roll() {
                System.out.println("한국타이어가 굴러 갑니다.");
            }
        };

    }

    // 3. 매개변수에 익명자식 대입
    public void run3(Tire tire){
        tire.roll();
    }

}
