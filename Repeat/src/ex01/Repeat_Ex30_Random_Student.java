package ex01;

import java.util.Random;

/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */


public class Repeat_Ex30_Random_Student {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int total = 0;
		int pass = 0;
		int max = 0;
		int maxSco = 0;
		int i =0;
		while(i<10) {
			int rnum = ran.nextInt(100)+1;
			total +=rnum;
			if(rnum>=60) {
				pass+=1;
			}
			if(rnum>maxSco) {
				maxSco = rnum;
				max = i;
			}
			i+=1;
		}
		
		double avg = (total)/10.0;
		
		System.out.printf("������ ����: %d\n",total);
		System.out.printf("������ ���: %.2f\n",avg);
		System.out.printf("�հ��ڼ�: %d\n",pass);
		System.out.printf("1���л� ��ȣ & ����: %d %d",i,maxSco);
		
		
		
	}
}
