package ex01;
/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */

import java.util.Scanner;

public class Repeat_Ex07_ride_ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű �Է�:");
		int height = scan.nextInt();
		
		if(height>=120) {
			System.out.println("���̱ⱸ �̿밡��");
		}
		if (height<120) {
			System.out.println("�θ�԰� �Բ� �Դ°�?(yes:1 no:2");
			int parent = scan.nextInt();
			if(parent ==1) {
				System.out.println("���̱ⱸ �̿� ����");
			}
			if(parent ==2) {
				System.out.println("���̱ⱸ �̿� �Ұ�");
			}
		}
	}
}
