package ex02_array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
 * 4 9 3 9
 * ...
 */


public class Repeat_Ex_array12_find_minimum {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for(int i=0; i<4; i++) {
			int idx= ran.nextInt(4)+1;
			arr[i] = idx;
			if(check[idx-1] == 0) {
				check[idx-1] = 1;
			}else {
				i-=1;
			}
		}
		int m = 0;
		int cnt = 1;
		while(m<4) {
			for(int i=0; i<4; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			System.out.println("�Է�:");
			int num = scan.nextInt();
		
			if(arr[num] == cnt) {
				arr[num] = 9;
				cnt+=1;
				m+=1;
			}
			
		}

	}
}
