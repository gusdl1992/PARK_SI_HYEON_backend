package 박시현개인연습.조별과제2_연습;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Member[] memberArray = new Member[100];
    static Service[] serviceArray = new Service[100];
    static boolean btn = false;

    public static void main(String[] args) {

        while (true){
            System.out.println("============== 메뉴 ===========");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.종료 ");
            System.out.println("============================");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if (ch == 1){
                Member member = 로그인();
                while (btn){
                    if(구독검사(member)){
                        서비스출력(member);
                    }else {
                        구독가입(member);
                    }
                } // w e
            } // ch if e
            if (ch == 2){
                회원가입();

            } // ch if e
            if (ch == 3){
                break;
            } // ch if e
        }

    } // m e

    static Member 로그인(){
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = scanner.next();
        Member member = null;
        for (int i = 0; i < memberArray.length; i++){
            if(memberArray[i] != null){
                if (memberArray[i].id.equals(id) && memberArray[i].pw.equals(pw)){
                    System.out.println("로그인 성공!");
                    System.out.println(memberArray[i].toString());
                    btn = true;
                    member = memberArray[i];
                    break;
                } // 2 if e
            } // 1 if e
        } // for e
            return member;
    }
    static void 회원가입(){
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = scanner.next();
        System.out.print("이름을 입력해주세요 : ");
        String name = scanner.next();
        System.out.print("주민등록번호를 입력해주세요 : ");
        String rrn = scanner.next();
        System.out.print("핸드폰번호를 입력해주세요 : ");
        String phone = scanner.next();
        Member.count++;
        Member member = new Member(id ,pw ,name ,rrn ,phone);
        for(int i = 0 ; i < memberArray.length; i++){
            if(memberArray[i] == null){
                memberArray[i] = member;
                System.out.println("회원가입 성공!");
                break;
            }
        }
        return;
    }
    // 구독신청중인지 검사
    static boolean 구독검사(Member member){
        for (int i = 0 ; i < serviceArray.length; i++){
            if (serviceArray[i] != null && serviceArray[i].memberNum == member.memberNum){
                return true;
            }
        }
        return false;
    }
    // 구독 가입신청
    static void 구독가입(Member member){
        Service service = null;
        System.out.println("============== 구독신청 ===========");
        System.out.println(" 1.Basic | 2.Standard | 3.Premium");
        System.out.println("============================");
        System.out.print("선택 > ");
        int no = scanner.nextInt();
        if(no == 1){
            System.out.print("basic 가격은 : 5000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if( ch == 1){
                System.out.println("5000원 지불 하였습니다.");
                service = new Service(1,member);
                for (int i = 0; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                        break;
                    }
                }
            }else {
                System.out.println("구매를 거절 하셨습니다.");
            }
        }else if(no == 2){
            System.out.print("standard 가격은 : 10000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if( ch == 1){
                System.out.println("10000원 지불 하였습니다.");
                service = new Service(2,member);
                for (int i = 0; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                        break;
                    }
                }
            }else {
                System.out.println("구매를 거절 하셨습니다.");
            }
        }else if(no == 3){
            System.out.print("premium 가격은 : 15000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if( ch == 1){
                System.out.println("15000원 지불 하였습니다.");
                service = new Service(3,member);
                for (int i = 0; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                        break;
                    }
                }
            }else {
                System.out.println("구매를 거절 하셨습니다.");
            }
        }
    }
    // 서비스 출력
    static void 서비스출력(Member member){
        Service service = null;
        for(int i = 0; i < serviceArray.length; i++){
            if(serviceArray[i] != null && serviceArray[i].memberNum == member.memberNum){
                service = serviceArray[i];
                break;
            }
        }
        while (true){
            System.out.println("======== 서비스 선택 메뉴 ======");
            System.out.println("1.내정보 2.서비스연장신청 3.로그아웃");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if ( ch == 1){
                Service.내정보출력(service);
                break;
            } else if (ch == 2) {
                Service.서비스연장신청(service);
                break;
            } else if ( ch == 3) {
                btn = false;
                return;
            }else {
                System.out.println("[경고] 올바른선택이 아닙니다.");
                break;
            }
        }
    }
} // c e
