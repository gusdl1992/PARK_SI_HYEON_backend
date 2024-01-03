package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */

		System.out.print("회원명 String: ");
		String var1 = scanner.nextLine();
		System.out.print("회원상태 boolean: ");
		boolean var2 = scanner.nextBoolean();
		System.out.print("회원번호 byte: ");
		byte var3 = scanner.nextByte();
		System.out.print("성별 char: ");
		char var4 = scanner.next().charAt(0);
		System.out.print("나이 short: ");
		short var5 = scanner.nextShort();
		System.out.print("포인트 int : ");
		int var6 = scanner.nextInt();
		System.out.print("예금액 long : ");
		long var7 = scanner.nextLong();
		System.out.print("키 float : ");
		float var8 = scanner.nextFloat();
		System.out.print("몸무계 double : ");
		double var9 = scanner.nextDouble();

		System.out.println("=============회원 개인정보===============");
		System.out.printf("\t\t\t회원명 : %s \n" , var1 );
		System.out.printf("\t\t\t상태 : %b \n" , var2);
		System.out.printf("\t\t\t회원번호 : %d \n" , var3);
		System.out.printf("\t\t\t성별 : %c \n" , var4);
		System.out.printf("\t\t\t나이 : %d \n" , var5 );
		System.out.printf("\t\t\t포인트 : %d \n" , var6);
		System.out.printf("\t\t\t예금액 : %d \n" , var7);
		System.out.printf("\t\t\t평균 : %3.1f \n" , var8);
		System.out.printf("\t\t\t평균 : %4.2f \n" , var9);




		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
