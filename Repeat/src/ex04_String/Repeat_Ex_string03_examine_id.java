package ex04_String;

public class Repeat_Ex_string03_examine_id {
	public static void main(String[] args) {
		String jumin = "880101-2012932";
		
		//���� 1) ���� ���:
		/*
		 * ���� = �ֹι�ȣ �� �ڸ� 2���� ����
		 * �װ��� int�� ����ȯ�� ��Ų������
		 * 2020 -1900 + x �� �ع����� ��.
		 * 
		 */
		
		String stryear = jumin.substring(0,2);
		// �տ� 2�ڸ� 88 ���� year�� '���ڿ�'�� ����;
		
		int intyear = Integer.parseInt(stryear);
		// ���ڿ� year �� ������ year�� ����
		
		int age = 2020 - (1900+intyear);
		
		System.out.println( "����: "+age);
		
		
		
		System.out.println("=====================");
		//���� 2) ���� ���:
		/*
		 * ������  �ֹι�ȣ ���ڸ��� �˾� �� �� ����. 
		 * �ֹι�ȣ ���ڸ��� �� ���
		 * �װ��� 1�̸� ���� 2�̸� ���ڷ� �ϸ� ��.
		 */
		
		char chGender = jumin.charAt(7);
		if(chGender == '1') {
			System.out.println("����: ����");
		}else if(chGender == '2') {
			System.out.println("����: ����");
		}
		
	}
}
