package ex03_array_hard;
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
