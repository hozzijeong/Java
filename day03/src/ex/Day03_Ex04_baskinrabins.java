package ex;
/*
 * # ����Ų���31
 * 1232~1256(24��)
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

public class Day03_Ex04_baskinrabins {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
//		while (br<=31) {						
//			System.out.println("p1 ���� �Է�(1~3)");
//			turn = turn +1;
//			p1 = scan.nextInt();
//			br = br+p1;
//			System.out.printf("%d��: p1(%d) br(%d)\n",turn,p1,br);
//			if (br>=32) {
//				System.out.println("�¸���:p2");
//				System.out.println("���� ����");
//			}
//			System.out.println("p2 ���� �Է�(1~3)");
//			turn = turn +1;
//			p2 = scan.nextInt();
//			br = br+p2;
//			System.out.printf("%d��: p2(%d) br(%d)\n",turn,p2,br);
//			if (br>=32) {
//				System.out.println("�¸���:p1");
//				System.out.println("���� ����");
//			}
//			
//		}
		boolean run = true;
		
		while(run) {
			
			if (turn %2 == 0) {
				System.out.println("[p1]���� 1~3�Է�:");
				p1 = scan.nextInt();
				br +=p1;
				turn +=1;
			}else if(turn %2 == 1) {
				System.out.println("[p2]���� 1~3�Է�:");
				p2 = scan.nextInt();
				br +=p2;
				turn +=1;
			}
			System.out.println("br:"+br);

			if(br>=32) {
				if(turn%2 == 0) {
					System.out.println("[p1]�¸�");
				}else if (turn%2 ==1) {
					System.out.println("[p2]�¸�");
				}
				run = false;
				System.out.println("���� ����");
			}
		}
	}
}
