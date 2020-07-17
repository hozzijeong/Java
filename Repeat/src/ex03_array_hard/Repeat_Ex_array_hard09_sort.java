package ex03_array_hard;
/*
 * # 정렬하기
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class Repeat_Ex_array_hard09_sort {
	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 7};
		
		int idx = 0;
		
		while(idx<6) {
			int max = score[idx];
			int maxIdx = idx;
			for(int i=idx; i<score.length;i++) {
				if(score[i] > max) {
					max = score[i];
					maxIdx = i;
				}
			}
			
			int temp = score[idx];
			score[idx] = score[maxIdx];
			score[maxIdx] = temp;
			
			idx+=1;

		}
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] +" ");
		}
	}
}
