package ex;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 2146~2159(13분)
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

public class Day02_Ex07_recepte_ver2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		int i = 1;
		int sum = 0;
		int bul = 0;
		int shr = 0;
		int coke = 0;
		while (i <=5) {
			System.out.println("메뉴 선택:");
			int menu = scan.nextInt();
			if (menu == 1) {
				sum = sum+price1;
				bul = bul+1;
			}
			if (menu == 2) {
				sum = sum+price2;
				shr = shr+1;
			}
			if (menu == 3) {
				sum = sum+price3;
				coke = coke+1;
			}
			i = i+1;
		}
		System.out.printf("총 금액:%d\n",sum);
		System.out.println("현금 입력:");
		int cash = scan.nextInt();
		if(cash >=sum) {			
			
			System.out.println("===롯데리아 영수증===");
			System.out.println("1.불고기 버거 : " + bul + "개");
			System.out.println("2.새우    버거 : " + shr + "개");
			System.out.println("3.콜         라 : " + coke + "개");
			System.out.println("4.총   금   액 : "+ sum);
			System.out.println("5.잔         돈:"+(cash - sum));
		}else {
			System.out.println("현금 부족");
		}

	}
}
