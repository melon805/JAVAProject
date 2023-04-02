
/*
package cls;

public class KrController {
 public static void main(String[] args) {
	//객체화
	 KrModel km1 = new KrModel();
	 KrModel km2 = new KrModel();
	
	 km1.setnum(111);
	 km1.setStr("안녕");
	 
	 km2.setnum(222);
	 km2.setStr("반");
	 
	 KrService ks = new KrService();
	 ks.decoEquals(km1);
	 ks.decoEquals(km2);
	 
	 Krview kv = new Krview();
	 kv.printStr(km1);
	 kv.printStr(km2);
 }
 
}

//krModel 클래스(변수 : num, str/ 메서드 :get, set)

class KrModel{
	
	int num;
	String str;
	
	void Strnum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;	
	}
	
	void setStr(String str) {
	this.str = str;
	}
	String getStr() {
		return str;
	}
}

//krView 클래스(출력용)

class Krview{
	void printNum(KrModel km) {
		System.out.println(km.getNum());
	}
	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}
/*
class KrService(){
	//출력하기 전에 꾸며주기
	void decoEquals(KrModel km){
	// 양 옆에 ==표시
		km.setStr("=="+km.getStr()+"==");
	}
	
	void decoPlus(KrModel km) {
		//양 옆에 +표시
		//km.setStr("=="+km.getStr()+"==");
		km.str="+"+km.str+"+";
	}
}

*/