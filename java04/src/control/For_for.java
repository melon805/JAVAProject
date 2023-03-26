package control;

public class For_for {
	public static void main(String[] args) {
		// 반복문 안에 반복문 사용=> 한번 반복할 때마다 안쪽에 있는 반복문 수행(이중반복문)
	
		for(int i=0;i<5;i++) {
			System.out.println("==i:"+i+"==");
			for (int j=0;j<3;j++) {
				System.out.println("j=?"+j);
				//System.out.println("i=>"+i+","+"j=>"+j);
			}
			System.out.println();//안쪽 for문이 끝나면 한줄 바꾸기
		}
	
	
	
	}
}
