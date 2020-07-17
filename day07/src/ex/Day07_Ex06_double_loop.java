package ex;

public class Day07_Ex06_double_loop {
	public static void main(String[] args) {
		
		for(int i=1; i<10;i++) {
			System.out.printf("x%d : ",i);
			for(int j = 2; j<10;j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		// 문제) 구구단 출력
		/*
		 * === 2단 ===
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 * === 3단 ===
		 * 3 X 1 = 3
		 * 3 X 2 = 6
		 * ...
		 * ...
		 */


	}
}
