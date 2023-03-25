package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//for문을 통해 구현시키기
	//1. 안녕 5번
		 for(int chr = 1; chr < 6;chr ++) {
			 System.out.println("안녕"+chr);
		 }
		 
System.out.println("============================");
		 
	//2. 1~	10까지 합계 구하기
	int sum =0; // 합계 변수 지정
	for(int a=1;a<11;a=a+1) { //새로운 변수 지정,변수조건설정, 변수증가
		sum =sum+a;//합계 값에 변수 넣기
	}
	System.out.println(sum);
	
System.out.println("============================");
	//3. 1~ 입력값까지 합계 구하기 
	int num = 0;
	int last_num = 0;
	int sum1 =0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("첫숫자?");
	num=sc.nextInt();
	System.out.println("마지막숫자?");
	last_num =sc.nextInt();
	
	for(int b=num;b<last_num+1;++b) {//새로운 정수 부여받기
		sum1 +=b;
	}
	System.out.println("합계>>"+sum1);
	}
}
