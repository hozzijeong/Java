package ex01;
/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */


public class Repeat_Ex27_369games_land2 {
	public static void main(String[] args) {
		int i = 1;
		
	
		while(i<=50) {
			int cnt = 0;
			int num1 = i/10;
			int num2 = i%10;
			if(num1 == 3) {
				cnt+=1;
			}
			if(num2 == 3 || num2 ==6 || num2 ==9) {
				cnt+=1;
			}
			
			if(cnt ==2) {
				System.out.print("짝짝 ");
			}else if(cnt ==1) {
				System.out.print("짝 ");
			}else {
				System.out.print(i+" ");
			}
			i+=1;
		}
	}
}
