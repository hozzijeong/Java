package ex;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1206~1230(24분)
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */


public class Day03_Ex03_ATM_total {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log == -1) {
					System.out.println("계좌번호 입력:");
					int myAcc = scan.nextInt();
					
					System.out.println("비밀번호 입력:");
					int myPw = scan.nextInt();
					
					if(myAcc == dbAcc1 && myPw == dbPw1) {
						System.out.println("Acc1 로그인 완료");
						log = 1;
					}else if(myAcc == dbAcc2 && myPw == dbPw2) {
						System.out.println("Acc2 로그인 완료");
						log = 2;
					}else {
						System.out.println("계좌와 비밀번호를 확인해주세요");
					}
				}
				else {
					if(log ==1) {
						System.out.println("Acc1로그인중...");
					}else if (log ==2) {
						System.out.println("Acc2로그인중...");
					}
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다!");
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}
			else if(sel == 3) {
				if (log == 1) {
					System.out.println("Acc1에 입금할 금액 입력:");
					int money = scan.nextInt();
					dbMoney1 = dbMoney1 + money;
					System.out.println("Acc1 입금 완료");
				}else if(log == 2) {
					System.out.println("Acc2에 입금할 금액 입력:");
					int money = scan.nextInt();
					dbMoney2 = dbMoney2 + money;
					System.out.println("Acc2 입금 완료");
					
				}else {
					System.out.println("계좌번호를 확인해주세요.");
				}
			}
			else if(sel == 4) {
				if (log == 1) {
					System.out.println("Acc1에 출금할 금액 입력:");
					int money = scan.nextInt();
					if(dbMoney1 - money >=0) {
						dbMoney1 = dbMoney1 - money;
						System.out.println("Acc1 출금 완료");
					}else {
						System.out.println("Acc1 잔액이 부족합니다.");
					}
				}else if(log == 2) {
					System.out.println("Acc2에 출금할 금액 입력:");
					int money = scan.nextInt();
					if(dbMoney2-money >=0) {
						dbMoney2 = dbMoney2 - money;
						System.out.println("Acc2 출금 완료");
					}else {
						System.out.println("Acc2 잔액이 부족합니다.");
					}
				}else {
					System.out.println("계좌번호를 확인해주세요.");
				}

			}
			else if(sel == 5) {
				if(log == 1) {
					System.out.println("이체할 계좌번호를 입력해주세요:");
					int yourAcc = scan.nextInt();
					if(yourAcc == dbAcc2) {
						System.out.println("이체할 금액을 입력하세요:");
						int money = scan.nextInt();
						
						if (dbMoney1 - money >=0) {
							dbMoney1 = dbMoney1-money;
							dbMoney2 = dbMoney2+money;
							System.out.println("Acc2에 이체 완료!");
						}else {
							System.out.println("계좌 잔액 부족");
						}
					}else {
						System.out.println("계좌번호를 확인해주세요");
					}
				}else if (log == 2) {
					System.out.println("이체할 계좌번호를 입력해주세요:");
					int yourAcc = scan.nextInt();
					if(yourAcc == dbAcc1) {
						System.out.println("이체할 금액을 입력하세요:");
						int money = scan.nextInt();
						if (dbMoney2 - money >=0) {
							dbMoney2 = dbMoney2-money;
							dbMoney1 = dbMoney1+money;
							System.out.println("Acc1에 이체 완료!");
						}else {
							System.out.println("계좌 잔액 부족");
						}
					}else {
						System.out.println("계좌번호를 확인해주세요");
					}	
				}
			}
			else if(sel == 6) {
				if (log == 1) {
					System.out.printf("Acc1의 잔액:%d\n",dbMoney1);
				}else if(log==2) {
					System.out.printf("Acc2의 잔액:%d\n",dbMoney2);	
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}


	}
}
