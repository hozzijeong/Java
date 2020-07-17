package _09_shop;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class User {
	String id;
	int money;

	User(String id, int mo) {
		this.id = id;
		money = mo; // 생성자를 통해 유저 자체의 기본을 id와 돈을 받음. 
	}

	void print() {
		System.out.println("[" + id + "] " + "금액 : " + money);
	}
}

class UserManager {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<User> userList = new Vector<User>(); // 전체 유저 리스트, 유저를 arraylist의 구버전을 통해 클래스 배열로 만듦. 
	int userLog = -1;

	UserManager() { // 유저 매니저 클래스의 생성자를 init을 시작하는 것으로 설정. 
		init();
	}

	void init() {
		String[] a = { "김", "박", "이", "최", "정", "오" };
		String[] b = { "철", "병", "만", "여", "아", "영" };
		String[] c = { "수", "욱", "수", "정", "름", "희" };
		for (int i = 0; i < 10; i++) {
			int r = ran.nextInt(a.length);
			String name = a[r];
			r = ran.nextInt(b.length);
			name += b[r];
			r = ran.nextInt(c.length);
			name += c[r];
			User temp = new User(name, ran.nextInt(5000)); // 랜덤한 유저의 이름과 돈을 User클래스 temp에 넣고 그것을 userlist에 넣은 뒤, 10번 반복
			userList.add(temp);
		}
	}

	void join() {
		System.out.println("[가입] id 를 입력하세요.");
		String id = scan.next();
 		User temp = new User(id, 0); // 새로운 아이디 가입을 받음. 
		userList.add(temp);
		System.out.println("[메세지] " + temp.id + "님 가입을 축하합니다.");
	}
	
	void leave() {
			System.out.println("[탈퇴] id 를 입력 하세요.");
			String id = scan.next();
			int idx = -1;
			for(int i=0; i<userList.size();i++	) {
				if(id.equals(userList.get(i).id)) {
					idx = i;
				}
			}
			if(idx != -1) {
				userList.remove(idx);
				System.out.println("[메세지] 탈퇴 완료.");
			}else {
				System.out.println("[메세지] 아이디가 존재하지 않습니다.");
			}
	}

	boolean logIn() {
		userLog = -1;
		System.out.println("[로그인] id 를 입력하세요.");
		String id = scan.next();
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).id)) {
				userLog = i;
				break;
			}
		}
		if (userLog == -1) {
			System.out.println("[메세지] 없는 id 입니다.");
		} else {
			System.out.println("[메세지] " + userList.get(userLog).id + "님 로그인.");
			return true;
		}
		return false;
	}

	void logOut() {
		if (userLog != -1) {
			System.out.println("[메세지] " + userList.get(userLog).id + "님 로그아웃.");
		}
		userLog = -1;
	}
	
	void addUser() {
		printUser();
		System.out.print("[유저 추가] id입력:");
		String id = scan.next();
		int check = -1;
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).id)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("[유저 추가] 금액 입력:");
			int money = scan.nextInt();
			User nu = new User(id,money);
			userList.add(nu);
		}else {
			System.out.println("[메세지] 사용할수 없는 id");
		}
		
	}
	
	void delUser() {
		printUser();
		System.out.print("[유저 삭제] 번호 입력:");
		int idx = scan.nextInt();
		userList.remove(idx);
		System.out.println("[메세지] 삭제 완료");
	}

	void printUser() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.print("[" + i + "] ");
			userList.get(i).print(); // 유저 리스트 출력 
		}
	}
}
