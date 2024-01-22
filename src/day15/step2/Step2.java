package day15.step2;

public class Step2 {

    public static void main(String[] args) {
        // 1. 추상클래스의 객체 생성
        // Phone phone = new Phone() {};
        
        // 2.
        SmartPhone smartPhone = new SmartPhone("홍길동");
        Phone phone1 = new SmartPhone("홍길동");


        // 3.
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
        
        
    } // m e
} // c e
