package ex;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * # 컬렉션(collection)
 * (1) List : 중복허용/순서있음(ArrayList)
 * 			인덱스 => 값
 * (2) Map  : 중복허용X/순서없음
 * 			"이름" => 값
 * (3) Set  : 중복허용X/순서없음
 */


public class Ex02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("사과", 5);

		Student[] ar = new Student[5];
		
		ArrayList<Student> arr = new ArrayList<>();
		Student hgd = new Student();
		
		arr.add(hgd);
		
		// <> : generic
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		// 추가하기
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		// list.add("문자");
		// list.add(3.14);
		
		// 삭제하기(인덱스)
		list.remove(0);
		
		// 삭제하기(값)
		list.remove(new Integer(13));
		
		// 수정하기
		list.set(0, 111);
		
		System.out.println(list);
		
	}
}















