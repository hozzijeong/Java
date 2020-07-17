package _09_shop;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class User {
	String id;
	int money;

	User(String id, int mo) {
		this.id = id;
		money = mo; // �����ڸ� ���� ���� ��ü�� �⺻�� id�� ���� ����. 
	}

	void print() {
		System.out.println("[" + id + "] " + "�ݾ� : " + money);
	}
}

class UserManager {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<User> userList = new Vector<User>(); // ��ü ���� ����Ʈ, ������ arraylist�� �������� ���� Ŭ���� �迭�� ����. 
	int userLog = -1;

	UserManager() { // ���� �Ŵ��� Ŭ������ �����ڸ� init�� �����ϴ� ������ ����. 
		init();
	}

	void init() {
		String[] a = { "��", "��", "��", "��", "��", "��" };
		String[] b = { "ö", "��", "��", "��", "��", "��" };
		String[] c = { "��", "��", "��", "��", "��", "��" };
		for (int i = 0; i < 10; i++) {
			int r = ran.nextInt(a.length);
			String name = a[r];
			r = ran.nextInt(b.length);
			name += b[r];
			r = ran.nextInt(c.length);
			name += c[r];
			User temp = new User(name, ran.nextInt(5000)); // ������ ������ �̸��� ���� UserŬ���� temp�� �ְ� �װ��� userlist�� ���� ��, 10�� �ݺ�
			userList.add(temp);
		}
	}

	void join() {
		System.out.println("[����] id �� �Է��ϼ���.");
		String id = scan.next();
 		User temp = new User(id, 0); // ���ο� ���̵� ������ ����. 
		userList.add(temp);
		System.out.println("[�޼���] " + temp.id + "�� ������ �����մϴ�.");
	}
	
	void leave() {
			System.out.println("[Ż��] id �� �Է� �ϼ���.");
			String id = scan.next();
			int idx = -1;
			for(int i=0; i<userList.size();i++	) {
				if(id.equals(userList.get(i).id)) {
					idx = i;
				}
			}
			if(idx != -1) {
				userList.remove(idx);
				System.out.println("[�޼���] Ż�� �Ϸ�.");
			}else {
				System.out.println("[�޼���] ���̵� �������� �ʽ��ϴ�.");
			}
	}

	boolean logIn() {
		userLog = -1;
		System.out.println("[�α���] id �� �Է��ϼ���.");
		String id = scan.next();
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).id)) {
				userLog = i;
				break;
			}
		}
		if (userLog == -1) {
			System.out.println("[�޼���] ���� id �Դϴ�.");
		} else {
			System.out.println("[�޼���] " + userList.get(userLog).id + "�� �α���.");
			return true;
		}
		return false;
	}

	void logOut() {
		if (userLog != -1) {
			System.out.println("[�޼���] " + userList.get(userLog).id + "�� �α׾ƿ�.");
		}
		userLog = -1;
	}
	
	void addUser() {
		printUser();
		System.out.print("[���� �߰�] id�Է�:");
		String id = scan.next();
		int check = -1;
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).id)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("[���� �߰�] �ݾ� �Է�:");
			int money = scan.nextInt();
			User nu = new User(id,money);
			userList.add(nu);
		}else {
			System.out.println("[�޼���] ����Ҽ� ���� id");
		}
		
	}
	
	void delUser() {
		printUser();
		System.out.print("[���� ����] ��ȣ �Է�:");
		int idx = scan.nextInt();
		userList.remove(idx);
		System.out.println("[�޼���] ���� �Ϸ�");
	}

	void printUser() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.print("[" + i + "] ");
			userList.get(i).print(); // ���� ����Ʈ ��� 
		}
	}
}
