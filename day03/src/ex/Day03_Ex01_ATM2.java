package ex;
/*
 * # ATM[2단계]
 * 1132~1153(21분)
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

import java.util.Scanner;

public class Day03_Ex01_ATM2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		int myAcc;
		int myPw;
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log == -1) {
					System.out.println("ID:");
					myAcc = scan.nextInt();
					
					if (myAcc == dbAcc1) {
						System.out.println("PW:");
						myPw = scan.nextInt();
						if(myPw == dbPw1) {
							System.out.println("Acc1 로그인 완료");
							log = 1;
						}else {
							System.out.println("비밀번호 오류");
						}
					}else if (myAcc == dbAcc2) {
						System.out.println("PW:");
						myPw = scan.nextInt();
						if(myPw == dbPw2) {
							System.out.println("Acc2 로그인 완료");
							log = 2;
							}
						else {
							System.out.println("비밀번호 오류");
						}
					}else {
						System.out.println("ID를 확인해주세요.");
					}
				
				}else {
					System.out.println("로그아웃 후 이용해주세요.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃 되었습니다. ");
				}else {
					System.out.println("이미 로그아웃 상태입니다.");
				}
			}
				
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}


	}
}
