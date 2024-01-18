package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {

    // 멤버 DTO 담을 배열 선언
    ArrayList<MemberDto> memberDtos = new ArrayList<>();
    // 싱글톤패턴
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    // 아이디 중복 검사 메서드
    public boolean checkId(MemberDto memberDto){
        for (int i = 0; i < memberDtos.size(); i++){
            // 0 부터 리스트 개수까지
            if (memberDtos.get(i).get아이디().equals(memberDto.get아이디())){
                return true; // 중복값 발견으로 true 가입 실패 안내
            }
        }
        return false;
    }
    // 회원가입 메서드
    public boolean 회원가입(MemberDto memberDto){
        // 중복검사
        if(checkId(memberDto)){
            return false; // 중복 발견으로 false 리턴
        }else {
            memberDtos.add(memberDto); // 중복이 없어서 값 넣기
        }
        return true;
    }
    // 로그인 메서드
    public boolean 로그인(MemberDto memberDto){
        // 로그인 처리
        for (int i = 0 ; i < memberDtos.size(); i++){
            // 0 부터 멤버 리스트 값 까지 반복
            if (memberDtos.get(i).get아이디().equals(memberDto.get아이디())){
                if (memberDtos.get(i).get비밀번호().equals(memberDto.get비밀번호())){
                    return true;
                } // 비밀번호 비교
            } // 아이디 비교
        } // for end
        return false;
    }
    // 아이디찾기 메서드
    public String 아이디찾기(MemberDto memberDto){
        // 아이디 찾기
        for (int i = 0 ; i < memberDtos.size(); i++){
            //  0 부터 멤버 리스트 값 까지 반복
            if (memberDtos.get(i).get이름().equals(memberDto.get이름())){
                if (memberDtos.get(i).get전화번호().equals(memberDto.get전화번호())){
                    String str = memberDtos.get(i).get아이디();
                    return str; // 찾은 아이디 리턴
                }// 전화번호 비교 end
            } // 이름 비교 end
        } // for end
        return null;    // 못찾았으면 null
    }
    
    // 비밀번호 찾기 메서드
    public String 비밀번호찾기(MemberDto memberDto){
        // 비밀번호 찾기
        for (int i = 0 ; i < memberDtos.size(); i++){
            // 0부터... 리스트 크기까지...
            if (memberDtos.get(i).get아이디().equals(memberDto.get아이디())){
                if (memberDtos.get(i).get전화번호().equals(memberDto.get전화번호())){
                    String str = memberDtos.get(i).get비밀번호();
                    return str; // 찾은 비밀번호 리턴
                } // 전화번호 비교 end
            } // id 비교 end
        } // for end
        return null; // 못찾았으면 null
    }


}
