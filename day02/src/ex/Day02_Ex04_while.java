package ex;

public class Day02_Ex04_while {
	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		// ����1) 5, 6, 7, 8, 9
		int i = 1;
		while (i<=10) {
			if (i>=5 && i<=9) {
				System.out.println(i);
			}
			i = i+1;
		}
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3
		int j = 10;
		while (j >=1) {
			if (j>=3 && j<=6) {
				System.out.println(j);
			}
			j = j -1;
		}
		
		// ����3) 1~10���� �ݺ��� ¦���� ���
		// ����3) 2, 4, 6, 8, 10
		int k = 1;
		while (k <=10) {
			if (k%2 == 0) {
				System.out.println(k);
			}
			k = k+1 ;
		}

		
	}
}
