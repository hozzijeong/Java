package ex01;
/*
 * # ����Ų���31
 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
 * 3. br�� 31�� ������ ������ ����ȴ�.
 * 4. �¸��ڸ� ����Ѵ�.
 * 
 * ��) 
 * 1�� : p1(2)	br(2)
 * 2�� : p2(1)	br(3)
 * 3�� : p1(3)	br(6)
 * ...
 */

import java.util.Scanner;

public class Repeat_Ex26_baskinlabbins {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int br = 0;
		int turn = 0;
		int cnt = 1;
		boolean run = true;
		
		while(run) {
			System.out.printf("===%d��=== \n",cnt);
			if(turn%2 ==0) {
				System.out.println("[p1]�Է�:");
				int p1 = scan.nextInt();
				br +=p1;
				System.out.printf("p1(%d)  br(%d)\n",p1,br);
				turn +=1;
			}else if(turn%2 ==1) {
				System.out.println("[p2]�Է�");
				int p2 = scan.nextInt();
				br+=p2;
				System.out.printf("p2(%d)  br(%d)\n",p2,br);
				turn+=1;
			}
			if(br>=32) {
				run = false;
			}
			cnt+=1;
		}
		if(turn%2 ==0 && br>=32) {
			System.out.println("[p1]�¸�");
		}else if(turn%2 ==0 && br>=32) {
			System.out.println("[p2]�¸�");
		}
	}
}
