package loop;

import java.util.Scanner;

public class While3 {
	// while문의 플래그를 활용하여
	// 사용자에게 정수 값을 받은 만큼 합계를 구해보세요
	public static void main(String[] args) {
	    
		int sum =0;
		int i =1;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지?");
		num=sc.nextInt();
		
		while(i<=num) {
			sum+=i;
			i++;
		}
		
		System.out.println("1부터 "+num+"까지 합계>>"+sum);
	
	}
	
	
}
