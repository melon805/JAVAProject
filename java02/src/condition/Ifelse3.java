package condition;

import java.util.Scanner;

public class Ifelse3 {
public static void main(String[] args) {
	//1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
	int num = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이 입력>");
	num = sc.nextInt();
	
	if(num < 14){
		System.out.println("어린이");
	}else if(num>=14&&num<20) {
		System.out.println("청소년");
	}else if(num>=20){
		System.out.println("성인");
	}
	
	//2. 학점계산 90이상 a, 80이상은 b, 70이상은 c, 그 미안은 f
	System.out.println("============");
	int sco =0;
	System.out.println("점수 입력>>");
	sco = sc.nextInt();
	
	if(sco >= 90) {
		System.out.println("A");
	}else if(sco>=80 && sco<90) {
		System.out.println("B");
	}else if(sco>=70 && sco<80) {
		System.out.println("C");
	}else {
		System.out.println("F");
	}
	
	System.out.println("============");
	//3. 비밀번호 정해놓고 사용자가 비밀번호를 입력해서 맞추면 비번이 맞습니다. 틀리면 비번이 다릅니다
	int key =1234;
	System.out.println("비번입력>");
	key = sc.nextInt();
	
	if(key==1234) {
		System.out.println("비번 맞음");
	}else{
		System.out.println("비번 아님");
	}
	
	System.out.println("============");
	//4.윤년 판별=> 년도를 입력받아 해당년도가 윤년인지 판별해보세요 
	//윤년 >> 4의 배수이거나 100으로 나누어 떨어짐
	//평년 >> 4의 배수도 아니고 100으로 나누어 떨어지지않음
	
	int year =sc.nextInt();
	System.out.println("해당년도>");
	
	if(year%4==0 || year%100==0) {
		System.out.println("윤년");
	}else {
		System.out.println("평년");
	}
sc.close();
}
}
