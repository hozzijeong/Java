package memo;

import java.util.Scanner;

public class MemoProject {
	static MemoList memoList = new MemoList();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu!= 7) {
			do {
				System.out.println("==========================================================");
				System.out.println("1.�Է� 2.��� 3.���� 4.���� 5.���Ϸ� ���� 6.���Ͽ��� �б� 7.����");
				System.out.println("==========================================================");
				System.out.println("���ϴ� �޴� ����:");
				menu = sc.nextInt();
			}while(menu<1 || menu>7);
			
			switch(menu) {
				case 1 : insert(); break;
				case 2 : select(); break;
				case 3 : update(); break;
				case 4 : delete(); break;
				case 5 : fileWrite(); break;
				case 6 : fileRead(); break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void fileRead() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�о�� ���� �̸� �Է�:");
		
		String fileName = scan.nextLine().trim();
		memoList.fileReadMemo(fileName);
	}
	
	private static void fileWrite() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� �̸� �Է�:");
		String fileName = scan.nextLine().trim();
		
		memoList.fileWriteMemo(fileName);
		System.out.println("���� ���� �Ϸ�");
	}
	
	private static void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� ��ȣ �Է�:");
		int no = scan.nextInt();
		
		MemoVo vo = memoList.selectMemo(no);
		if(vo != null) {
			System.out.println(vo);
			scan.nextLine();
			System.out.println("������ ���� ��й�ȣ �Է�:");
			String password = scan.nextLine().trim();
			System.out.println("������ ���� ���� �Է�:");
			String memo = scan.nextLine().trim();
			
			if(password.equals(vo.getPassword())) {
				memoList.updateMemo(no, memo);
				System.out.println(no+"�� �� ���� �Ϸ�");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println(no+"�� ���� �������� �ʽ��ϴ�.");
		}
	}
	
	private static void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� ��ȣ �Է�:");
		int no = scan.nextInt();
		
		MemoVo vo = memoList.selectMemo(no);
		
		if(vo != null) {
			System.out.println(vo);
			scan.nextLine();
			System.out.println("������ ���� ��й�ȣ �Է�:");
			String password = scan.nextLine().trim();
			
			if(password.equals(vo.getPassword())) {
				memoList.deleteMem0(no);
				System.out.println(no+"�� �� ���� �Ϸ�");
			}else {
				System.out.println("��й�ȣ ��ġ���� ����.");
			}
		}else {
			System.out.println(no+"�� ���� �������� ����");
		}
	}
	
	private static void select() {
		memoList.viewMemo();
	}
	
	private static void insert() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸�, ��й�ȣ,�޸� �Է�:");
		System.out.println("�̸�:");
		String name = scan.nextLine();
		System.out.println("��й�ȣ:");
		String password = scan.nextLine();
		System.out.println("�޸�:");
		String memo = scan.nextLine();
		
		MemoVo vo = new MemoVo(name, password, memo);
		
		memoList.addMemo(vo);
		
		System.out.println("���� �Ϸ�");
	}
}
