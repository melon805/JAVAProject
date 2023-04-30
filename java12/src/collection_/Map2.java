
package collection_;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDictionary dict = new MyDictionary();
        String word1 = "", word2 ="", temp ="";
        int choice = 0;
        
        while (true) {
        	System.out.println("======한영사전==========");
            System.out.println("1.추가 2.변경 3.삭제 4.조회 0.끝내기");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
            	//1.추가
                System.out.println("추가할 한글 단어 입력:");
                String kor = sc.nextLine();
                System.out.println("추가할 영단어 입력:");
                String eng = sc.nextLine();
                dict.addWord(eng, kor);
                
            } else if (choice == 2) {
            	//변경
                System.out.println("변경할 한글 단어 입력:");
                String kor = sc.nextLine();
                System.out.println("변경할 영단어 입력:");
                String eng = sc.nextLine();
                dict.modifyWord(eng, kor);
            
            } else if (choice == 3) {
            	//3.삭제
                System.out.println("삭제할 영단어 입력:");
                String eng = sc.nextLine();
                dict.deleteWord(eng);
            
            } else if (choice == 4) {
            	//4.조회
                dict.showAll();
                
            } else if (choice == 0) 
                sc.close();
                break;
            }
        }
    }

class MyDictionary {
    // 멤버변수 private
    private HashMap<String, String> map;
    
    //생성자 - 초기 단어 등록
    public MyDictionary() {
        map = new HashMap<String,String>();
        map.put("flower", "꽃");
        map.put("ocean", "바다");
        map.put("new", "새로운");
        map.put("world","세계");
    }
    
    public void showAll() {
		Set<String> set= map.keySet();
		for(String e : set) {
			System.out.println(e);
		}
		
	}

	//메서드 public
    public String searchWord(String eng) {
        if(map.containsKey(eng)) {
            return map.get(eng);
        } else {
            return "해당 단어는 없습니다.";
        }
    }
    
    public void modifyWord(String eng, String kor) {
        if(map.containsKey(eng)) {
            map.replace(eng, kor);
            System.out.println("단어가 수정되었습니다.");
        } else {
            System.out.println("해당 단어는 없습니다.");
        }
    }
    
    public void addWord(String eng, String kor) {
        if(map.containsKey(eng)) {
            System.out.println("이미 등록된 단어입니다.");
        } else {
            map.put(eng, kor);
            System.out.println("단어가 추가되었습니다.");
        }
    }
    
    public void deleteWord(String word) {
        if(map.containsKey(word)) {
            map.remove(word); // 키값을 찾아서 삭제
            System.out.println("단어가 삭제되었습니다.");
        } else {
            System.out.println("해당 단어는 없습니다.");
        }
    }
}
    
    