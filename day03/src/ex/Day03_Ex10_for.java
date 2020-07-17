package ex;

public class Day03_Ex10_for {
	public static void main(String[] args) {
		int x = 1;
		while (x<=5) {
			System.out.println(x);
			x+=1;
		}
		System.out.println();
		for ( int y = 1; y<=5;y++) {
			System.out.println(y);
		}
		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5

		// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		System.out.println("===========================");
		for (int y = 1; y<=10; y++) {
			if(y>=5 && y<=9) {
				System.out.println(y);
			}
		}
		
		System.out.println("===========================");
		
		// 문제 3) 1부터 10까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for (int k = 10; k>=1; k--) {
			if(k<=6 && k>=3) {
				System.out.println(k);
			}
		}
		System.out.println("===========================");
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for(int i = 1; i<=10;i++) {
			if(i<3 || i>=7) {
				System.out.println(i);
			}
		}
		


	}
}
