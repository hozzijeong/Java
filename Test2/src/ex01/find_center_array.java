package ex01;

import java.util.Scanner;

//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
//(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
// ��)  123 ==> 2
// ��)  1234 ==> ¦���� �ڸ��̴�
// ��)  1 ==> 1
// ��)  1234567 ==> 4

// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
// ��) ==> 123 ==> 3 ==> arr[] = new int[3];


public class find_center_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int num = scan.nextInt();
		
		// ���� ��ü�� �Է¹ް� �� ������ ����� �Է¹����� ��.
		int cnt = 0;
		int temp = num;
		while(temp>0) {
			temp = temp/10;
			cnt++;
		}
		
		int[] arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = num%10;
			System.out.println("arr["+i+"]"+arr[i]);
			num = num/10;
		
		}
		
		if(cnt%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			int cen = cnt/2;
			System.out.println(arr[cen]);
		}
		
		
		
	}
}
