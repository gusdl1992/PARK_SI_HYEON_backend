package day15.step1;

public class Driver {   // 운전자(사람)

    // 메소드 ( 객체의 행위 , 이벤트 ) 매개변수로 운전할 매개체 ( 버스/택시 )
        // 버스와 택시 를 모두 매개변수로 받고 싶을때 상위 클래스로 하자.
    public void drive(Vehicle vehicle){
        vehicle.run();
        // - 자식타입으로 다시 변환. ( 강제타입 = 캐스팅 )
        // !!! : instanceOf 연산자
        // 객체명 instanceOf 타입
        System.out.println(vehicle instanceof  Bus ? "<버스타입입니다.>." : "<택시타입입니다>");
        System.out.println(vehicle instanceof  Taxi ? "택시타입입니다." : "<버스타입입니다>");

        // 자식객체는 생성시 부모객체도 먼저 생성한다.
        Bus bus2 = new Bus();
        System.out.println(bus2 instanceof Vehicle);
        // Object : 자바의 모든 클래스의 최상위 부모
        System.out.println(vehicle instanceof Object);  // True

    }
}
