package cls;

public class Constructor2 {
public static void main(String[] args) {
	//멤버변수(private :이름. 나이)
	Person p1 = new Person("abc",21);
	Person p2 = new Person("def",11);
	
	PersonView pv1 = new PersonView();
	PersonView pv2 = new PersonView(p2);
	
	pv1.info(p1); //info : 들어온 값을 저장하고 정보출력
	
	pv2.info(); //info : 바로 정보 출력
	
	}
}


class Person{	
	//생성자(public) : 생성자 통해서 멤버변수 초기화
	
	//멤버변수: 이름,나이
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//게터세터(public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}	
	

class PersonView{
	private Person person;
	//기본 생성자
	public PersonView(){}
	//생성자 오버로딩 : 받아온 객체를 멤버변수에 백업 //여러 형태의 생성자(객체화)를 허용해 주려고
	
	public PersonView(Person person) {
		this.person =person;
		
	}
	public void info() {
		System.out.println("이름: "+person.getName()+",나이: "+person.getAge());

	}
	//매서드 오버로딩(바뀐 사람으로 저장 후 출력)
		public void info(Person person){
			this.person =person;
			System.out.println("이름:"+person.getName()+",나이: "+person.getAge());
		}
	}