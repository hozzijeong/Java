package map;

import java.util.ArrayList;
import java.util.HashMap;

public class map01 {
	public static void main(String[] args) {
		
		// 향상된 for문, 단축 for문, for-each...
		// 배열, [ArrayList, Map, Set, ..] 컬렉션
		int[] arr = {1, 2, 3, 4, 5};
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(int n : list) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
//				 key값  , value값
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, Integer> hmap = new HashMap<>();
		HashMap<String, Integer> hmap2	= new HashMap<>();
		
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		hmap.put("apple", 5000);
		System.out.println(hmap.size()+":"+hmap);
//		key값은 중복이 되지 않는다. 
		
		hmap2.put("나이", 19);
		hmap2.put("키", 170);
		
//		put메소드를 이용하면, key와 value 값을 입력할 수 있다.
		map.put("people", "사람");
		map.put("baseball", "야구");
//		get 메소드를 이용하면 key값을 통해 value값을 얻을 수있다. 
		System.out.println(map.get("people"));
		System.out.println(hmap.get("apple"));
		System.out.println(hmap.get("melon"));
		System.out.println(hmap.get("orange"));
//		containKey 메소드는 Map에 해당 키가 있는지 조사하여 그 결과값을 리턴한다.
		System.out.println(map.containsKey("people"));
		
//		remove 메소드는 맵의 항목을 삭제하는 메소드로 key값에 해당하는 아이템을 삭제한 후, 
//		그  value값을 리턴한다.
		System.out.println(map.remove("people"));
		
//		size 메소드는 Map 의 개수를 리턴한다.
		System.out.println(map.size());

//		keySet(): hashmap의 key만 얻어온다.
		System.out.println("keySet: "+hmap.keySet());
		
		
		
//		향상된 for 와 keySet()메소드를 이용하면 hashmap에 저장된 모든 데이터를 얻어올 수 있다.
		int sum = 0;
		for(String key:hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println("금액 합계"+sum);
		
		System.out.println(hmap.clone());
		
		// putAll은 key와 value 값의 형태가 같은 것들끼리만가능하다.
		// putAll을 통해 합친 2개의 맵 중, 합쳐진 맵은 그대로 존재. 
		hmap.putAll(hmap2);
// 		합친 맵
		System.out.println(hmap);
//		 합쳐진 맵
		System.out.println(hmap2);
		
		System.out.println(hmap.isEmpty());
		
	}
}
