package ex07_method;

import java.util.Scanner;

class Bank{
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	
	String[] arAcc = {"1111","2222","3333","",""};
	String[] arPw = {"1234","2345","3456","",""};
	int[] arMoney = {87000,340000,-110010,0,0};
	
	int count = 3;
	
	int log = 2;
	
	void showmember() {
		for(int i=0; i<count; i++) {
			System.out.println(arAcc[i] +":"+arPw[i]+":"+arMoney[i]+"원");
		}
	}
	
	void showmenu() {
		System.out.println("#로그인 상태:");
		if(log ==-1) {
			System.out.println("로그아웃");
		}else {
			System.out.println(arAcc[log]+"님 로그인중");
			
		}
		
		System.out.println("==="+name+"===");
		System.out.println("1.가입");
		System.out.println("2.탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그 아웃");
		System.out.println("5.입금");
		System.out.println("6.이체");
	}
	
	int checkAcc(String myAcc) {
		int check = 1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = -1;
			}
		}
		return check;
	}
	int checkPw(int accCheck) {
		System.out.println("비밀번호 입력:");
		String myPw = scan.next();
		
		int pwcheck = -1;
		if(arPw[accCheck].equals(myPw)) {
			pwcheck = 1;
		}
		return pwcheck;
	}
	int checkAcc() {
		System.out.println("탈퇴할 계좌번호 입력:");
		String myAcc = scan.next();
		
		int accCheck = -1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	void delmember() {
		if(count ==0) {
			System.out.println("회원정보 x");
			return;
		}
		
		int accCheck = checkAcc();
		
		if(accCheck != -1) {
			int pwCheck = checkPw(accCheck);
			if(pwCheck ==-1) {
				System.out.println("비밀번호 잘못 입력");
			}else {
				for(int i=accCheck; i<count-1; i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				count -=1;
				System.out.println("탈퇴 완료");
			}
		}else {
			System.out.println("없는 계좌");
		}
	}
	
	void joinmember() {
		if(count ==5) {
			System.out.println("더이상 가입 불가");
			return;
		}
		
		System.out.println("계좌 입력:");
		String myAcc = scan.next();
		int check  = checkAcc(myAcc);
		if(check == -1) {
			System.out.println("중복");
		}else {
			System.out.println("비번입력");
			String myPw = scan.next();
			
			arAcc[count]= myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			
			count +=1;
			System.out.println("축");
			
		}
	}
	
	void login() {
		if(log != -1) {
			System.out.println("로그아웃 후 진행");
			return;
			
		}
		
		System.out.println("계좌 입력:");
		String id = scan.next();
		
		System.out.println("비번 입력:");
		String pw = scan.next();
		
		for(int i=0; i<count; i++) {
			if(id.equals(arAcc[i])&& pw.equals(arPw[i])) {
				log = i;
			}
		}
		
		if(log == -1) {
			System.out.println("아이디 / 비번 확인");
		}else {
			System.out.println("로그인 성공");
		}
		
	}
	void logout() {
		if(log ==-1) {
			System.out.println("로그인");
		}else {
			log = -1;
			System.out.println("로그아웃 완료");
		}
	}
	
	void income() {
		System.out.println("입금 금액 입력:");
		int money = scan.nextInt();
		arMoney[log] += money;
		System.out.println("입금 완료");

	}
	void trans() {
		System.out.println("계좌 입력:");
		String transAcc = scan.next();
		
		int check = -1;
		for(int i=0; i<count; i++) {
			if(arAcc[i] .equals(transAcc)) {
				check =i;
			}
		}
		if(check ==-1) {
			System.out.println("계좌번호 확인");
			return;
		}else {
			System.out.println("이체 금액 입력");
			int transmoney = scan.nextInt();
			
			if(arMoney[log]>=transmoney) {
				arMoney[log] -= transmoney;
				arMoney[check] += transmoney;
				System.out.println("이체 완료");
			}else {
				System.out.println("잔고 부족");
			}
		}
	}
	
	void run() {
		while (true) {
			showmember();
			showmenu();
			
			System.out.println("메뉴 선택");
			int choice = scan.nextInt();
			
			if(choice ==1) {joinmember();}
			else if(choice ==2) {delmember();}
			else if(choice ==3) {login();}
			else if(choice ==4) {logout();}
			else if(choice ==5) {income();}
			else if(choice ==6) {trans();}
		}
	}
	
	
}

public class Repeat_Ex09_ATM {
	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.name = "은행";
		
		b.run();
	}
}
