package day20.step3;

public class InterfaceCImpl implements InterfaceC{
    // 자식 인터페이스를 구현할때 부모 인터페이스 구현 해야한다.
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl-methodC() 실행");
    }
}
