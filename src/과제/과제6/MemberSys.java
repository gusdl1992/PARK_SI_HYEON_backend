package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	static 	Member[] members = new Member[100];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				System.out.print("아이디 : > ");
				String 아이디 = sc.next();
				System.out.print("비밀번호 : > ");
				String 비밀번호 = sc.next();
				System.out.print("이름 : > ");
				String 이름 = sc.next();
				System.out.print("전화번호 : > ");
				String 전화번호 = sc.next();
				System.out.print("나이 > ");
				int 나이 = sc.nextInt();
				sc.nextLine(); // nextInt() 엔터값 초기화

				Member member = new Member(아이디 , 비밀번호 , 이름 , 전화번호 ,나이);
				for (int i = 0 ; i < members.length ; i++){
					// members 배열크기만큼 for 반복
					if (members[i] == null){
						members[i] = member;
						break;
					} // 배열 null 비교 if end
				} // for end
			}
			else if( ch == 2 ) {
				System.out.print("아이디 : > ");
				String 아이디 = sc.next();
				System.out.print("비밀번호 : > ");
				String 비밀번호 = sc.next();

				for (int i = 0 ; i < members.length ; i++){
					// members 배열크기만큼 for 반복
					if (members[i] != null){
						if (members[i].get아이디().equals(아이디) && members[i].get비밀번호().equals(비밀번호) ){
							System.out.println("로그인성공!");
							break;
						}
					} // 배열 null 비교 if end
					if(i == members.length-1){
						System.out.println("로그인 실패");
						break;
					}
				} // for end
				
			}
			else if( ch == 3 ) {
				System.out.print("이름 : > ");
				String 이름 = sc.next();
				System.out.print("전화번호 : > ");
				String 전화번호 = sc.next();

				for (int i = 0 ; i < members.length; i++){
					if(members[i] != null){
						if (members[i].get이름().equals(이름) && members[i].get전화번호().equals(전화번호)){
							System.out.println(members[i].get아이디());
							break;
						} // 이름 전화번호 비교 end
					} // 배열에 값이 있으면 실행 end
					if(i == members.length-1){
						System.out.println("회원가입한 유저가 아닙니다.");
						break;
					}
				} // for end
			}
			else if( ch == 4 ) {
				System.out.print("아이디 : > ");
				String 아이디 = sc.next();
				System.out.print("전화번호 : > ");
				String 전화번호 = sc.next();

				for (int i = 0 ; i < members.length; i++){
					if(members[i] != null){
						if (members[i].get아이디().equals(아이디) && members[i].get전화번호().equals(전화번호)){
							System.out.println(members[i].get비밀번호());
							break;
						} // 아이디 전화번호 비교 end
					} // 배열에 값이 있으면 실행 end
					if(i == members.length-1){
						System.out.println("회원가입한 유저가 아닙니다.");
						break;
					}
				} // for end
			}
		} // w e
	} // m e 
} // class e 
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














