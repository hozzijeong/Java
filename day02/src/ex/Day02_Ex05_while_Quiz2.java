package ex;

public class Day02_Ex05_while_Quiz2 {
	public static void main(String[] args) {
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		int i = 1;
		int sum = 0;
		while (i<=5) {
			sum = sum+i;
			i = i+1;			
		}
		System.out.println(sum);
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		int j = 1;
		while (j <=10) {
			if (j<3 || j>=7) {
				System.out.println(j);
			}
			j = j+1;
		}
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		int k = 1;
		int sum1 = 0;
		while (k <=10) {
			if (k<3||k>=7) {
				sum1 = sum1+k;
			}
			k = k+1;
		}
		System.out.println(sum1);
		
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		int l = 1;
		int cnt = 0;
			while (l <=10) {
				if (l<3||l>=7) {
					cnt = cnt+1;
				}
				l = l+1;
			}
		System.out.println(cnt);
		


	}
}
