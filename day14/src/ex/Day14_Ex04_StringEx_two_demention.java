package ex;

public class Day14_Ex04_StringEx_two_demention {
	public static void main(String[] args) {

			// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
			
			String str = "��ö��/87,�̸���/42,�̿���/95";
			
			String[] name = new String[3];
			int[] score = new int[3];
			
			String[] temp = str.split(",");
			// ��ö��/81
			// �̸���/42
			// �̿���/95	�� �����̵�. 
			
			
			for(int i=0; i<3;i++) {
				String[] info = temp[i].split("/");
				name[i] = info[0];
				score[i] = Integer.parseInt(info[1]);
			}
			// ������ info�� i �� + �ɶ����� ��� �����Ǳ� ������ ���������� ��ö��/ 87
			// �̸��� / 42  �̿���/95�� ��Ÿ���� ��. �̰��� �ٽ� "/"�� split�ϰ� �� ����
			// ���� name �� score �� ������ 
			
		

	}
}
