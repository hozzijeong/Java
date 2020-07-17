package ex01;

import java.util.Scanner;

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


public class Repeat_Ex20_count_subway {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이용할 정거장 수 입력:");
		int station = scan.nextInt();
		
		int charge = 0;
		if(station>0 && station<=5) {
			charge =500;
		
		}
		else if(station>5 && station<=10) {
			charge=600;
		}
		else {
			if(station%2 ==1) {
				charge = (station - 10)/2 *50;
				charge +=650;
			}else {
				charge = (station -10)/2 *50;
				charge +=600;
			}
		}
		System.out.println("요금은"+charge+"원입니다.");
	}
}
