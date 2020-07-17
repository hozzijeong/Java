package ex03_array_hard;
/*
 * # 당첨복권 1셋트
 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
 * 2. 랜덤으로 5개의 복권을 생성하되,
 *    당첨복권은 한 개만 생성되도록 설정한다.
 */

import java.util.Random;

public class Repeat_Ex_array_hard20_get_lotto {
	public static void main(String[] args) {
		//맨 첫번째 줄을 무조건 당첨 줄로 설정 한 뒤,
		// 그 다음에는 절대로 당첨이 나올 수없게 설정하고
		// 순서를 섞으면 됨.
		Random ran = new Random();
		
		int [][] lottoSet = new int[5][7];
		for(int i=0; i<lottoSet.length;i++) {
			int count = 0;
			for(int j=0; j<lottoSet[i].length;j++) {
				if(i ==0) {
					for(int k=0; k<3;k++) {
						lottoSet[i][k] = 3;
					}
				}else {
					int r = ran.nextInt(2);
					
					if(r ==0) {
						lottoSet[i][j] = 0;
					}else {
						lottoSet[i][j] = 3;
						count+=1;
						if(count ==3) {
							lottoSet[i][j] = 0;
						}
					}
				}
			}
		}
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<7;j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<100; i++) {
			int r = ran.nextInt(lottoSet.length);
			
			int[] temp = lottoSet[0];
			lottoSet[0] = lottoSet[r];
			lottoSet[r] = temp;
		}
		System.out.println();
		System.out.println("=========");
		for(int i=0; i<5;i++) {
			for(int j=0; j<7;j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
