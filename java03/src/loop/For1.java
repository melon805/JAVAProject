package loop;

public class For1 {
	public static void main(String[] args) {
		//반복문 : while, for
		//for : while이 너무 가속성이 떨어져서 for문사용
		
		//0~9까지 출력 while
		
		int i = 0;
		
		while(i<10) {
			//반복할 코드
			System.out.println("while :"+i);
			i++;
		}
		
		//while 단점 : 바깥에서 플래그를 만들어 줘야 하며, {}안에서 플래그를 증감, 결론은 가독성 떨어짐
		//0~9 까지 출력 for
		// for문 : 플래그 고나련 코드는 ()에서 몰아버리자, 반복할 코드만 {}에 남기자
		
		for(int j =0; j <10;j++) {
			System.out.println("for: "+j);
		} 
		//for(초기값;조건식;증감량{반복할 코드;}
		//for문의 단점 : while만큼 자유롭지는 않음 
		//for문의 장점 : while에 비해 가속성이 좋고 개발속도가 더 빠름

	}
}
