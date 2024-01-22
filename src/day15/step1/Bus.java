package day15.step1;

public class Bus extends Vehicle{

    // 부모타입으로 부터 오버라이딩 / 메서드 재정의


    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

}
