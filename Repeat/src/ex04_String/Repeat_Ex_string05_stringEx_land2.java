package ex04_String;

public class Repeat_Ex_string05_stringEx_land2 {
	public static void main(String[] args) {
	// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		/*
		 * 1. ","split���� ��ö�� /87 �� ���� ������. �̸��� ���� �����Ѵ�
		 */
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String[] name = new String[3];
		int[] score = new int[3];

		String[] arrStr = str.split(",");
		// 1)split���� �ѹ� �����ְ�,
		for(int i=0; i<arrStr.length;i++) {
			String[] info = arrStr[i].split("/");
			//2) �ٽ��ѹ� ���ڿ� �迭�� ���� split���� �ѹ� �� ������.
			name[i] = info[0];
			score[i]= Integer.parseInt(info[1]);
		}
		for(int i=0; i<3; i++) {
			System.out.println(name[i]+":"+score[i]+"��");
		}

	}
}
