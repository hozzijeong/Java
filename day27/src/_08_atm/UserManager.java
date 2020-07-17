package _08_atm;
import java.util.Scanner;
public class UserManager {
	Scanner scan = new Scanner(System.in);
	User[] user = null; // ���� ���� ���ε�.
	int userCount = 0; // ������ ���� 
	
	void print_all_user() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount(); // ���� �̸�, ���� ��������  ǥ�� 
		}
	}
	void addUser() {
		// ���̵� �ߺ�ó�� 		
		if(userCount == 0) {
			user = new User[1]; // ���ο� �迭 ����. 
		}else {
			User temp [] = user;
			user = new User[userCount + 1];
			for(int i = 0; i < userCount; i++) {
				user[i] = temp[i];
			} 
		}
		user[userCount] = new User();
		System.out.println("[����] ���̵� �Է��ϼ���. ");
		String name = scan.next();
		int check = -1;
		for(int i=0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				check = i;
			}
		}
		if(check != -1) {
			System.out.println("[�޼���] �̹� �����ϴ� ���̵� �Դϴ�.");
			return;
		}
		
		System.out.println("[����] ��й�ȣ�� �Է��ϼ���. ");
		String pw = scan.next();
		user[userCount].pw = pw;
		user[userCount].name = name;
		userCount += 1;
		
		System.out.println("�����Ŵ��� : userCount = " + userCount);
	}
	
	User getUser(int i) {
		return user[i];
	}
	
	int logUser() {
		int log = -1;
		System.out.println("[�Է�] ���̵� �Է��ϼ���. ");
		String name = scan.next();
		System.out.println("[�Է�] ��й�ȣ�� �Է��ϼ���. ");
		String pw = scan.next();
		for(int i = 0; i < userCount; i++) {
			if(name.equals(user[i].name)&&pw.equals(user[i].pw)) {
				log = i;
				System.out.println("[" + user[log].name + "] �� �α���.");
			}
		}
		return log; // ���� �α���
	}
	void leave() {
		String name = scan.next(); // ������ ���̵� �Է�
		int id = -1;
		for(int i = 0; i < userCount; i++) {
			if(name.equals(user[i].name)) {
				id = i;			
			}  // ���̵� �ִ��� �˻�
		}
		if(id == -1) return; // ������ ���̵� �������� ������ back;
		User[] temp = user;
		user = new User[userCount - 1];
		for(int i = 0; i < id; i++) {
			user[i] = temp[i];
		}
		for(int i =id; i < userCount; i++) {
			user[i] =temp[i + 1];
		}
		userCount -= 1;
	}
}

// ������ �α���, ȸ�� ����, ȸ�� Ż�� �����ϴ� Ŭ����
