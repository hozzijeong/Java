package ex;
/*
 * # EXIT ����
 * 1. game�迭���� exit������ ���� ���� ��ġ�� �Է��Ѵ�.
 * 2. ������ ���߸� exit������ 1�����Ѵ�.
 * 3. exit������ ���� 16�̵Ǹ� ������ ����ȴ�.
 */

import java.util.Scanner;

public class Day08_Ex04_EXITGAME {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int exit = 10;
		
		int[] game = {11, 15, 10, 14, 12, 13};
		
		while(exit<16) {
			System.out.println("EXIT:"+exit);
			
			for(int i=0; i<6; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
//			int answer = 0;
//			for(int i=0; i<6; i++){
//				if(game[i] == exit){
//					 answer = i;
//				}
//			}
//			
			
			System.out.println("���� �Է�:");
			int num = scan.nextInt();
			
//			if(answer == num) {
//				exit+=1;
//			}
//			
			
			for(int i=0; i<6; i++) {
				if(game[i] == exit) {
					if(num == i) {
						exit+=1;
					}
				}
			}
		}
		
		
		

	}
}
