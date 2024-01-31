package day22.step3;


// 클래스 : implements 가 존재하면 구현클래스 라고 한다.
public class HomeAgency implements Rentable{
    @Override
    public Home rent() {
        return new Home();
    }
}
