package condition;

public class Ifelse2 {
public static void main(String[] args) {
	int num=99;
	//10보다 작은지, 100보다 작은지. 1000보다 작은지. 1000 이상인지 알고 싶다
	//if만 쓰기
	if(num<10) {
		System.out.println("if문은 10보다 작다");
	}
	if(num<100) {
		System.out.println("if문은 100보다 작다");
	}
	if(num<1000) {
		System.out.println("if문은 1000보다 작다");
		}
	
	//if~else if~else : 셋트
	System.out.println("============");
	if(num <10) {
		System.out.println("else if문은 10보다 작다");
	}else if(num <100) {
		System.out.println("else if문은 100보다 작다");
	}else if(num <1000){
		System.out.println("else if문은 1000보다 작다");
	}else {
		System.out.println("그 밖에");
	}
	System.out.println("============");
	//if와 관계연산자 사용문
	if(num<10) {
		System.out.println("if와 관계연산자 사용문 10보다 작다");
	}
	if(num>=10 && num < 100) {
		System.out.println("if와 관계연산자 사용문 10이상이고 100보다 작다");
	}
	if(num >= 100 && num <1000) {
		System.out.println("if와 관계연산자 사용문 100이상이고 100보다 작다");
	}
}
}

