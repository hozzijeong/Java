package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권 1셋트
 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
 * 2. 랜덤으로 5개의 복권을 생성하되,
 *    당첨복권은 한 개만 생성되도록 설정한다.
 */
public class Day11_Ex03_lotto_1set {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 랜덤을 0또는 1을 발생 시켜서 0이나오면 0 1이나오면 3으로 치환. 
		// 첫줄에 무조건 당첨을 걸게함.  
		int[][] lottoSet = new int[5][7];
				
		for(int i=0; i<lottoSet.length;i++) {
			int check = 0;
			for(int j=0; j<lottoSet[i].length;j++) {
				int r = ran.nextInt(2);
				if(i==0) {
					for(int k=1;k<4;k++)
						lottoSet[i][k] = 3;
				}else {		
					if(r == 0) {
						lottoSet[i][j] = 0;
					}else if(r == 1) {
						lottoSet[i][j] = 3;
						check+=1;
						if(check ==3) {
							lottoSet[i][j] = 0;
							check = 0;
						}
					}
				}
//				/System.out.print(lottoSet[i][j]+" ");
			}
			System.out.println();
		}
		
		//당첨복권 = lottoSet[i]를 계속 섞음. shuffle. 
		for(int i=0; i<1000;i++) {
             int rNum = ran.nextInt(5);
             
             int[] temp = lottoSet[0];
             lottoSet[0] = lottoSet[rNum];
             lottoSet[rNum] = temp;
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
