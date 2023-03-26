package control;

public class For_if {
	public static void main(String[] args) {
		//반복문 안에 조건문 => 반복문 할 때마다 조건문 실행
		
		int num=1;
		/*
		if(num==1) {System.out.println("1이다");}
		if(num==1) {System.out.println("1이다");}
		if(num==1) {System.out.println("1이다");}
		if(num==1) {System.out.println("1이다");}
		if(num==1) {System.out.println("1이다");}
		*/
		
		for(int i=0;i<5;++i) { //반복 수행시 마다 조건문을 실행 => 5번 반복이면 5번 반복실행
			if(num==1) {System.out.println("1이다");}
		}
	}
}
