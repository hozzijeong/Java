package ex;

public class Day14_Ex05_StringEx_two_demention_land2 {
	public static void main(String[] args) {

		// ����) �̸��� ������ �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"
		
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		String str = "";

		String[] temp = new String[score.length];
		for(int i=0; i<score.length;i++) {
			temp[i] = score[i] +"";
			
			if(i != score.length-1) {
				str +=name[i]+"/"+temp[i] +",";
			}else {
				str += name[i]+"/"+temp[i];
			}
		}
		
		System.out.println(str);
		

	

	}
}
