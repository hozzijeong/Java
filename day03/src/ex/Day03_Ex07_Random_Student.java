package ex;
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

import java.util.Random;
import java.util.Scanner;

public class Day03_Ex07_Random_Student {
	public static void main(String[] args) {
		Random ran = new Random();
		int i = 1; // �л� ��ȣ
		double avg = 0; // �л� ���
		int suc = 0; // �հ��ڼ�
		int max = 0; // �л��� ����
		int maxi = 0;// 1�� ��ȣ
		while (i<=10) {
			int scor = ran.nextInt(100)+1;
			System.out.printf("%d��° �л� ����:%d \n",i,scor);
			
			if (scor>=60) {
				suc+=1;
			}
			avg += scor;
			if (scor > max) {
				max = scor;
				maxi = i;
			}
			i +=1;
		}
		System.out.println("������ ����:"+avg+ " ���:"+(avg/10.0));
		System.out.println("�հ��ڼ�: "+suc);
		System.out.println("1���л� ��ȣ:"+maxi+" ����"+max);
	}

}
