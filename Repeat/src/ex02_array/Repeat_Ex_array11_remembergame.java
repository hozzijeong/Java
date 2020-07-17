package ex02_array;

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


public class Repeat_Ex_array11_remembergame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
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
		int k = 0;
		while(k<5) {
			System.out.print("front = { ");
			for(int j=0; j<10; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println("}");
			
			System.out.print("back = { ");
			for(int j=0; j<10; j++) {
				System.out.print(back[j] + " ");
			}
			System.out.println("}");
			System.out.println();
			System.out.println("�Է�1:");
			int num1 = scan.nextInt();
			System.out.println("�Է�2:");
			int num2 = scan.nextInt();
			
			if(front[num1] == front[num2] ) {
				back[num1] = front[num1];
				back[num2] = front[num2];
				k+=1;
			}
			
			
			
		}


	}
}
