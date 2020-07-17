package ex02_array;
/*
 * # OMRī��
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

import java.util.Random;

public class Repeat_Ex_array04_OMR {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		int cnt = 0;
		
		
		
		System.out.print("����ǥ: { ");
		for(int i=0; i<5; i++) {
			hgd[i] = ran.nextInt(5)+1;
			if(hgd[i] == answer[i]) {
				System.out.print("O" + " ");
				cnt+=1;
			}else {
				System.out.print("X"+" " );
			}
		}
		System.out.println("}");
		System.out.println("����:"+(cnt*20));

	}
}
