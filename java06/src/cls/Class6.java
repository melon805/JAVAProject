package cls;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		//아빠차.name = ""; <= error : private하면 직접 사용이 불가능해짐(대입x) 
		//System.out.println(아빠차.name); <= error : private하면 직접 사용이 불가능해짐(사용x)
	
		아빠차.setName("제네시스");
		System.out.println(아빠차.getName());
		
	}
}


//멤버변수 private, 메서드는 public
/*
 접근권한 제어자
 private : 다른 클래스에서 접근 불가능
 default(아무것도 안적음) : 다른 패키지에서 접근 불가능
 protected : 다른 패키지에서 접근 물가능 하지만 상속 했을 경우에는 가능
 Public: 접근가능(같은 프로젝트)
 */

class Car{
	//차종류, 색상, 차번호(뒷자리)
	private String name; // private이 되면 다른 클래스에서 사용 불가능
	private String color;
	private int num;
	
	//대입을 위해 set
	public void setName(String name) { //public 메서드로 제공되지 않는 private는 변수는 대입이나 사용이 불가능
		this.name= name;	
	}
	
	public void setcolor(String color) {
		this.color= color;	
	}
	
	public void setNum(int num) {
		this.num= num;	
	}
	
	//사요하기 위해선 get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int num() {
		return num;
	}
}