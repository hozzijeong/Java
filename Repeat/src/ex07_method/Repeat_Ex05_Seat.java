package ex07_method;

import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

class Movie{
	Scanner scan = new Scanner(System.in);
	
	int[] seat = new int[10];
	
	String name = "";
	int cnt = 0;
	int money = 0;
	
	void showMenu() {
		System.out.println("==="+name+"===");
		System.out.println("1.����");
		System.out.println("2.����");
	}
	void showSeat() {
		for(int i=0; i<seat.length;i++) {
			if(seat[i] ==0) {
				System.out.print(" [X] ");
			}else {
				System.out.print(" [O] ");
			}
		}
		System.out.println();
	}
	
	void choiceSeat() {
		//�¼� ��Ȳ ���
		
		showSeat();
		System.out.println("�¼���ȣ �Է�[1~10]:");
		int idx = scan.nextInt() -1;
		
		if(seat[idx] ==0) {
			seat[idx] = 1;
			cnt+=1;
			System.out.println("���� �Ϸ�");
		}else {
			System.out.println("�̹� ���Ű� ���� �¼�");
		}
	}
	
	void showSales() {
		money = cnt *12000;
		System.out.println("����� = "+money+"��");
	}
	void run() {
		while(true) {
			//�޴� ���
			showMenu();
			
			System.out.print("�޴� ����");
			int choice = scan.nextInt();
			
			if(choice ==1) choiceSeat();
			else if(choice ==2) {
				showSales();
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}

public class Repeat_Ex05_Seat {
	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.name = "�ް��ڽ�";
		m.run();
	}
}
