package day22.step4;

public class Box3 <T>{
    // 제네릭 타입 : 클래스 선언시 타입을 정하지 않고 사용(객체생성) 시 정의

    // 1. 필드
    private T t; // t필드는 제네릭 타입 ( 정해져 있지 않다. )
    
    // 2. 생성자
    
    // 3. 메소드
        // get / set
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
/*
    Box3 <Integer> box = new Box3<>()
        box{
            private Integer t
            public Integer geT(){ return t; }
            public Integer setT(){ this.t = t; }
        }

    Box3 <String> box = new Box3<>()
        box{
            private String t
            public String geT(){ return t; }
            public String setT(){ this.t = t; }
        }

 */
