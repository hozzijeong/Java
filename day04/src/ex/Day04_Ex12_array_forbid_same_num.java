package ex;

import java.util.Random;

/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */

public class Day04_Ex12_array_forbid_same_num {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			int r = ran.nextInt(5);
			arr[i] = r;
			if(check[r] == 0) {
				check[r] =1;
			}else {
				i-=1;
			}
		}
		for( int i = 0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
