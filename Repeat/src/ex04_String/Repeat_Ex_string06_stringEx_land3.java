package ex04_String;

public class Repeat_Ex_string06_stringEx_land3 {
	public static void main(String[] args) {

		// ����) �̸��� ������ �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"
		
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for(int i=0; i<3; i++) {
			str += name[i] + "/" + (score[i]+"");
			if(i!= 2) {
				str+=",";
			}
		}
		
		System.out.println(str);
	}
}
