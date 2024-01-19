package day14;

public class Step3 {

    public static void main(String[] args) {
        
        // 1. 객체 생성
        Car myCar = new Car();
            // myCar.tire = null;
        // myCar.run();    // null: 참조값이 없다. -> (.) 도트연산자 사용 불가.
        // NullPointerException "this.tire" is null


        // 2. 객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();
            // myCar.tire = Tire객체참조
        myCar.run();    // System.out.println("일반 타이어가 회전합니다.");

        // ------------ 필드 다형성 : 필드가 가지고 있는 객체 참조의 다형성------------------
        myCar.tire = new HankkokTire();
            // myCar.tire = HankookTrie 객체 참조
        myCar.run();    // System.out.println("한국 타이어가 회전합니다.");

        myCar.tire = new KumhoTire();
        // myCar.tire = KumhoTire 객체 참조
        myCar.run();    // System.out.println("금호 타이어가 회전합니다.");

        // --
        myCar.tire = null;
        // myCar.run();
        // NullPointerException "this.tire" is null
    }

}
