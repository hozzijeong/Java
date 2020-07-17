package ex;

import java.util.Scanner;

class Ticket{
	static int count = 0;
	
	boolean check;
	void showData() {
		if(check == true) {
			System.out.print("■ ");
		}else {
			System.out.print("□ ");
		}
	}
}
public class Day25_Ex03_theater_seat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ticket[] tickets = new Ticket[8];
		for(int i=0; i<tickets.length;i++	) {
			tickets[i] = new Ticket();
		}
		
		while(true) {
			for(int i=0; i<tickets.length;i++) {
				tickets[i].showData();
			}
			System.out.println();
			System.out.println("[영화 예매]");
			System.out.println("[1]좌석 선택");
			System.out.println("[2]결제");
			int sel = scan.nextInt();
			
			if(sel ==1) {
				System.out.print("[좌선선택] 좌석 입력(1~8)");
				int idx = scan.nextInt();
				idx -=1;
				
				if(tickets[idx].check == false) {
					tickets[idx].check = true;
					Ticket.count +=1;
				}else {
					System.out.println("[메세지] 이미 예매된 좌석입니다.");
				}
			}
			else if(sel ==2) {
				int total = Ticket.count *12000;
				System.out.println("[결제] 총 금액은 "+total+"원입니다.");
			}
		}
		
		
		
		
	}
}
