package ex;
/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원
 * 4) 13,14 : 700원
 * 5) 15,16 : 750원
 * ... 
 */

import java.util.Scanner;

public class Day02_Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정거장 수 입력:");
		int station = scan.nextInt();
		
		int charge = 0;
		
		if (station >=1 && station <=5) {
			charge = 500;
		}else if (station >=6 && station <=10) {
			charge = 600;
		}else {
			if (station %2 == 1) {
				charge = (station-10)/2*50;
				charge = charge + 650;
			}else {
				charge = (station - 10)/2*50;
				charge = charge + 600; 
			}
		}
		System.out.println("요금은 "+charge+"원 입니다.");
	}
}
