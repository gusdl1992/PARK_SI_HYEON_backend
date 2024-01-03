package 과제.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */

		System.out.print("input boolean : ");
		boolean var1 = scanner.nextBoolean();
		System.out.print("input byte : ");
		byte var2 = scanner.nextByte();
		System.out.print("input char : ");
		char var3 = scanner.next().charAt(0);
		System.out.print("input short : ");
		short var4 = scanner.nextShort();
		System.out.print("input int : ");
		int var5 = scanner.nextInt();
		System.out.print("input long : ");
		long var6 = scanner.nextLong();
		System.out.print("input float : ");
		float var7 = scanner.nextFloat();
		System.out.print("input double : ");
		double var8 = scanner.nextDouble();

		System.out.print("output boolean : " + var1 + "\n");
		System.out.print("output byte : " + var2+ "\n");
		System.out.print("output char : "+ var3 + "\n");
		System.out.print("output short : "+ var4 + "\n");
		System.out.print("output int : " + var5 + "\n");
		System.out.print("output long : "+ var6 + "\n");
		System.out.print("output float : "+ var7 + "\n");
		System.out.print("output double : "+ var8 + "\n");


		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
