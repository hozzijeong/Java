package ex;

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


public class Day05_Ex02_find_minimum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
			
		int i = 0;
		while (i<4) {
			int r = ran.nextInt(4);
			if(check[r] == 0) {
				check[r] =1;
				arr[i] = r+1;
				i+=1;
			}
		}
		
		i = 0;
		int cnt = 1;
		
		while(i<4) {
			for(int j =0; j<4; j++) {
				System.out.print(arr[j]+ " ");
			}
			System.out.println();
			System.out.println("�Է�: ");
			int idx = scan.nextInt();
			
			if(arr[idx] == cnt) {
				arr[idx] = 9;
				cnt+=1;
				i+=1;
			}
			
		}
		
		
	}
}

