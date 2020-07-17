package ex;

import java.util.ArrayList;

public class Ex {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println(arr);		// [I@7852e922
		
		int num = 0;
		int[] temp = null;				// null(주소없음)
		// java.lang.NullPointerException
		// System.out.println(temp[0]);
		
		// 파이썬의 리스트
		// 자바의 ArrayList클래스(= 포트폴리오 MyArrayList)
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
		
		// 카카오톡
		// 2018 : 애니팡
		// 2019: 테트리스
		
	}
}
