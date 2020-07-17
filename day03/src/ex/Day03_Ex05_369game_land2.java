package ex;
/*
 * # 369게임[2단계]
 * 1258~1316(18...못풀음...)
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */


public class Day03_Ex05_369game_land2 {
	public static void main(String[] args) {
		int n = 1;
		while (n<=50) {
			int x = n/10; // n을 10으로 나눴을때의 몫
			int y = n%10; // n을 10으로 나눴을때의 나머지
			int cnt = 0;
			
			if (x != 0 && x%3 ==0) { // n>=10 이면서 %3 했을때의 나머지가 0, 즉 30대 자리수
				cnt +=1;
			}
			if (y != 0 && y%3 ==0) {// 10의 배수를 제외한 1의자리수 중 3의 배수를 골라냄.
				cnt+=1;
			}
			if (cnt ==2) {
				System.out.println("짝짝");
			}else if(cnt == 1) {
				System.out.println("짝");
			}else {
				System.out.println(n);
			}
			n +=1;
		}
	}
}
