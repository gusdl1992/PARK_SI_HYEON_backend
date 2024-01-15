package 박시현개인연습.조별과제2_연습;

import static 박시현개인연습.조별과제2_연습.Main.memberArray;
import static 박시현개인연습.조별과제2_연습.Main.scanner;

public class Service {


    // 필드
    int memberNum;  // 고객고유 번호
    String rating;  // 등급
    double volume;  // 용량 10.0 , 20,0 30,0
    String period; // 30일
    int price;  // 5000 , 10000 ,15000

    Service(int num , Member member){
        if (num == 1){
            this.memberNum = member.memberNum;
            this.rating = "Basic";
            this.volume = 10.0;
            this.period = "30";
            this.price = 5000;
        }else if(num == 2){
            this.memberNum = member.memberNum;
            this.rating = "standard";
            this.volume = 20.0;
            this.period = "30";
            this.price = 10000;
        }else if (num == 3){
            this.memberNum = member.memberNum;
            this.rating = "premium";
            this.volume = 30.0;
            this.period = "30";
            this.price = 15000;
        }
    }
    static void 내정보출력(Service service){
        Service s = service;
        for(int i = 0 ; i < memberArray.length ; i++){
            if(s.memberNum == memberArray[i].memberNum){
                System.out.printf("아이디 : %-10s 닉네임 : %-6s 등급 : %-10s 총용량 : %.1fGB 사용기간 %-5s일\n", memberArray[i].id,memberArray[i].name ,s.rating , s.volume , s.period);
                break;
            }
        }
    }
    static void 서비스연장신청(Service service){
        Service s = service;
        System.out.println("현재 사용중인 서비스 " + s.rating + "을 연장하시겠습니까?");
        System.out.print("1.연장 2. 취소 > ");
        int ch = scanner.nextInt();
        if (ch == 1){
            int num1 = (Integer.parseInt(s.period)) + 30;
            s.period = Integer.toString(num1);
            System.out.println("연장되었습니다.");
            System.out.println("현재 사용기간은 : "+ s.period + "일 입니다..");

        } else if ( ch == 2) {
            System.out.println("취소하였습니다.");
        }else {
            System.out.println("[경고] 올바른 선택이 아닙니다.");
        }

    }

    @Override
    public String toString() {
        return "Service{" +
                "memberNum=" + memberNum +
                ", rating='" + rating + '\'' +
                ", volume=" + volume +
                ", period='" + period + '\'' +
                ", price=" + price +
                '}';
    }
}
