package ex;
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


public class Day04_Ex02_array {
	public static void main(String[] args) {
		int num = 0;
		num = 10;
		System.out.println("num: "+num);
		
		int arr[] = null;
		arr = new int[5];
		System.out.println("arr: "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		int arr1[] = new int[3];
		arr[0] = 10;
		arr[1]= 20;
		arr[2] = 30;
		
		for (int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		int temp[] = {1,2,3};
		for (int i = 0; i<3;i++) {
			System.out.println(temp[i]);
		}
		
		
	}

}
