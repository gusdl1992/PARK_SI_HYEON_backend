package 과제.과제7;

// 컨트롤러
public class Controller {

    // 싱글톤
    private Controller(){}
    private static Controller controller = new Controller();
    public static Controller getInstance(){return controller;}

    public boolean 회원가입(MemberDto memberDto){
        // Dao 에 전달해 결과 받기
        boolean result = MemberDao.getInstance().회원가입(memberDto);
        return result;
    }

    public boolean 로그인(MemberDto memberDto){
        // Dao 에 값 전달
        boolean result = MemberDao.getInstance().로그인(memberDto);
        return result;
    }

    public String 아이디찾기(MemberDto memberDto){
        // Dao 값 전달
        String str = MemberDao.getInstance().아이디찾기(memberDto);
        // 결과 전달
        return str;
    }

    public String 비밀번호찾기(MemberDto memberDto){
        // Dao 값 전달
        String str = MemberDao.getInstance().비밀번호찾기(memberDto);
        // 결과전달
        return str;
    }
}
