package ex;
/*
 * # ���θ� [������]
 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
 * ��)
 * {
 * 		{"����", "���/����/"},
 * 		{"����", "Ȩ����/�ɸ���/"},
 * 		{"����", "�ݶ�/"},
 * 		{"����", "�Ұ��/"}
 * 		...
 * } 
 */

import java.util.Scanner;

public class Day11_Ex01_shoppingmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = " ";
			items[i][1] = " ";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� ī�װ� �Է�:");
				String cat = scan.next();
				int check = 1;
				
				for(int i=0; i<items.length;i++) {
					if(cat.equals(items[i][0])) {
						check = -1;
					}
				}
				if(check == -1) {
					System.out.println("�ش� ī�װ��� �̹� �����մϴ�.");
				}else {
					items[itemCount][0] = cat;
					itemCount+=1;
				}
				
			}
			else if(sel == 2) {
				for(int i=0;i<itemCount;i++) {
					System.out.println("[" + (i+1) + "]"+items[i][0]);
				}
				System.out.print("ī�װ� ����:");
				int choice = scan.nextInt();
				
				System.out.print("������ ǰ�� �Է�:");
				String item = scan.next();
				items[choice-1][1] += item;
				items[choice-1][1] += "/";
				
			}
			else if(sel == 3) {
				for(int i=0; i<itemCount;i++) {
					for(int j=0; j<items[i].length;j++) {
						System.out.print(items[i][j] + " ");
					}
					System.out.println();
				}
			}
			
		}



	}
}
