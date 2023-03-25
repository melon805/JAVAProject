package loop;

public class While2 {
	public static void main(String[] args) {
		//반복문 : 유사한 코드를 자동 수행하기 위해
		
		//while은 설계가 필요하다(조건문 보다 반복문이 어려운 이유)
		//샘플로 3번만 수행 => 샘플 10번 수행 => 내가 원하는 횟수 수행
		int i =0;
		while(i < 10) {
			//반복 수행할 코드
			System.out.println("안녕");
			i++;//누적연산 +=1
			}
		
		/*while을 사용하려면 
		  플래그 변수가 필요, 조건식 세우기, while안에서 플래그 값을 증감
		 */

	//퀴즈2. while문 사용해서 반갑습니다 15번 실행
		int j =0;
		while(j<15) {
			System.out.println("반갑습니다");
			System.out.println("j");
			++j;
		}
	}
}
