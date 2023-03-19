package variable;

public class Var2 {
	public static void main(String[] args) {
		// 변수(프로그래밍) : 데이터 값을 저장해 놓는 공간(저장공간)
		// 변수(수학) : 변할 수 있는 수 x,y,z,s,i
		
		//java가 변할 수 있기 때문에 변수에다가 저장 해놓겠습니다.
		String var1 = "jython";
		
		System.out.println("Hello "+var1+"!");//+는 문자열을 합칠 때 사용한다
		
		System.out.println(var1+" is simple");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println(var1);
		System.out.println(var1+"를 공부합니다.");
		
		System.out.println(34-2);
		// 개발자가 32를 의도한 건지, 34-2 글자 그자체를 의도한 건지 할수가 없음
		//사용자의 의도를 명확하게 나타내기 위해 변수에 자료형이라는 개념을 추가합니다
		
	}
}
