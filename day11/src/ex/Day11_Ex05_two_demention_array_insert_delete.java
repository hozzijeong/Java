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

public class Day11_Ex05_two_demention_array_insert_delete {
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
		System.out.println("�̸� �Է�:");
		String name = scan.next();
		System.out.println("�ε��� �Է�:");
		int idx = scan.nextInt();
		int count = 0;
		int delIdx = -1;
		for(int i=0; i<jang.length;i++) {
			if(jang[i].equals(name)) {
				if(count == idx ) {
					delIdx = i;
				}
				count+=1;
			}
		}
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j =0;
		for(int i=0; i<temp.length;i++) {
			if(i != idx) {
				jang[j] = temp[i];
				j+=1;
			}
		}
		
		for(int i=0; i<jang.length;i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
		
		
		
		
			 


	}
}
