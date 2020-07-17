package map;

import java.util.ArrayList;
import java.util.HashMap;

public class map01 {
	public static void main(String[] args) {
		
		// ���� for��, ���� for��, for-each...
		// �迭, [ArrayList, Map, Set, ..] �÷���
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
		
		
//				 key��  , value��
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, Integer> hmap = new HashMap<>();
		HashMap<String, Integer> hmap2	= new HashMap<>();
		
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		hmap.put("apple", 5000);
		System.out.println(hmap.size()+":"+hmap);
//		key���� �ߺ��� ���� �ʴ´�. 
		
		hmap2.put("����", 19);
		hmap2.put("Ű", 170);
		
//		put�޼ҵ带 �̿��ϸ�, key�� value ���� �Է��� �� �ִ�.
		map.put("people", "���");
		map.put("baseball", "�߱�");
//		get �޼ҵ带 �̿��ϸ� key���� ���� value���� ���� ���ִ�. 
		System.out.println(map.get("people"));
		System.out.println(hmap.get("apple"));
		System.out.println(hmap.get("melon"));
		System.out.println(hmap.get("orange"));
//		containKey �޼ҵ�� Map�� �ش� Ű�� �ִ��� �����Ͽ� �� ������� �����Ѵ�.
		System.out.println(map.containsKey("people"));
		
//		remove �޼ҵ�� ���� �׸��� �����ϴ� �޼ҵ�� key���� �ش��ϴ� �������� ������ ��, 
//		��  value���� �����Ѵ�.
		System.out.println(map.remove("people"));
		
//		size �޼ҵ�� Map �� ������ �����Ѵ�.
		System.out.println(map.size());

//		keySet(): hashmap�� key�� ���´�.
		System.out.println("keySet: "+hmap.keySet());
		
		
		
//		���� for �� keySet()�޼ҵ带 �̿��ϸ� hashmap�� ����� ��� �����͸� ���� �� �ִ�.
		int sum = 0;
		for(String key:hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println("�ݾ� �հ�"+sum);
		
		System.out.println(hmap.clone());
		
		// putAll�� key�� value ���� ���°� ���� �͵鳢���������ϴ�.
		// putAll�� ���� ��ģ 2���� �� ��, ������ ���� �״�� ����. 
		hmap.putAll(hmap2);
// 		��ģ ��
		System.out.println(hmap);
//		 ������ ��
		System.out.println(hmap2);
		
		System.out.println(hmap.isEmpty());
		
	}
}
