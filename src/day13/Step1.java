package day13;

public class Step1 {

    public static void main(String[] args) {


        // p. 286 ~

            // 왜? SmartPhone 클래스의 객체를 생성 했는데 Phone 멤버 호출이 가능한 이유 : 상속받아서. / 물려받았기 떄문에.

            // 1. SmartPhone 클래스 의 객체 생성 ( + phone )
        SmartPhone myPhone = new SmartPhone("갤럭시" , "은색");

            // 2. SmartPhone 객체내 필드 호출 ( + phone 필드 호출 )
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        // 3. SmartPhone 객체내 필드 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        // 4.
        myPhone.bell(); // SmartPhone 객체내 메소드 호출 ( + phone 메소드 호출 )
        myPhone.sendVoice("여보세요");  // SmartPhone 객체내 메소드 호출 ( + phone 메소드 호출 )
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요."); // SmartPhone 객체내 메소드 호출 ( + phone 메소드 호출 )
        myPhone.sendVoice("아~네 반갑습니다.");    // SmartPhone 객체내 메소드 호출 ( + phone 메소드 호출 )
        myPhone.hangUp();   // SmartPhone 객체내 메소드 호출 ( + phone 메소드 호출 )

        // 5.
        myPhone.setWifi( (true) ); // SmartPhone 객체내 메소드 호출
        myPhone.internet(); // SmartPhone 객체내 메소드 호출
    } //  m e
} // c e
