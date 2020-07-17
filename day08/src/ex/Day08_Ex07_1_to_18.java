package ex;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */

public class Day08_Ex07_1_to_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		for(int i=0; i<9;i++) {
			front[i] = i+1;
			back[i] = i+10;
		}
		// ���� ����
		
		for(int i=0; i<1000;i++) {
			int rNum1 = ran.nextInt(9)+1;
			
			int temp1 = front[0];
			front[0] = front[rNum1-1];
			front[rNum1-1] = temp1;
			
			int temp2 = back[0];
			back[0] = back[rNum1-1];
			back[rNum1-1] = temp2;
		}
		
		int num = 1;
		
		while(true) {
			
			System.out.println("[front] ");
			for(int i=0; i<9;i++) {
				System.out.print(front[i] +" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			
			System.out.println("[back]");
			for(int i=0; i<9;i++) {
				System.out.print(back[i] +" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			System.out.println(" ");
			
			System.out.println("�Է�:");
			int data = scan.nextInt();
			
			if(num<=9) {
				if(front[data] == num) {
					front[data] = 0;
					num+=1;
				}
			}else {
				if(data == num) {
					back[data-10] = 0;
					num+=1;
				}
			}
			if(num == 18) {
				break;
			}
			
		}
		
		
	}
}
