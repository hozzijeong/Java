package ex;

import java.util.Scanner;

class Ex05{
	String name = "";
	
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
}


public class Day22_Ex06_class_manage03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex05 mega = new Ex05();
		mega.name = "�ް� IT����б�";
		
		while(true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for(int i=0; i<mega.arHakbun.length;i++) {
					System.out.println(mega.arHakbun[i] + "�� :" + mega.arScore[i]);
				}
			}
			else if(choice == 2) {
				int max = 0;
				for(int i=0; i<mega.arScore.length;i++) {
					if(mega.arScore[i] >= max) {
						max = mega.arScore[i];
					}
				}
				System.out.println("1�� ����: "+ max);
			}
			else if(choice == 3) {
				int min = 101;
				for(int i=0; i<mega.arScore.length;i++) {
					if(mega.arScore[i] <= min) {
						min = mega.arScore[i];
					}
				}
				System.out.println("�õ� ����: "+ min);
			}
			else if(choice == 4) {
				System.out.println("�й� �Է�:");
				int hak = scan.nextInt();
				int idx = -1;
				for(int i=0; i<mega.arHakbun.length;i++) {
					if(hak == mega.arHakbun[i]) {
						idx = i;
					}
				}
				if(idx == -1) {
					System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
					continue;
				}
				System.out.println("����: "+ mega.arScore[idx]);
			}
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}


	}
}
