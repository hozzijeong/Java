package ex;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1156~1205(9분)
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */


public class Day03_Ex02_ATM2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("입금할 금액 입력:");
				int income = scan.nextInt();
				myMoney = myMoney+income;
			}
			else if(sel == 2) {
				System.out.println("출금할 금액 입력:");
				int outcome = scan.nextInt();
				
				myMoney = myMoney-outcome;
				if(myMoney<0) {
					System.out.println("잔액이 부족합니다...");
					myMoney = myMoney+outcome;
				}
			}
			else if(sel == 3) {
				System.out.println("계좌번호 입력:");
				int Acc = scan.nextInt();
				
				if (Acc == yourAcc) {
					System.out.println("이체 금액 입력:");
					int income = scan.nextInt();
					
					if(myMoney-income>=0) {
					myMoney = myMoney-income;
					yourMoney = yourMoney+income;
					}else {
						System.out.println("내 통장에 잔액이 부족합니다.");
					}
				}else {
					System.out.println("계좌번호를 확인해주세요.");
				}
			}
			else if(sel == 4) {
				System.out.printf("내 통장 잔액은 %d원입니다.\n",myMoney);
				System.out.printf("니 통장 잔액은 %d원입니다.\n",yourMoney);
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}


	}
}
