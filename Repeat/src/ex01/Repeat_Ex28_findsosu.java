package ex01;
/*
 * # �Ҽ�ã��[1�ܰ�]
 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
 * 2. ��) 2, 3, 5, 7, 11, 13, ..
 * 3. ��Ʈ
 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
 * 2) �������� 0�� ������ ī��Ʈ�� ����.
 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
 * 
 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
 */

import java.util.Scanner;

public class Repeat_Ex28_findsosu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int num = scan.nextInt();		
		int i =1;
		int cnt = 0;
		while(i <=num) {
			if(num%i == 0) {
				cnt+=1;
			}
			i+=1;
		}
		
		
		if(cnt ==2) {
			System.out.printf("%d(��)�� �Ҽ�",num);
		}else {
			System.out.printf("%d(��)�� �Ҽ��� �ƴϴ�",num);
		}
		
	}
}
