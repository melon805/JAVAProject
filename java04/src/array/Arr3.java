package array;

public class Arr3 {
	public static void main(String[] args) {
		//음식점의 메뉴만들기(음식명-가격)
		String names[]= {"라면","김밥","순대","튀김","떡볶이"};
		int prices[]=new int[5];
		
		prices[0]=3000;
		prices[1]=3500;
		prices[2]=4000;
		prices[3]=4500;
		prices[4]=5000; // 중요> 5칸짜리 만들었으니 4번방까지 있음!
		System.out.println("==분식 메뉴판==");
		
		
		//배열 전체 출력 => for문 사용
		for(int i=0;i<names.length;++i) {
			System.out.println(names[i]+"-"+prices[i]+"원");
		}
	}
}
