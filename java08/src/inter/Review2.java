package inter;

public class Review2 extends Review1 { //review1의 생성자를 사용한다

	public Review2(int num1, int num2, int num3, int num4) {
		super(num1, num2, num3, num4); //super() : 부모의 생성자를 사용
		super.num4 =4;
		//super. => 부모의 변수 또는 메서드 사용
		//this. = 나(클래스)의 변수 또는 메서드 사용
		
		// TODO Auto-generated constructor stub
	}
	//Review1의 코드가 복붙되었음

	//상속했더니 클래스명에 빨간밑줄이 간다? -> 명시해 줘야 하는 매서드가 있는 것(생성자)
	//빨간 밑줄에 마우스를 가져다 대고 첫번째 항목 클릭
	//상속(복붙)을 하는 이유? 기존 클래스의 기능을 유지한 채로 수정(오버라이딩==> 다시 만든다, 재정의)및 추가 하기 위해서
	@Override
		public void printNum() {
			// TODO Auto-generated method stub
			//super.printNum(); // 부모의 printNum을 사용(코드 실행)
			System.out.println("결과"+(num2+num3));
			
		}
//추가 
	private String str="자식 클래스";
	public void printStr() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		//static 메서드에서 일반 클래스를 사용하기 위해선 '객체화'를 해줘야함 
		Review2 review2 = new Review2(0,1,2,3);
		review2.printNum();
		System.out.println(review2.num4);
		
	}
}
