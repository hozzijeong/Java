package ex02_array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */


public class Repeat_Ex_array16_ATM_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(accs[i] +" ");
			}
			System.out.println();
			for(int i = 0; i<cnt; i++) {
				System.out.print(pws[i]+" ");
			}
			System.out.println();
			System.out.println("1.가입"); // 추가
			System.out.println("2.탈퇴"); // 삭제
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				int check = -1;
				if(cnt ==5) {
					System.out.println("더이상 계좌를 만들 수 없습니다.");
					continue;
				}
				System.out.println("계좌번호 입력:");
				int myAcc = scan.nextInt();
				for(int i = 0; i<cnt; i++) {
					if(accs[i] == myAcc) {
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("이미 존재하는 계좌번호 입니다.");
					continue;	
				}
				System.out.println("비밀번호 입력:");
				int myPw = scan.nextInt();
				
				accs[cnt] = myAcc;
				pws[cnt] = myPw;
				cnt+=1;
				
			}
			else if(sel == 2) {
				int check = -1;
				
				System.out.println("계좌번호 입력:");
				int myAcc = scan.nextInt();
				
				for(int i=0;i<cnt;i++) {
					if(accs[i] == myAcc) {
						check = i;
					}
				}
				if(check == -1) {
					System.out.println("해당 계좌번호는 존재하지 않습니다.");
					continue;
				}
				for(int i = check; i<cnt-1; i++) {
					accs[i] = accs[i+1];
					pws[i] = pws[i+1];
				}
				cnt-=1;
			}
			
		}
		


	}
}
