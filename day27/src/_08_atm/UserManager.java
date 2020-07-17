package _08_atm;
import java.util.Scanner;
public class UserManager {
	Scanner scan = new Scanner(System.in);
	User[] user = null; // 유저 정보 업로드.
	int userCount = 0; // 가입자 숫자 
	
	void print_all_user() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount(); // 유저 이름, 유저 계좌정보  표기 
		}
	}
	void addUser() {
		// 아이디 중복처리 		
		if(userCount == 0) {
			user = new User[1]; // 새로운 배열 만듦. 
		}else {
			User temp [] = user;
			user = new User[userCount + 1];
			for(int i = 0; i < userCount; i++) {
				user[i] = temp[i];
			} 
		}
		user[userCount] = new User();
		System.out.println("[가입] 아이디를 입력하세요. ");
		String name = scan.next();
		int check = -1;
		for(int i=0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				check = i;
			}
		}
		if(check != -1) {
			System.out.println("[메세지] 이미 존재하는 아이디 입니다.");
			return;
		}
		
		System.out.println("[가입] 비밀번호를 입력하세요. ");
		String pw = scan.next();
		user[userCount].pw = pw;
		user[userCount].name = name;
		userCount += 1;
		
		System.out.println("유저매니저 : userCount = " + userCount);
	}
	
	User getUser(int i) {
		return user[i];
	}
	
	int logUser() {
		int log = -1;
		System.out.println("[입력] 아이디를 입력하세요. ");
		String name = scan.next();
		System.out.println("[입력] 비밀번호를 입력하세요. ");
		String pw = scan.next();
		for(int i = 0; i < userCount; i++) {
			if(name.equals(user[i].name)&&pw.equals(user[i].pw)) {
				log = i;
				System.out.println("[" + user[log].name + "] 님 로그인.");
			}
		}
		return log; // 유저 로그인
	}
	void leave() {
		String name = scan.next(); // 삭제할 아이디 입력
		int id = -1;
		for(int i = 0; i < userCount; i++) {
			if(name.equals(user[i].name)) {
				id = i;			
			}  // 아이디가 있는지 검사
		}
		if(id == -1) return; // 삭제할 아이디가 존재하지 않으면 back;
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

// 유저의 로그인, 회원 가입, 회원 탈퇴를 관리하는 클래스
