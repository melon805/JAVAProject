package operator;

public class Review {
	public static void main(String[] args) {
		//변수 : 저장공간 -> 자주 변경될 수 있는 부분은 저장해놓고 돌려쓰기
		String 글자 = "글자를 저장";
		int 숫자 = 0; // 숫자라는 공간에 0을 저장
				
		System.out.println(숫자); // 숫자라는 공간에 있는 0을 출력 => ctrl + F11
		System.out.println("나는 "+글자+숫자);
		
		//산술 연산자
		//+,-,/,*,% 를 많이 사용
		String 문자열더하기= "글자를"+"붙이기";
		int 정수더하기 = 3+4; //7
		int 정수빼기 = 3-4; //-1
		int 정수곱하기 = 3*4; //12
		double 실수나누기 =3.0/4; //0.75
	   
	    System.out.println(문자열더하기);
	    System.out.println(정수더하기);
	    System.out.println(정수빼기);
	    System.out.println(정수곱하기);
	    System.out.println(실수나누기);
	    
	    //비교 연산자 <,>,=<,=>,!=,==
	    //결과를 true 또는 false
	    System.out.println(3>4);
	    System.out.println(3<4);
	    System.out.println(3==4);
	    System.out.println(3!=4);
	    System.out.println(3>=4);
	    System.out.println(3<=4);
	    
	    
	    //대입 연산자 =
	    //오른쪽에 있는 값을 왼쪽의 변수에 담겠다.
	    글자 = "abc";//abc를 글자라는 공간에 담겠다
	    
	    String 변수1;
	    변수1 = "이미 만들어져있는 변수에는 자료형 없이 적는다/";
	    String 변수2 = "새로 만드는 변수에는 자료형을 적어줘야 한다";
	    System.out.println(변수1+변수2);
	}
}
