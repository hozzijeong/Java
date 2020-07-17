package ex;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;

public class Day09_Ex01_ATM_land4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1; // 로그아웃 상태. 로그인의 경우 1로 변경
		int id = 0;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log==-1) {
					if(count==5) {
						System.out.println("더이상 가입 할 수 없습니다.");
						continue;
					}
					int check = -1;
					System.out.println("[회원가입] ID입력:");
					int myAcc = scan.nextInt();
					
					for(int i=0; i<MAX;i++) {
						if(arId[i] == myAcc) {
							check =1;
						}
					}
					if(check == 1) {
						System.out.println("이미 존재하는 ID입니다.");
					}else {
						System.out.println("[회원가입] PW입력:");
						int myPw = scan.nextInt();
						arId[count] = myAcc;
						arPw[count] = myPw;
						arMoney[count] = 1000;
						count+=1;
						System.out.println("[회원가입] 완료! 환영합니다. ");
					}
				}else {
					System.out.println("로그아웃 후 이용 가능합니다.");
				}
			}
			else if(sel == 2) {
				if(log ==1) {
					int delId = -1;
					
					System.out.println("[회원탈퇴] ID를 입력해주세요.");
					int myAcc = scan.nextInt();
					
					for(int i=0; i<MAX;i++) {
						if(arId[i] == myAcc) {
							delId = i;
						}
					}
					if(delId == -1) {
						System.out.println("ID를 확인해주세요.");
					}else {
						for(int i=delId; i<=count-1;i++) {
							arId[i] = arId[i+1];
							arPw[i] = arPw[i+1];
						}
						count-=1;
						System.out.println("회원 탈퇴 완료");
						log = -1;
						id = 0;
					}
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 3) {
				if(log ==-1) {
					int check = -1;
					System.out.println("[로그인]ID를 입력해주세요.");
					int myAcc = scan.nextInt();
					System.out.println("[로그인]PW를 입력해주세요.");
					int myPw = scan.nextInt();
					
					for(int i=0; i<MAX; i++) {
						if(arId[i] == myAcc && arPw[i] == myPw) {
							check = 1;
							id = i+1;
						}
					}
					if(check ==1) {
						System.out.printf("[로그인완료] %d번째 고객님 환영합니다.",id);
						System.out.println();
						log = 1;
					}else {
						System.out.println("ID 또는 PW를 확인해주세요");
					}
				}else {
					System.out.println("로그아웃 후 이용 가능합니다. ");
				}
				
			}
			else if(sel == 4) {
				if(log ==1 ) {
					System.out.println("정말로 로그아웃 하시겠습니까?[1]예 [2]아니오	");
					int ask = scan.nextInt();
					if(ask ==1) {
						log = -1;
						id = 0;
						System.out.println("로그아웃 완료!");
					}else {
						continue;
					}
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 5) {
				if(log ==1) {
					System.out.printf("%d번째 고객님,입금할 금액을 입력하세요",id);
					System.out.println();
					int deposit = scan.nextInt();
					
					arMoney[id-1] += deposit;
					
					System.out.println("입금 완료.");
					System.out.println(arMoney[id-1]);
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 6) {
				if(log ==1) {
					int check = -1;
					int acc = 0;
					System.out.println("입금할 계좌를 입력하세요");
					int yourAcc = scan.nextInt();
					for(int i=0; i<MAX; i++) {
						if(yourAcc == arId[i]) {
							check = 1;
							acc = i;
						}
					}
					if(check ==1) {
						System.out.println("이체할 금액을 입력하세요.");
						int transfer = scan.nextInt();
						if(arMoney[id-1]-transfer>=0) {
							arMoney[id-1] -=transfer;
							arMoney[acc] += transfer;
							System.out.println("이체 완료.");
						}else {
							System.out.println("이체 금액이 부족합니다.");
						}
					}else {
						System.out.println("계좌를 확인해주세요.");
					}
				}else {
					System.out.println("로그인 후 이용 가능합니다. ");
				}
				
			}
			else if(sel == 7) {
				if(log==1) {
					System.out.printf("%d번째 고객님의 잔액은: %d",id,arMoney[id-1]);
					System.out.println();
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 0) {
				break;
			}
		}


		
	}
}
