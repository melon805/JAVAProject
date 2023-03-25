package review;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		//if문  
		//if ~ else if ~ else
		//조건이 맞으면 실행, 조건이 틀리면 무시
		//if(){}:()에는 조건식을, {}에는 코드를 넣는다
		
		//예제 : 버스카드 => 20세 이상이면 성인 1000원, 14~19 청소년 650, 13세 이하면 400원
		
		int num = 19;
		int money = 0;
		
		
		if(num > 19) {
			System.out.println("성인입니다");
			money =1000;
		}else if(num >13) {// 나이가 19보다 크지않고 13보다 크면 실행한 코드
			System.out.println("청소년입니다");
		    money = 650;
		}else{ // 나이가 19보다 크지않고 13보다 크지 않으면
			System.out.println("어린이 입니다");
			money = 400;
		}
		
		System.out.println(money+"원");
	
	// 윤년 구하기
	int year =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("해당년도>");
	year =sc.nextInt();
	
	if(year%4==0 && year%100!=0||year %400==0) {
		System.out.println("윤년");
	}else {
		System.out.println("평년");
	}
sc.close(); // 프로그램 성능을 느려지게 할 수있는 자원을 해제
//지금은 main 함수 가 좋료되면 자동으로 해제되기 때문에 지금은 안해도 됨
	}
}



