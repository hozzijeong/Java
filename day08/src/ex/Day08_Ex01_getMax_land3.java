package ex;
/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� : 100
 * 
 * 11, 87, 42, 0, 24
 * �Է� : 87
 * 
 * 11, 0, 42, 0, 24
 */
import java.util.Scanner;

public class Day08_Ex01_getMax_land3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
			
			int k = 0;
			while(k<5) {
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i] +" ");
				}
				System.out.println();
				
				int check = 0;
				int max = 0;
				System.out.println("�Է�:");
				int num = scan.nextInt();
				
				for(int i=0; i<5; i++) {
					if(arr[i] >max) {
						max = arr[i];
						check = i;
					}
				}
				if(max == num) {
					arr[check] = 0;
					k+=1;
				}
			}
	}
}
