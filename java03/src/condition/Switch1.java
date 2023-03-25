package condition;
/*
 제어문 : if, switch, while , for, break , continue
 조건문 : if, switch
 - if가 기본 조건문, switch는 같은 경우만 비교(가독성)
 */

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import javax.lang.model.util.ElementScanner6;

public class Switch1 {
	public static void main(String[] args) {
		int num = 0;
		if(num ==0) {
			System.out.println("if문 num = 0");
		}else if(num==1) {
			System.out.println("if문 num = 1");
		}else if(num ==2) {
			System.out.println("if문 num = 2");
		}else {
			System.out.println("그밖에");
		}
		
		//이렇게 같은 것을 찾는 조건문은 switch 문으로 변경할 수 있다\
		// switch ~case ~break
		
		switch(num) {
		case 0: 
			System.out.println("switch문 = 0");
			break;
		case 1:
			System.out.println("switch문 = 1");
			break;
		case 2:
			System.out.println("switch문 = 2");
			break;
		default:
			System.out.println("그밖에");
		}
		
		// 퀴즈: 사용자 입력 1234를 받는데
		// 1 안녕하세요. 
		// 2 반가워요.
		// 3 잘있어요.
		// 4 다시만나요.
		// 이상한 거 입력하면 잘못 입력하셨습니다.
		int cho = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요>>");
		cho = sc.nextInt();
		
		switch(cho) {
		case 1:
			System.out.println("안녕하세요");
			break;// break 안써주면 선택항목 밑으로 다 실행됨
		case 2:
			System.out.println("반가워요");
			break;
		case 3:
			System.out.println("잘있어요");
			break;
		case 4:
			System.out.println("다시만나요");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
