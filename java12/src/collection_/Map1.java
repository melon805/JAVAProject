package collection_;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
//배열, list, set, Map
//Map : 키와 값을 쌍으로 정해주고 싶을 때
//{"일":"a","이","b",...}
	public static void main(String[] args) {
	
		HashMap<Integer, String> hm = new HashMap<>();
		
		//추가 put
		//조회 get
		//삭제 remove
		//해당 키가 있는지 검사 -> containskey()
		//해당 값이 있는지 검사 -> containsValue()
		
		hm.put(1, "일");
		hm.put(2, "이");
		hm.put(2, "이중복");
		hm.put(2, "이중복2");
		hm.put(4, "사");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		hm.remove(3);
		
		//전체조회
		Set<Integer> set = hm.keySet();
		for(int e : set) {
			System.out.println(e); //key
			System.out.println(hm.get(e)); //value
			}
		
		boolean isTrue = hm.containsKey(4);
		System.out.println(isTrue);
		isTrue=hm.containsKey("이중복2");
		System.out.println(isTrue);
		
		}
	}
	
