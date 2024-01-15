package day10;

public class Car {

    // 멤버
    // 1. 필드
      int gas;
    // 2. 생성자 : 객체 생성시 new
    Car(int gas){
        this.gas = gas;
    }
    Car(){}
    // 3. 메소드
        // 1. 필드값 변경하는 메소드 [ 매개변수 : int , 리턴 : X ]
    void setGas(int gas){
        this.gas = gas;
    }// f e
        // 2. 필드 값에 따른 결과 반환 메소드 [ 매개변수: X , 리턴 boolean ]
    boolean isLeftGas(){
        if ( this.gas == 0 ){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    } // f end
    
        // 3. 필드 값이 0 이면 무한루프가 종료되는 함수 [ 매개변수X , 리턴X ]
    void run(){
        while (true){
            if(this.gas > 0){
                System.out.println("달립니다. gas 잔량 : " + this.gas);
                gas -= 1;
            }else {
                System.out.println("멈춤니다. gas 잔량 : " + this.gas);
                return; // 메소드 종료 -> 무한루프 종료
            }
        } // while end
    } // f end
    

}
