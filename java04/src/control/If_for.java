package control;

public class If_for {
	public static void main(String[] args) {
		//조건문 안에 반복문 
		int flag = 1;
		//조건문 안에 반복문 :조건이 맍으면 반복문 수행
		if(flag !=0) {
			for(int i =0;i<5;++i) {
				System.out.println("조건문 안에 반복문 실행"+i);
			}
			flag =0;
			
			
			if(flag !=0) {
				for(int i=0;i<5;++i) {
					System.out.println("조건문 안에 반복문 :"+i);
				}
			}
		}
	}
}
