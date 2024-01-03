package 과제.과제1.ex5;

public class Level1_5 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_5 answer >> \n");
		
		byte value1 = 100;				
		short value2 = 30000;			
		int value3 = 2000000000;		
		long value4 = 40000000000L;		
		float value5 = 3.123123123F;
		
		/* 문제풀이 위치 */

		short var1 = value1;
		int var2 = value2;
		long var3 = value3;
		float var4 = value4;
		double var5 = value5;

		System.out.printf("byte -> short : %d \n" , var1);
		System.out.printf("short -> int : %d \n" , var2);
		System.out.printf("int -> long : %d \n" , var3);
		System.out.printf("long -> float : %5.1e \n" , var4);
		System.out.printf("float -> double : %17.16f \n" , var5);


		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 자동 형변환을 하여 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 자동 형변환 만 사용하여 그림과 같이 출력합니다.
		
*/
