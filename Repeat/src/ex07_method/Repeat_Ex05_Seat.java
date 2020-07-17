package ex07_method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Movie{
	Scanner scan = new Scanner(System.in);
	
	int[] seat = new int[10];
	
	String name = "";
	int cnt = 0;
	int money = 0;
	
	void showMenu() {
		System.out.println("==="+name+"===");
		System.out.println("1.예매");
		System.out.println("2.종료");
	}
	void showSeat() {
		for(int i=0; i<seat.length;i++) {
			if(seat[i] ==0) {
				System.out.print(" [X] ");
			}else {
				System.out.print(" [O] ");
			}
		}
		System.out.println();
	}
	
	void choiceSeat() {
		//좌석 현황 출력
		
		showSeat();
		System.out.println("좌석번호 입력[1~10]:");
		int idx = scan.nextInt() -1;
		
		if(seat[idx] ==0) {
			seat[idx] = 1;
			cnt+=1;
			System.out.println("예매 완료");
		}else {
			System.out.println("이미 예매가 끝난 좌석");
		}
	}
	
	void showSales() {
		money = cnt *12000;
		System.out.println("매출액 = "+money+"원");
	}
	void run() {
		while(true) {
			//메뉴 출력
			showMenu();
			
			System.out.print("메뉴 선택");
			int choice = scan.nextInt();
			
			if(choice ==1) choiceSeat();
			else if(choice ==2) {
				showSales();
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

public class Repeat_Ex05_Seat {
	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.name = "메가박스";
		m.run();
	}
}
