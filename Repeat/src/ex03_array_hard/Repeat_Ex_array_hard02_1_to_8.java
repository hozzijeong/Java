package ex03_array_hard;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�̵Ǹ� ������ ����ȴ�.
 */


public class Repeat_Ex_array_hard02_1_to_8 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int[] check = new int[9];
		
		for(int i=0; i<9; i++) {
			int data = ran.nextInt(9)+1;
			arr[i] = data;
			if(check[data-1] ==0) {
				check[data-1] = 1;
			}else {
				i-=1;
			}
		}
		
		int cnt = 0;
		int minidx = 0;
		
		while(cnt<9) {			
			
			for(int i=0; i<9;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			int min = 10;
			
			for(int i=0; i<9;i++) {
				if(arr[i] <min) {// min = �ٽ� 10�� �µ�, arr[i]�� �ּڰ��� 0��... 0�� ������ ���� ū��?
					if(arr[i] !=0) {
						min = arr[i]; // min = 1;
						minidx = i; // 1�� idx�� ����
					}else {
						arr[i] = 0;
					}
				}
			}
			System.out.println("�Է�[1~9]:");
			int idx = scan.nextInt();
			
			if((idx-1) == minidx) { // �Է��� ���ڰ� 1�� idx�� ��ġ�� ������
				arr[minidx] = 0; // 1�� idx�� ���� 0�� ��. 
				cnt+=1; // cnt = 1;
			}
			
		}
	}
}
