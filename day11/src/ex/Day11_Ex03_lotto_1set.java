package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # ��÷���� 1��Ʈ
 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
 * 2. �������� 5���� ������ �����ϵ�,
 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
 */
public class Day11_Ex03_lotto_1set {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// ������ 0�Ǵ� 1�� �߻� ���Ѽ� 0�̳����� 0 1�̳����� 3���� ġȯ. 
		// ù�ٿ� ������ ��÷�� �ɰ���.  
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
		
		//��÷���� = lottoSet[i]�� ��� ����. shuffle. 
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
