package day20.step3;

public class Step3 {

    public static void main(String[] args) {

        // 1. (구현) 객체
        InterfaceCImpl impl = new InterfaceCImpl();
        
        // 2. 구현객체가 자식과 부모 인터페이스의 모두 대입 가능
        InterfacaA ia = impl;
        ia.methodA();
        // ia.methodB(); 오류
        System.out.println();

        InterfaceB ib = impl;
        // ib.methodA(); 오류
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    } // m e
} // c e
