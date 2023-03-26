package array;

import java.util.Scanner;

public class Arr4 {
public static void main(String[] args) {
	//국가와 수도(5개)
	/*
	 [국가의 수도]
	 한국 수도는 서울입니다.
	 일본 수도는 도쿄입니다.
	 영국 수도는 런던입니다.
	 미국 수도는 워싱턴입니다.
	 중국 수도는 베이징입니다.
	 */
	String strs[]= {"한국","일본","영국","미국","중국"};
	String nats[]= {"서울","도쿄","런던","워싱턴","베이징"};
	
	System.out.println("==국가 수도==");
	
	for(int i=0;i<strs.length;i++) {
		System.out.println(strs[i]+"-"+nats[i]);
	}
	System.out.println();
	
	//같은 문자열을 찾으면 해당 i(방번호)를 백업
	//백업할 방번호를 통해서 수도를 출력
	Scanner sc= new Scanner(System.in);
	String user_input = "";
	int bk_index= -1;
	System.out.println("수도를 알고자 하는 국가 이름은?");
	user_input =sc.next();

	//해당 위치 찾는다 =>> str1==str2
	for(int i=0;i<strs.length;++i) {
		if(user_input.equals(strs[i])) {
			bk_index=i;
		}
	}
	
	if(bk_index==-1) {
		//못찾았다
	System.out.println("해당국가없음");	
	}else {
		System.out.println(strs[bk_index]+"-"+nats[bk_index]);
		}

	}
}
