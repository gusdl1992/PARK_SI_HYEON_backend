package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */

		boolean var1 = true;
		byte var2 = 100;
		char var3 = 'A';
		short var4 = 30000;
		int var5 = 2000000000;
		long var6 = 40000000000L;
		float var7 = 3.123F;
		double var8 = 3.12312312;

		System.out.printf("%-10s   %15b   %30s\n" , "boolean" , var1 , "true or falses" );
		System.out.printf("%-10s   %15d   %30s\n" , "byte" , var2 , "-128 ~ 127" );
		System.out.printf("%-10s   %15c   %30s\n" , "char" , var3 , "0~65535[ charcter 1 ]" );
		System.out.printf("%-10s   %15d   %30s\n" , "short" , var4 , "-32768 ~ 32767" );
		System.out.printf("%-10s   %15d   %30s\n" , "int" , var5 , "-+2000 million" );
		System.out.printf("%-10s   %15d   %30s\n" , "long" , var6 , "-+ 2000 million excess" );
		System.out.printf("%-10s   %15.3f   %30s\n" , "float" , var7 , "8 decimal places" );
		System.out.printf("%-10s   %15.8f   %30s\n" , "double" , var8 , "17 decimal places" );

		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
