package ex01;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class Repeat_Ex23_reciept_land2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		int i = 0;
		int total = 0;
		int bul = 0;
		int shi = 0;
		int coke = 0;
		while(i<5)	{
			System.out.println("메뉴 선택");
			int menu = scan.nextInt();
			if(menu == 1) {
				bul+=1;
				total+=price1;
			}else if(menu ==2) {
				shi +=1;
				total +=price2;
			}else if(menu ==3) {
				coke +=1;
				total +=price3;
			}			
			i+=1;
		}
		System.out.println("총 금액:"+total);
		System.out.println("현금 입력:");
		int cash = scan.nextInt();
		if(cash >=total ) {
			System.out.println("===롯데리아 영수증===");
			System.out.println("1. 불고기 버거:" +bul+"개");
			System.out.println("2. 새우 버거:" +shi+"개");
			System.out.println("3. 콜라:" +coke+"개");
			System.out.println("총 금액" +total);
			System.out.println("잔돈" +(cash - total));
		}else {
			System.out.println("현금이 부족합니다.");
		}
	}
}
