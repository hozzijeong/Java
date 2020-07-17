package ex;
/*
 * # OMRī�� : Ŭ���� + ����
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

class Ex06{
	int []answer = {1,3,4,2,5};
	int [] hgd = new int [5];
	
	int cnt = 0;
	int score = 0;
}
public class Day22_Ex07_class_OMR {
	public static void main(String[] args) {
		Random ran = new Random();
		
		Ex06 e = new Ex06();
		
		for(int i=0; i<5; i++) {
			int r = ran.nextInt(5)+1;
			e.hgd[i] = r;
		}
		System.out.print("����ǥ { ");
		for(int i=0; i<e.answer.length;i++) {
			if(e.answer[i] == e.hgd[i]) {
				System.out.print("O ");
				e.cnt +=1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("}");

		e.score = e.cnt*20;
		
		System.out.println("���� : "+ e.score);
		
		
	}
}
