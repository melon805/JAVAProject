package review;

import java.util.Scanner;

public class review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1부터 10중 짝수만 출력하기
		// for 초기값;조건식;증감량{반복코드;}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("1~10까지 짝수 >>" + i++);
			}
		}
//		// 2. 정수형태 비번 맞추기(기회는 5, 맞추면 맞춤, 기회를 모두 사용하면 접속불가)
//		int pwd = 1234;
//		int user_input = 0;
//
//		for (int i = 0; i < 5; ++i) {//5번 반복
//			System.out.println("PW>>");
//			user_input = sc.nextInt();
//			if (user_input == pwd) {
//				System.out.println("맞춤");
//				break;
//			}
//			if (i == 4) {
//				System.out.println("접속불가");
//
//			}
//		}

		// 3. 시험합격 점수
		// 국어,영어,수학 40 이상, 총점수 150 이상이면 합격
		// 40이하의 점수가 있으면 과락, 각 과목이 40이상이나 총점이 미달이면 총점미달

		int 국어 = 39;
		int 영어 = 40;
		int 수학 = 40;
		int 총점수 = 0;

		if (국어 >= 40 && 영어 >= 40 && 수학 >= 40) {// and,or,not 사용
			if (총점수 >= 150) {
				System.out.println("합격");
			} else {
				System.out.println("총점미달");
			}
		} else {
			System.out.println("과락");
		}

		// 1~10까지 합 구하기(반복문)
		int num = 10;// num 변수에 10 저장
		for (int i = 0; i < 10; i++) {// for 조건문 생성
			num += i;// 뭐여...
		}
		System.out.println("1~10까지 합" + num);

		// 10~1까지 거꾸로 출력하기
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
