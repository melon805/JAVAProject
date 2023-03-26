package array;

public class Arr2 {
public static void main(String[] args) {
	//배열 : 하나의 주제로 여러변수를 뭉치기 위해 만듦
	
	// ex)카페 커피메뉴 전시하기
	String menu1="에스프레소";
	String menu2="아메리카노";
	String menu3="카페라떼";
	// String menu4="카페모카";  //메뉴에서 제거
	String menu5="우유"; 
	
	/*
	일반변수로 나열 했을 때의 문제점 
	1.메뉴가 몇개인지 바로 알 수 없음
	2.전체출력이 불가능함(메뉴전시를 하려면 일일히 다 써줘야 함)=> 반복문 사용이 안됨
	*/
	
	//결론 -> 같은 주제로 이루어진 변수들은 배열이라는 문법을 통해서 변수를 나열한다.
	
	String menus[]= {"에스프레소","아메리카노","카페라떼","우유"};
	//메뉴의 (총)갯수를 알고 싶다
	int arr_size=menus.length;
	System.out.println("메뉴의 총갯수:"+arr_size);
	
	System.out.println("=====================");
	//배열을 전체 출력 하고 싶다
	for(int i=0;i<menus.length;i++) {
	System.out.println(menus[i]);
	}

	System.out.println("=====================");
	//첫번째 메뉴를 보고 싶다 =>배열은 0부터 시작 =>변수명[번호]
	System.out.println("배열 0번>> "+menus[0]);
	
	System.out.println("=====================");
	//배열값 바꿔 사용하기
	menu1="일반변수 바꾸기";
	menus[0] = "배열요소 바꾸기";
	
	System.out.println("=="+menus[0]+"==");
	
	System.out.println("=====================");
	int nums[];
	nums = new int[3]; //nums에 정수변수 총 3개를 연결{0번방, 1번방, 2번방}
	
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	
	
	}
}