package ex02_array;

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


import java.util.Random;

public class Repeat_Ex_array07_gugudan_land2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			int idx = ran.nextInt(5);
			arr[i] = idx;
			if(check[idx] == 0) {
				check[idx] = 1;
			}else {
				i-=1;
			}
		}
		
		
		
				for(int j=0;j<5;j++) {
			System.out.print(arr[j] +" ");
		}
		
	}
}
