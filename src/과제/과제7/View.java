package 과제.과제7;

import java.util.Scanner;

// 입출력
public class View {

    // 입출력 스캐너
    static Scanner sc = new Scanner(System.in);

    // 싱글톤
    private View(){}
    private static View view = new View();
    public static View getInstance(){return view;}

    public static void main(String[] args) {

        while (true){
            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = sc.nextInt();

            if ( ch == 1){
                회원가입();
            } // 회원가입
            else if ( ch == 2){
                로그인();
            }// 로그인
            else if ( ch == 3){
                아이디찾기();
            }// 아이디찾기
            else if ( ch == 4){
                비밀번호찾기();
            } // 비밀번호찾기
            else {
                System.out.println("올바른 선택이 아닙니다.");
            }
        } // w e
    } // m e

    static public void 회원가입(){
        // 입력
        System.out.print("아이디 : > ");      String 아이디 = sc.next();
        System.out.print("비밀번호 : > ");     String 비밀번호 = sc.next();
        System.out.print("이름 : > ");        String 이름 = sc.next();
        System.out.print("전화번호 : > ");     String 전화번호 = sc.next();
        System.out.print("나이 > ");          int 나이 = sc.nextInt();
        sc.nextLine(); // nextInt() 엔터값 초기화
        // 객체화
        MemberDto memberDto = new MemberDto(아이디 , 비밀번호 , 이름 , 전화번호, 나이);
        // 객체를 컨트롤러에 전달
        boolean result = Controller.getInstance().회원가입(memberDto);
        System.out.println("[뷰]result = " + result);
        // 결과값 비교
        if (result){
            System.out.println("회원가입 성공!");
        }else {
            System.out.println("회원가입 실패!");
        }
    }

    static public void 로그인(){
        // 입력
        System.out.print("아이디 : > ");      String 아이디 = sc.next();
        System.out.print("비밀번호 : > ");     String 비밀번호 = sc.next();
        // 객체화
        MemberDto memberDto = new MemberDto();
        memberDto.set아이디(아이디);
        memberDto.set비밀번호(비밀번호);
        // 객체를 컨트롤러에 전달
        boolean result = Controller.getInstance().로그인(memberDto);
        // 처리 결과
        if (result){
            System.out.println("로그인 성공!");
        }else {
            System.out.println("로그인 실패!");
        }
    }
    
    static void 아이디찾기(){
        // 입력
        System.out.print("이름 : > ");      String 이름 = sc.next();
        System.out.print("전화번호 : > ");     String 전화번호 = sc.next();
        // 객체
        MemberDto memberDto = new MemberDto();
        memberDto.set이름(이름);
        memberDto.set전화번호(전화번호);
        // 값 전달
        String str = Controller.getInstance().아이디찾기(memberDto);
        // 처리 결과
        if (str == null){
            System.out.println("회원정보가 일치하지 않습니다.");
        }else {
            System.out.println("회원의 아이디는 : " + str + " 입니다.");
        }
    }
    static void 비밀번호찾기(){
        // 입력
        System.out.print("아이디 : > ");      String 아이디 = sc.next();
        System.out.print("전화번호 : > ");     String 전화번호 = sc.next();
        // 객체
        MemberDto memberDto = new MemberDto();
        memberDto.set아이디(아이디);
        memberDto.set전화번호(전화번호);
        // 값 전달
        String str = Controller.getInstance().비밀번호찾기(memberDto);
        // 처리 결과
        if(str == null){
            System.out.println("회원정보가 없습니다.");
        }else {
            System.out.println("회원의 비밀번호는 : " + str + " 입니다.");
        }

    }

} // c e
/*
            [ 기능 구현 - 과제6 동일 하며 MVC패턴으로 구현하시오. ]
		1. 초기 메뉴 ( VIEW )
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		2. 기능 조건 ( CONTROLLER , DAO )
			1. 회원가입 메소드
			2. 로그인 메소드
			3. 아이디찾기 메소드
			4. 비밀번호찾기 메소드
 */