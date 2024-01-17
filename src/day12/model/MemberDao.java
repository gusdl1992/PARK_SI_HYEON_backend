package day12.model;

import java.util.ArrayList;
import java.util.Random;

// DAO : 데이터베이스 접근 객체
public class MemberDao {
    // DB 대신 배열 사용..
        // 배열 사용시 불편한점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개저장할객체타입> 변수명 = new Arraylist<>();
        // 제공하는 함수
            //          가변길이                                고정길이
            //      ArrayList<타입> 변수명   vs           타입[] 변수명 
            //  요소 저장 : .add (저장할 객체)              [인덱스] = 저장할 데이터
                    // 회원가입
            //  요소 개수 : .size()                        배열명.length
            //  요소 호출 : .get(인덱스)                    배열명[인덱스]
                    // 로그인

            //  요소 삭제 : .remove(인덱스)                 배열명[인덱스] =  null

    // MemberDto[] memberDtos = new MemberDto[100];
    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    // 싱글톤
    private  MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public  static MemberDao getInstance(){return memberDao;}

    // 1. 회원가입 처리 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("[3] MemberDao.signup");
        // 아이디 중복 검사
        if (CheckId(memberDto)){
            return false;

        }else {
            memberDtos.add(memberDto);
        }

        return true; // 회원가입 성공
    } // f e

    // 아이디 중복 검사
    public boolean CheckId(MemberDto memberDto){
        for (int i = 0; i < memberDtos.size(); i++){
            // 0 부터 리스트내 요소 개수까지 검사
            if( memberDtos.get(i).getId().equals(memberDto.getId() ) ){
                return true; // 아이디 중복 으로 가입 실패
            }
        }
        return false;
    }

    // 2. 로그인 메소드
    public  boolean login(MemberDto memberDto){
        System.out.println("[3] MemberDao.login");

        // 로그인 처리 : 전체(배열/ArrayList) 회원 객체 중에 입력받은 동일한 값이 있는지 확인
        for(int i = 0; i < memberDtos.size() ; i++){
            // i는 0부터 리스트내 요소 개수 까지 1씩
            if(memberDtos.get(i).getId().equals( memberDto.getId() ) ){
                // 리스트내 i번째 객체의 아이디 와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    // 리트스내 i 번째 객체의 비밀번호 와 입력받은비밀번호(매개변수) 같으면
                    return true; // 로그인 성공
                } // pw if e
            } // id if e
        } // for e

        return false; // 로그인 실패
    } // f e


    // 아이디 찾기 메소드
    public String userFind(MemberDto memberDto){
        System.out.println("[3] MemberDao.userFind");
        for(int i = 0 ; i < memberDtos.size(); i++){
            if (memberDtos.get(i).getName().equals(memberDto.getName())){
                // 이름이 같으면..
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    String str = "회원의 아이디는 : "+memberDtos.get(i).getId()+ "입니다.";
                    return str;
                } // 번호 비교 end
            }// 이름 비교 end
        }// for end
        String str = "아이디를 찾을수 없습니다.";
        return str;
    }

    // 비밀번호 찾기 메서드
    public String userPwFind(MemberDto memberDto){
        System.out.println("[3] MemberDao.userPwFind");
        for (int i = 0; i < memberDtos.size(); i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                // 아이디가 같으면..
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    // 핸드폰번호도 같으면
                    String str = strRandom();
                    memberDtos.get(i).setPw(str);
                    return str;
                } // 핸드폰 비교 if e
            }// 아이디 비교 end
        } // for e
        return null;
    }

    public String strRandom(){
        Random random = new Random();
        String str = "";
        for(int i = 0 ; i < 6 ; i++){
            str += (char)((int)(random.nextInt(26))+97);
            System.out.println("str = " + str);
        }
        return str;
    }

}
/*
// 비지니스로직
        for(int i = 0 ; i < memberDtos.length ; i++){
            if(memberDtos[i] == null){
                memberDtos[i] = memberDto;
                return true; // 회원가입 성공
            }
        }
 */