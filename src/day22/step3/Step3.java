package day22.step3;

public class Step3 {
    public static void main(String[] args) {

        // 1. 대리점 객체 생성
        HomeAgency 상록수대리점 = new HomeAgency();

        // Rentable 상록수대리점 = new HomeAgency(); -> 오류발생 제네릭 타입 미입력
        // Rentable<Home> 안산대리점 = new HomeAgency(); -> 제네릭 타입 입력시 가능
        // 2. 렌탈 요청
        Home home = 상록수대리점.rent();
        // 3. 렌탈된 객체 이벤트 실행
        home.turnOnLight();


        // 1. 대리점 객체 생성
        CarAgency 중앙대리점 = new CarAgency();
        // 2. 렌탈 요청
        Car car = 중앙대리점.rent();
        // 3. 렌탈된 객체 이벤트 실행
        car.run();


    }// m e
} // c e
