package ex;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * # �÷���(collection)
 * (1) List : �ߺ����/��������(ArrayList)
 * 			�ε��� => ��
 * (2) Map  : �ߺ����X/��������
 * 			"�̸�" => ��
 * (3) Set  : �ߺ����X/��������
 */


public class Ex02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("���", 5);

		Student[] ar = new Student[5];
		
		ArrayList<Student> arr = new ArrayList<>();
		Student hgd = new Student();
		
		arr.add(hgd);
		
		// <> : generic
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		// �߰��ϱ�
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		// list.add("����");
		// list.add(3.14);
		
		// �����ϱ�(�ε���)
		list.remove(0);
		
		// �����ϱ�(��)
		list.remove(new Integer(13));
		
		// �����ϱ�
		list.set(0, 111);
		
		System.out.println(list);
		
	}
}















