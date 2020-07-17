package ex;

public class Day02_Ex05_while_Quiz2 {
	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int sum = 0;
		while (i<=5) {
			sum = sum+i;
			i = i+1;			
		}
		System.out.println(sum);
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		int j = 1;
		while (j <=10) {
			if (j<3 || j>=7) {
				System.out.println(j);
			}
			j = j+1;
		}
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		int k = 1;
		int sum1 = 0;
		while (k <=10) {
			if (k<3||k>=7) {
				sum1 = sum1+k;
			}
			k = k+1;
		}
		System.out.println(sum1);
		
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		int l = 1;
		int cnt = 0;
			while (l <=10) {
				if (l<3||l>=7) {
					cnt = cnt+1;
				}
				l = l+1;
			}
		System.out.println(cnt);
		


	}
}
