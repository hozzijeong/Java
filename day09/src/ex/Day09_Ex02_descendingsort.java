package ex;
/*
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1�����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class Day09_Ex02_descendingsort {
	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 7};
		
		
		int idx =0;	
		while(idx<score.length) {
			int j = 0;
			int max = 0;
			for(int i=idx; i<score.length;i++) {
				if(max<score[i]) {
					max = score[i];
					j = i;
				}
			}
			score[j] = score[idx];
			score[idx] = max;
			idx+=1;
		}
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] +" ");
		}

	}
}
