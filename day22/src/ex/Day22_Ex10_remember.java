package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */
class Ex09{
	int[] front = {1,1,2,2,3,3,4,4,5,5};
	int[] back = new int[10];
	
	int cnt=0;
}

public class Day22_Ex10_remember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09 e = new Ex09();
		for(int i=0; i<100; i++	) {
			int r = ran.nextInt(e.front.length);
			
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		
		
		while(true) {
			for(int i=0; i<e.back.length;i++) {
				System.out.print(e.front[i] +" ");
			}
			System.out.println();
			for(int i=0; i<e.back.length;i++) {
				System.out.print(e.back[i] +" ");
			}
			System.out.println();
			System.out.println("[����1]�Է�(0~9):");
			int idx1 = scan.nextInt();
			System.out.println("[����2]�Է�(0~9):");
			int idx2 = scan.nextInt();
			
			if(idx1<0 || idx1 >9 || idx2 <0 || idx2 >9 || idx1 == idx2) continue;
			
			if(e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
				e.cnt +=1;
			}
			if(e.cnt ==5) {
				break;
			}
			
			
		}
	}
}
