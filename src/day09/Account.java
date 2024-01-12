package day09;

public class Account {

    // 1. 필드
    String accountNumber;
    String name;
    String money;


    // 2. 생성자

    // 기본생성자
    Account(){
        super();
    }


    // 매개변수 있는 생성자
    Account(String accountNumber , String name , String money){
        super();
        this.accountNumber = accountNumber;
        this.name = name;
        this.money = money;
    }

    // 3. 메소드
    void 예금(String money){
        int 받은금액 = Integer.parseInt(money);
        int 기존금액 = Integer.parseInt(this.money);
        int 총금액 = 기존금액 + 받은금액;
        this.money = Integer.toString(총금액);
        System.out.println("예금성공");
    }
    void 출금(String money){
        int 받은금액 = Integer.parseInt(money);
        int 기존금액 = Integer.parseInt(this.money);
        if(기존금액 < 받은금액){
            System.out.println("예금액 보다 더 큰 금액을 출금할수 없습니다.");
        }else {
            int 총금액 = 기존금액 - 받은금액;
            this.money = Integer.toString(총금액);
        }

    }

}
