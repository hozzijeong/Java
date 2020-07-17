package ex;

import java.util.Scanner;

public class Day12_Ex01_two_dementional_array_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		
		//1. �̸��� ��ȣ�� �Է� �޴´�.
		//2. �ش� �ε����� �����ϰ�, ��ü �迭�� ũ�⸦ -1�Ѵ�.
		System.out.println("�̸� �Է�:");
		String name = scan.next();
		
		System.out.println("��ȣ �Է�:");
		int idx = scan.nextInt();
		
		int delIdx = -1;
		
		
		int count = 0;
		for(int i=0; i<jang.length;i++) {
			if(jang[i][0].equals(name)) {
				if(count == idx) {
					delIdx = i;
				}
				count+=1;
			}
		}
		
		System.out.println(delIdx);
		
		// �ش� �̸��� �׿� �´� ��ȣ (delIdx)�� ã��. 
		// �ش� �ε����� �����ϰ� ��ü �迭�� ũ�⸦ -1�� ��.
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j=0;
		for(int i=0;i<temp.length;i++) {
			if(i != delIdx) {
				jang[j] = temp[i];
				j+=1;
			}
		}
		temp = null;
		
		for(int i=0; i<jang.length;i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
	}
}



