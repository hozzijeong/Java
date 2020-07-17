package ex03_array_hard;
/*
 * # ��÷���� 1��Ʈ
 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
 * 2. �������� 5���� ������ �����ϵ�,
 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
 */

import java.util.Random;

public class Repeat_Ex_array_hard20_get_lotto {
	public static void main(String[] args) {
		//�� ù��° ���� ������ ��÷ �ٷ� ���� �� ��,
		// �� �������� ����� ��÷�� ���� ������ �����ϰ�
		// ������ ������ ��.
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
