package ex07_method;
/*
 * # OMRī�� : Ŭ���� + �޼���
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

class ScoreMng{
	Random ran = new Random();
	
	int[] omr = {1,4,3,2,2};
	int[] me = new int [5];
	
	int cnt = 0;
	int score = 0;
	
	//1. me ��� �ۼ��ϱ�.
	void makeAnswer() {
		for(int i=0; i<me.length;i++) {
			me[i] = ran.nextInt(4)+1;
		}
	}
	//2. ���� ����ϱ�
	void showAnswer() {
		//omr ī�� ���
		System.out.print("omr = [");
		for(int i=0; i<omr.length;i++) {
			System.out.print(omr[i] +" ");
		}
		System.out.print(" ]");
		System.out.println();
		System.out.print("me = [");
		for(int i=0; i<me.length;i++) {
			System.out.print(me[i] +" ");
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	void checkAnswer() {
		cnt = 0;
		System.out.print("����ǥ = [ ");
		for(int i=0; i<omr.length;i++) {
			if(omr[i] == me[i]) {
				System.out.print("O ");
				cnt+=1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println(" ]");
	
		score = 20*cnt;
		System.out.println("���� = "+score+"��");
	}
	
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
	
}
public class Repeat_Ex04_OMR {
	public static void main(String[] args) {
		ScoreMng sm = new ScoreMng();
		
		sm.run();
	}
}
