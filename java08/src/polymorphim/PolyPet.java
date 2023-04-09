package polymorphim;

import java.util.Scanner;

public class PolyPet {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int select=-1, type = -1;

//	Dog dog_list[]= new Dog[20];
//  int dog_count = 0;
//	Cat cat_list[]= new Cat[20];
//	int cat_count = 0;
//	Bird bird_list[]= new Bird[20];
//	int bird_count = 0;

//항목이 추가할 때 마다 전반적으로 프로그램이 수정됨 ==> 다형성(틀제공, 자료형 통일) 
//자료형이 통일되면 객체가 추가 될 필요가 없음
	Pet pet_list[] = new Pet [60];
	int pet_count =0;

	
	while(select !=0) {
		System.out.println("====메뉴====");
		System.out.println("1.추가 2.울기 3.먹기 0.종료");
		select = Integer.parseInt(sc.nextLine());
		
		if(select == 1) {
			System.out.println("0: 개, 1:고양이, 2:새 ?");
			type = Integer.parseInt(sc.nextLine()); //추가 항목 선택
			if(type ==1) {
				//개 추가
				pet_list[pet_count++] = new Dog();
				System.out.println("개 추가 완료");
			}
		}else if(type ==2) {
			//고양이 추가
				pet_list[pet_count++] = new Cat();
				System.out.println("고양이 추가 완료");
		}
		else if(type ==3) {
			//새 추가
				pet_list[pet_count++] = new Cat();
				System.out.println("새 추가 완료");
		
		}else if(select ==2 ) {
			for(int i=0;i<pet_count;++i) {
				pet_list[i].물기();
			}
			
		}else if(select ==3) {
				for(int i=0;i<pet_count;++i) {
					pet_list[i].먹기();
					
				}
			}
		}
	}
}
class Cat implements Pet{

	public void 물기() {
	
		System.out.println("애옹");
	}

	public void 먹기() {
		System.out.println("츄르");
		
	}
	
}

class Dog implements Pet{

	public void 물기() {
		
		System.out.println("멍멍");
	}

	public void 먹기() {
		System.out.println("개껌");
	
	}
	
}
class Bird implements Pet{

	public void 물기() {
		
		System.out.println("짹짹");
	}

	public void 먹기() {
		System.out.println("모이");
	}
}