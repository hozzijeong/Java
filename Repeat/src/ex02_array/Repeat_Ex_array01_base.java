package ex02_array;
/*
 * # �迭(array)
 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
 * 2. ����
 * 		int num = 10;
 * 		int[] arr = new int[���� ����];
 * 		int arr[] = new int[���� ����];
 * 3. �ε���(index)
 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
 * 4. �ּ� ����
 */


public class Repeat_Ex_array01_base {
	public static void main(String[] args) {
		int[] arr = new int[5];
				
		System.out.println("==========");
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		
		for(int i=0; i<5; i++) {
			arr[i] = (i+1)*10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		// ����2) 4�� ����� ���
		// ����2) 20 40
		for(int i=0; i<5;i++) {
			if(arr[i] %4 ==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("==========");
		// ����3) 4�� ����� �� ���
		// ����3) 60
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("==========");
		
		// ����4) 4�� ����� ���� ���
		// ����4) 2
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		
		System.out.println(cnt);
		System.out.println("==========");
		// ����5) ¦���� ���� ���
		// ����5) 5
		cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%2==0) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		


	}
}
