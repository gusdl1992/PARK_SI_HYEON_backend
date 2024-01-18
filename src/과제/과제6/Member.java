package 과제.과제6;

public class Member {

    // 필드
    private String 아이디;
    private String 비밀번호;
    private String 이름;
    private String 전화번호;
    private int 나이;

    // 기본 생성자
    Member(){};
    // 풀생성자
    Member(String 아이디 ,String 비밀번호 ,String 이름 ,String 전화번호 , int 나이){
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.나이 = 나이;
    }
    
    // get , set 시작
    public String get아이디() {
        return 아이디;
    }

    public void set아이디(String 아이디) {
        this.아이디 = 아이디;
    }

    public String get비밀번호() {
        return 비밀번호;
    }

    public void set비밀번호(String 비밀번호) {
        this.비밀번호 = 비밀번호;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public int get나이() {
        return 나이;
    }

    public void set나이(int 나이) {
        this.나이 = 나이;
    }
}
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기

		2. 조건 기능
			1. 회원가입 메소드
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장
				2. Member 객체화
				3. 객체를 배열 저장

			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공
					- 아니면 실패

			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력
					- 아니면 없다.

			4. 비밀번호찾기 메소드
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.


*/



