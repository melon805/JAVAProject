package operator;

public class Oper5 {
	public static void main(String[] args) {
		// 누적연산자 : 자기 자신에다 숫자를 계속 누적해야 사용하여 연산
		int num = 3;
		
		num = num; // 왼쪽에 있는 num과 오른쪽에 있는 num은 다르다 -> num에 3을 담아라
		
		num = 1+2;
		num = num+2;
		System.out.println(num);
		
		num += 2;//num = num +2;의 줄임말
		System.out.println("num>7??"+num);
		
		num -=2; //5 => num-2
		num *=2; //10 =>num*2
		num /=2; //5 =>num/2
		num %=2; //1 => num%2
		System.out.println("누적연산"+num);
		
		//증감연산자 : 또 줄임 => 누적으로 더하거나 빼는 숫자가 1일 경우 한번 더 줄여줄 수 있다.
		//num = num +1; => num +=1
		num++;
		++num;
		System.out.println("+증감연산"+num);
		
		//누적빼기도 다름
		--num;
		num--;
		System.out.println("-증감연산"+num);
		
		//++이 앞에 있으면 먼저 누적으로 더하고 그 줄의 코드 실행
		//++이 변수보다 뒤에 있으면 그 줄의 코드 실행이 끝나고 더함
		
		int i =0;
		System.out.println("i++?" + i++);
		System.out.println("++i?" + ++i);
	}
}