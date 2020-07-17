package ex;
/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 *
 *
 */

import java.util.Scanner;

public class Day02_Ex10_ATM2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("ID:");
				int usId = scan.nextInt();
				if (usId == dbAcc1 || usId == dbAcc2) {
					System.out.println("Pw:");
					int usPw = scan.nextInt();
					if(usId == dbAcc1 && usPw == dbPw1) {
						System.out.println("Acc1로그인 성공");
					}else if (usId == dbAcc2 && usPw == dbPw2) {
						System.out.println("Acc2로그인 성공");
					}else {
						System.out.println("비밀번호가 일치하지 않습니다. ");
					}
				}
				else {
					System.out.println("잘못된 ID.");
				}
			}
			else if(sel == 2) {
				
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}
	}
}
