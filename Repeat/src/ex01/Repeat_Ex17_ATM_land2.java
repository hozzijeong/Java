package ex01;

import java.util.Scanner;

public class Repeat_Ex17_ATM_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cash = 20000;
		int balance = 30000;
		int account = 1111;
		int password = 1234;
		
		System.out.println("==MEGA ATM==");
		System.out.println("1.로그인 2.종료");
		int sell = scan.nextInt();
		if(sell == 1) {
			System.out.println("계좌와 비밀번호 입력");
			int myAcc = scan.nextInt();
			int myPw = scan.nextInt();
			if(myAcc == account && myPw == password) {
				System.out.println("로그인을 환영합니다.");
				System.out.println("1.입금 2. 출금 3.조회");
				int sel1 = scan.nextInt();
				if(sel1 ==1	) {
					System.out.println("입금할 금액 입력:");
					int deposit = scan.nextInt();
					if(cash - deposit>=0) {
					cash -=deposit;
					balance += deposit;
					}else {
						System.out.println("현금이 부족합니다. ");
					}
				}else if(sel1 ==2) {
					System.out.println("출금할 금액 입력:");
					int withdraw = scan.nextInt();
					if(balance - withdraw >=0) {
						cash += withdraw;
						balance -=withdraw;
					}else {
						System.out.println("출금 금액이 부족합니다.");
					}
				}else if(sel1 ==3) {
					System.out.println("조회: "+balance+"원");
				}
			}else {
				System.out.println("아이디와 패스워드를 확인해주세요.");
			}
		}else if(sell ==2) {
			System.out.println("종료");
		}
	}
}
