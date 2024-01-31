package day22.step3;


// 클래스 : implements 가 존재하면 구현클래스 라고 한다.
public class CarAgency implements Rentable{
    @Override
    public Car rent() {
        return new Car();
    }
}
