package ex;

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

class Ex11{
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555"};
	String[] arPw  = {"1234", "2345", "3456", "4567", "5678"};
	int[] arMoney  = {87000, 34000, 17500, 98000, 12500};
	
	int count = 5;
	
	// 3333 로그인 중
	int loginCheck = 2;
}


public class Day23_Ex01_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		while(true) {
			if(e.loginCheck != -1) {
				System.out.println(e.arAcc[e.loginCheck]+"로그인 중 ");
				System.out.println();
			}else {
				for(int i=0; i<e.count; i++) {
					System.out.println(e.arAcc[i]+":"+e.arPw[i] + "->" + e.arMoney[i]);
				}
				System.out.println();
			}
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(e.loginCheck == -1) {
					if(e.count >=5) {
						System.out.println("[메세지] 더이상 가입할 수 없습니다.");
						continue;
					}
					System.out.println("[회원가입] 아이디를 입력하세요");
					String id = scan.next();
					int  check = -1;
					
					for(int i=0; i<e.arAcc.length;i++) {
						if(id.equals(e.arAcc[i])) {
							check = i;
						}
					}
					if(check != -1) {
						System.out.println("[메세지] 이미 가입된 아이디입니다.");
						continue;
					}
					
					System.out.println("[회원가입] 비밀번호를 입력하세요");
					String pw = scan.next();
					
					e.arAcc[e.count] = id;
					e.arPw[e.count] = pw;
					e.arMoney[e.count] += 1000;
					e.count +=1;
				}else {
					System.out.println("[메세지] 로그아웃 후 이용해주세요");
				}
			}
			else if(sel == 2) {
				if(e.loginCheck != -1) {
					
					if(e.count == 1) {
						e.arAcc =  null;
						e.arPw = null;
						e.arMoney = null;
						e.count = -1;
						e.loginCheck = -1;
						continue;
					}
					
					String [] temp_a = e.arAcc;
					String [] temp_p = e.arPw;
					int [] temp_m = e.arMoney;
					e.arAcc = new String [e.count-1];
					e.arPw = new String [e.count-1];
					e.arMoney = new int [e.count-1];
					
					for(int i=0; i<e.arAcc.length;i++) {
						if(i != e.loginCheck) {
							e.arAcc[i] = temp_a[i];
							e.arMoney[i] = temp_m[i];
							e.arPw[i] = temp_p[i];
						}
					}
					
					e.count-=1;
					e.loginCheck = -1;
				}else {
					System.out.println("[메세지] 로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 3) {
				if(e.loginCheck == -1) {
					System.out.println("[로그인] 아이디 입력:");
					String id = scan.next();
					System.out.println("[로그인] 비밀번호 입력:");
					String pw = scan.next();
					
					
					for(int i=0; i<e.count;i++) {
						if(id.equals(e.arAcc[i])&& pw.equals(e.arPw)) {
							e.loginCheck = i;
						}
					}
					if(e.loginCheck == -1) {
						System.out.println("[메세제] 아이디 또는 비밀번호를 확인하세요.");
						continue;
					}
					
					System.out.println("[메세지]"+e.arAcc[e.loginCheck]+"님 환영합니다.");
				}else {
					System.out.println("[메세지] 로그아웃 후 이용해주세요");
				}
			}
			else if(sel == 4) {
				if(e.loginCheck != -1) {
					e.loginCheck = -1;
					System.out.println("[메세지] 로그아웃 완료");
				}else {
					System.out.println("[메세지] 로그인 후 이용해주세요.");
				}
			}
			else if(sel == 5) {
				if(e.loginCheck != -1) {
					System.out.println("[입금] 입금 금액을 입력하세요");
					int deposit = scan.nextInt();
					
					e.arMoney[e.loginCheck] += deposit;
					
					System.out.println("[메세지] 입금 완료");
				}else {
					System.out.println("[메시지] 로그인 후 이용해주세요");
				}
			}
			else if(sel == 6) {
				if(e.loginCheck != -1) {
					System.out.println("[이체] 이체 계좌번호를 입력하세요");
					String acc = scan.next();
					int check = -1;
					for(int i=0; i<e.count; i++) {
						if(acc.equals(e.arAcc[i])) {
							check = i;
						}
					}
					if(check ==-1) {
						System.out.println("[메세지] 이체 계좌번호를 확인해주세요");
						continue;
					}
					
					System.out.println("[이체] 이체 금액을 입력하세요.");
					int transfer = scan.nextInt();
					
					System.out.println("[이체] 비밀번호를 입력하세요.");
					String pw = scan.next();
					
					if(!pw.equals(e.arPw[e.loginCheck])) {
						System.out.println("[메세지] 비밀번호를 확인하세요.");
						continue;
					}
					
					if(e.arMoney[e.loginCheck] - transfer >=0) {
						System.out.println("[메세지]"+e.arAcc[check]+"님께 이체 완료");
					}else {
						System.out.println("[메세지] 이체 금액 부족");
						continue;
					}
				}
			}
			else if(sel == 7) {
				if(e.loginCheck != -1) {
					System.out.println("[잔액조회]"+e.arMoney[e.loginCheck]+"원");
				}else {
					System.out.println("[메세지] 로그인 후 이용해주세요");
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		


	}

}
