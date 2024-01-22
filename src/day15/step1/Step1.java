package day15.step1;

public class Step1 {

    public static void main(String[] args) {

        // 1. (운전자)객체 생성
        Driver driver1 = new Driver();
        // 2. 객체 생성
        Bus bus = new Bus();
        driver1.drive(bus);  // 버스 운전
        // 3. 객체 생성
        Taxi taxi = new Taxi();
        driver1.drive(taxi); // 택시로 변경
        
        Driver driver2 = new Driver();
        
        driver2.drive(taxi); // 운전자2 택시A 운행
        driver1.drive(taxi); // 운전자1 택시A 운행
        
        Taxi taxi2 = new Taxi();
        driver2.drive(taxi2); // 운전자2 택시B 운행
    } // m e
} // c e
