package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		//사용자에게 점수를 입력받고 
		//점수가 90이상이면 
		//우등생을 출력하는 프로그램을 만들어주세요
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력>>");
		
		num = sc.nextInt();
		if(num >= 90) {
			System.out.println("우등생입니다");
		}
	}
}
