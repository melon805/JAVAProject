package loop;

public class While4 {
	public static void main(String[] args) {
		//While문은 ()조건식이 틀리면 {}실행 안함
		//do~while : 일단 먼저 실행하고 조건검사해서 반복여부 결정
		
		int i = 0;
		do {
			System.out.println("적어도 한번은 do문 실행 보장");
			i++;
		}while(i < 0);
		System.out.println("적어도 한번은 while문 실행 보장");
	}
	 
}
