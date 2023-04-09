package polymorphim;

public class PolyHuman {
	public static void main(String[] args) {
		// 다형성 : 부코 믈래스의 자료형으로 자식 클래스를 생성할 수 있다
		//자료형이 통일되기 때문에 기능추가에 대해서 코드 수정이 줄어듬(유지보수, 업데이트)
		//자료형을 인터테이스 명으로 하고 생성자는 객체화 하고자 하는 클래스 명으로 적는다.
		Human hong = new Hong();
		Human gang = new Gang();
	
	}
}

class Hong implements Human{

	public void 운동하기() {
	
		System.out.println("홍씨 운동함");
	}

	public void 공부하기() {
		System.out.println("홍씨 공부함");
	
		
	}
	
}

class Gang implements Human{

	public void 운동하기() {
	System.out.println("강씨 운동함");
	}

	@Override
	public void 공부하기() {
	 System.out.println("강씨 공부함");
		
	}
	
}