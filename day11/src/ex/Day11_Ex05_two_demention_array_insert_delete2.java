package ex;
/*
 * # 2�����迭[����]
 * . �̸��� ��ȣ�� �Է¹޾� �����ϱ�
 * ��)
 * �Է� : ö��	1
 * ���� : ���
 * 
 * �Է� : ö�� 2
 * ���� : �ٳ���
 */

import java.util.Scanner;

public class Day11_Ex05_two_demention_array_insert_delete2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �̸��� �ε����� �Է��ϸ� '���'�� ����. 
		String[][] jang = {
				{"ö��", "�Ұ��"},		// 0
				{"ö��", "���"},		// 1
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},		// 2
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		String[][] temp = new String[jang.length][jang[0].length];
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				temp[i][j] = "";
			}
		}
		
		System.out.println("�Է�:");
		String name = scan.next();
		
		int count = 0;
		for(int i=0; i<jang.length;i++) {
			temp[i][0] = name;
			int check = -1;
			for(int j=0; j<i; j++) {
				if(temp[j][0].equals(jang[i][0])) {
					check = i;
				}
			}
			if(check != -1) {
				temp[count] = jang[check];
				count = count + 1;
			}
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i][0] + " : " + temp[i][1]);
		}
		
		
		
			 


	}
}
