package ex;

//식권 자판기 프로그램 		
//1) 관리자   2) 사용자 
//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
//      2)뒤로가기
//조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
//화면 
//식권 가격 : 3200원 
//식권 	  : ??매  (매진시 매진) 
//50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
//1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 

import java.util.Scanner;

public class Day16_Ex02_coupon_bandingmacine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money  = {50000, 10000, 5000, 1000, 500, 100};
		int[] charge = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		
		
		
		
		while(true) {
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if(sel == 1) {
				while(true) {
					System.out.println("식권 가격:" + price+"원");
					System.out.println("식권:" + tickets+"개");
					for(int i=0; i<money.length;i++) {
						System.out.print(money[i]+"원 :"+charge[i]+"개\t");
						if(i ==2) {
							System.out.println("");
						}
					}
					int total = 0;
					for(int i=0; i<money.length;i++) {
						total+=(money[i] * charge[i]);
					}
					System.out.println();
					System.out.println("총 금액:"+total+"원");
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("충전할 식권 개수를 입력하세요:");
						int count = scan.nextInt();
						tickets += count;
						System.out.printf("식권 %d개 충전되었습니다.",count);
						System.out.println();
					}
					else if(choice == 2) {
						
						System.out.println("충전금액을 입력하세요");
						int plus = scan.nextInt();
						int sum = 0;
						
						while(true) {
							System.out.print("충전 지폐");
							System.out.println();
							for(int i=0; i<money.length;i++) {
								System.out.println("["+(i+1)+"]"+money[i]);
							}
							
							int bill = scan.nextInt();
							System.out.print("지폐 개수:");
							int per = scan.nextInt();
							
							if(money[bill-1]*per > plus) {
								System.out.println("충전금액을 초과했습니다");
								break;
							}
							System.out.println();

							if(bill == 1) {
								charge[bill-1] +=per;
							}else if(bill ==2) {
								charge[bill-1] +=per;								
							}else if(bill ==3) {
								charge[bill-1] +=per;
							}else if(bill ==4) {
								charge[bill-1] +=per;
							}else if(bill ==5) {
								charge[bill-1] +=per;
							}else if(bill ==6) {
								charge[bill-1] +=per;
							}
							
							sum += (money[bill-1] * per);
							
							if(sum == plus) {
								System.out.printf("%d원 충전 완료",plus);
								System.out.println();
								break;
							}
							
						}
					}
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("식권 가격:" + price+"원");
					System.out.println("식권:" + tickets+"개");
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("구매 매수 입력:");
						int buyticket = scan.nextInt();
						System.out.println("입금 금액 입력:");
						int inputMoney = scan.nextInt();
						
						
						int change = inputMoney -(buyticket*3200);
						 // 거스름돈 change!
						
						if(change>=0 && tickets - buyticket>=0) {
						 
							int temp = change;
							int idx=0;
							int check = -1;
							int [] check_charge = new int[charge.length];
							/*
						  *  입금 금액이 부족하지 않고, 식권 수량이 충분할 때,
						  *  
						  *  1. 거스름돈 확인
						  *  2. 거스름돈 나눔
						  *  	2-1 거스름돈을나눌 떄, charge에 지폐 개수 확인
						  *  		2-1-1 지폐 개수가 부족하다면 그 다음 단위 지폐개수 확인
						  *  
						  *  즉, 나눠서 몫을 구한다
						  *  	=> 몫만큼의 지폐가 있는지 확인한다.
						  *  	[1] 있다. [2] 없다.
						  *  1. 몫만큼의 지폐를 charge 에서 빼고, 나머지도 똑같이 한다.
						  *  
						  *  2. 있는 지폐 만큼이라도 값을 빼고 그 다음단위 지폐로 넘어간다
						  *  
						  *  다시 나눈다 => 몫을 구한다 => 몫만큼의 지폐가 있는지 확인한다.
						  *  => 끝까지 나눴는데 뭐가 안맞는다 => 잔돈 부족 출력  
						  * 
						  */
							
							
							for(int i=0; i<money.length;i++) {
								if(temp/money[i]>0) {
									idx = i;					
									break;
								}
							}
							
							while(idx<money.length) {
								if(charge[idx] >= temp/money[idx]) {
									charge[idx] -= temp/money[idx];
									check_charge[idx] += temp/money[idx];
									temp = temp%money[idx];
								}else if(charge[idx] < temp/money[idx]) {
									int a = charge[idx]*money[idx];
									check_charge[idx] += charge[idx];
									charge[idx] = 0;
									temp -= a;
								}
								idx+=1;
								if(temp == 0) {
									check = 1;
									break;
								}
							}
							if (check ==1) {
								tickets -= buyticket;
								System.out.printf("거스름돈 %d원,식권 구매 완료!",change);
								System.out.println();
							}else {
								System.out.println("잔돈 부족...");
							}
						}else {
							if(change<0) {
								System.out.println("입금 금액이 부족합니다");
								continue;
							}else if(tickets - buyticket<0) {
								System.out.println("식권이 부족합니다");
								continue;
							}
						}
					}else if(choice == 2) {
						break;
					}
				}
			}
		}


		
	}
}
