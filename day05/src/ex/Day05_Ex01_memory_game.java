package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ����
 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
 *    back�� ��� ���� ä������ ������ ����ȴ�.
 * ��)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * �Է�1 : 0
 * �Է�2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */

public class Day05_Ex01_memory_game {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		i = 0;
		while(i<5) {
			for(int j =0; j<10; j++) {
				System.out.print(front[i] + " ");
			}
			System.out.println();
			for(int j =0; j<10; j++) {
				System.out.print(back[i] + " ");
			}
			System.out.println("�Է�1:");
			int idx1 = scan.nextInt();
			System.out.println("�Է�2:");
			int idx2 = scan.nextInt();
			
			if(front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				i+=1;
			}
			
			
		}
	

	
	
			
			
		
	}
}
