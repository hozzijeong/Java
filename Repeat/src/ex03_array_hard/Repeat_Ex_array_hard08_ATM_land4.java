package ex03_array_hard;

import java.util.Scanner;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class Repeat_Ex_array_hard08_ATM_land4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			
			if(log != -1) {
				System.out.println("현재"+arId[log]+"로그인 중...");
			}
			
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("[회원가입]ID입력:");
				int id = scan.nextInt();
				System.out.println("[회원가입]PW입력:");
				int pw = scan.nextInt();
				for(int i=0; i<MAX;i++) {
					if(arId[i] == id ) {
						System.out.println("이미 가입된 아이디 입니다");
					}
				}
				arId[count] = id;
				arPw[count] = pw;
				arMoney[count]+=1000;
				System.out.println(arId[count]+"님 회원가입을 축하합니다!");
				
				count+=1;
				
			}
			else if(sel == 2) {
				if(log !=-1) {
					arId[log] = 0;
					arPw[log] = 0;
					arMoney[log] = 0;
					System.out.println(arId[log]+"님 회원탈퇴 완료되었습니다.");
					log = -1;
				}else {
					System.out.println("로그인 후 이용 가능합니다. ");
				}
			}
			else if(sel == 3) {
				if(log==-1) {
					System.out.println("[로그인]ID입력:");
					int id = scan.nextInt();
					System.out.println("[로그인]PW입력:");
					int pw = scan.nextInt();
					int check = -1;
					for(int i=0; i<MAX;i++) {
						if(arId[i] == id && arPw[i] == pw) {
							check = i;
							log = i;
						}
					}
					if(check == -1) {
						System.out.println("ID 또는 PW를 확인해주세요");
					}else {
						System.out.println(arId[log]+"님 환영합니다.");
					}
				}else {
					System.out.println(arId[log]+"님이 현재 로그인 중입니다.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					log = -1;
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 5) {
				if(log!=-1) {
					System.out.println("[입금] 입금할 금액을 입력하세요");
					int money = scan.nextInt();
					
					arMoney[log]+=money;
					
					System.out.println(arId[log]+"님,"+money+"원 입금 완료");
				}else {
					System.out.println("로그인 후 이용할 수 있습니다.");
				}
			}
			else if(sel == 6) {
				if(log!=-1) {
					int check = -1;
					System.out.println("[이체] 이체할 계좌번호를 입력해주세요");
					int youracc = scan.nextInt();
					for(int i=0; i<MAX;i++) {
						if(youracc == arId[i]) {
							check = i;
						}
					}
					if(check ==-1) {
						System.out.println("계좌번호를 확인해주세요");
						continue;
					}
					System.out.println("[이체] 이체할 금액을 입력해주세요");
					int transfer = scan.nextInt();
					
					if(arMoney[log] - transfer <0) {
						System.out.println(arId[log]+"님 잔액이 부족합니다.");
					}else {
						arMoney[log] -= transfer;
						arMoney[check] += transfer;
						System.out.println(arId[log]+"님"+arId[check]+"님에게"+transfer+"원 이체 완료");
					}
				}
			}
			else if(sel == 7) {
				if(log!=-1) {
					System.out.println(arId[log]+"님의 잔액은"+arMoney[log]+"원 입니다.");
				}
			}
			else if(sel == 0) {
				break;
			}
		}
		


	}
}
