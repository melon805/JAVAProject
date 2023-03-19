package Operater;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 50; 
		int 영어 = 42;
		int 수학 = 61;
		
		int 합계 = 국어+영어+수학;
		
		// 합계과 평균 구하기
		System.out.println("합계는?"+ 합계);
		System.out.println("평균은?"+ ((double)합계/3));
		
	}
}
