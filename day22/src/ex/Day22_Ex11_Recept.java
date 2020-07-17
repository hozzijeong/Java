package ex;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */
class Ex10{
	String name = "";
	
	int[] arPrice = {2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거","불고기 버거","감자튀김","콜라"};
	
	int[] arCount = new int [4];
	
	int  total = 0;
}

public class Day22_Ex11_Recept {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex10 e = new Ex10();
		
		while(true) {
			System.out.println("☆★☆★☆★☆★맘스터치☆★☆★☆★☆★");
			for(int i=0; i<e.arCount.length;i++) {
				System.out.println(e.arMenu+ ":" +e.arPrice[i]);
			}
		
		
		}
		
	}
}
