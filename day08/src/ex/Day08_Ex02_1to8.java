package ex;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�̵Ǹ� ������ ����ȴ�.
 */
public class Day08_Ex02_1to8 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];	
		
//		int[] check = new int[9];
//		
//		for(int i=0; i<9; i++) {
//			int data = ran.nextInt(9)+1;
//			arr[i] = data;
//			if(check[data-1] ==0) {
//				check[data-1] = 1;
//			}else {
//				i-=1;
//			}
//		}
		
		//����
		for(int i=0 ;i<9;i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<1000;i++) {
			int r = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		
		
		int cnt = 0;
		int num = 1;
		while(cnt<9) {			
			
			for(int i=0; i<9;i++) {
				System.out.print(arr[i] + "\t");
				if(i%3 ==2) {
					System.out.println();
				}
			}
			System.out.println();
			
			System.out.println("�Է�[1~9]:");
			int idx = scan.nextInt();
			
			if(arr[(idx-1)] == num) { 
				arr[idx-1] = 0;
				num+=1;
				cnt+=1; 
			}
			
		}
	}
}
