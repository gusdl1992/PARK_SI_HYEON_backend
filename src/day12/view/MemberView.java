package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDto;

import java.util.Scanner;

// VIEW : 화면구현 ( 입출력 )
public class MemberView {

    // 싱글톤
    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}

    // 1.회원가입 vuew 메소드
    public void  signup(){
        System.out.println("[1] MemberView.signup");
        // MainView.getInstance() : 싱글톤 ( 미리 만들어진 단 하나의 객체 호출 )
        Scanner scanner = MainView.getInstance().scanner;
        
        // 1. 입력받는다
        System.out.print("아이디 :");
        String id = scanner.next();
        System.out.print("비밀번호 :");
        String pw = scanner.next();
        System.out.print("이름 :");
        String name = scanner.next();
        System.out.print("전화번호 :");
        String phone = scanner.next();

        // 2. 객체화
        MemberDto memberDto = new MemberDto(0 , id , pw , name , phone);

        // 3. 객체를 컨트롤 전달(매개변수/회원가입 필요한 정보·객체)후
        // 처리 결과(리턴/회원가입 처리 결과(t성공/f실패) · boolean ) 를 받기
        // 처리결과 리턴은 byte 로 받아서 여러가지 처리 가능
        boolean result = MemberController.getInstance().signup(memberDto);
        System.out.println("[5] result = " + result);

        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내] 회원가입 성공 ");
        }else {
            System.out.println("안내] 회원가입 실패 ");
        }

        return;
    } // f end

    // 2. 로그인 메소드 ( 로그인 : 데이터 비교하는 작업 )
    public void login(){
        System.out.println("[1] MemberView.login");
        // 1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("패스워드 : ");
        String pw = scanner.next();
        
        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        // 3. 컨트롤 에게 (로그인에 필요한 정보)전달 하고 결과(boolean)받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("[5] result = " + result);

        // 4. 결과에 따른 처리
        if(result){
            System.out.println("안내 ] 로그인 성공");
            // 로그인 성공시 사용할 서비스의 view 로 이동.
        }
        else {
            System.out.println("안내 ] 로그인 실패");
        }
    } // f e

    // 아이디 찾기 메소드
    public void userFind(){
        System.out.println("[1] MemberView.userFind");
        // 입력 받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("전화번호 : ");
        String phone = scanner.next();
        
        // 객체 나 문자열로 던지기
        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setPhone(phone);

        // MemberController 에 던지기
        String newName = MemberController.getInstance().userFind(memberDto);
        System.out.println("[5] newName = " + newName);

        // 4. 결과에 따른 처리
        System.out.println(newName);

    }

    // 비밀번호 찾기 메소드
    public void  userPwFind(){
        System.out.println("[1] MemberView.userPwFind");
        // 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("전화번호 : ");
        String phone = scanner.next();

        // 객체 나 문자열로 던지기
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPhone(phone);

        // MemberController 에 던지기
        String newPw = MemberController.getInstance().userPwFind(memberDto);
        System.out.println("[5] newPw = " + newPw);


        // 4. 결과에 따른 처리
        if(newPw == null){
            System.out.println("회원정보가 일치하지 않습니다.");
        }else {
            System.out.println("임시비밀번호 : " + newPw + " 입니다.");
        }

    }


}
