package ex;

import java.util.ArrayList;

public class Ex {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println(arr);		// [I@7852e922
		
		int num = 0;
		int[] temp = null;				// null(�ּҾ���)
		// java.lang.NullPointerException
		// System.out.println(temp[0]);
		
		// ���̽��� ����Ʈ
		// �ڹ��� ArrayListŬ����(= ��Ʈ������ MyArrayList)
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
		
		// īī����
		// 2018 : �ִ���
		// 2019: ��Ʈ����
		
	}
}
