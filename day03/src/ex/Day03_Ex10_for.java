package ex;

public class Day03_Ex10_for {
	public static void main(String[] args) {
		int x = 1;
		while (x<=5) {
			System.out.println(x);
			x+=1;
		}
		System.out.println();
		for ( int y = 1; y<=5;y++) {
			System.out.println(y);
		}
		// ���� 1) 1���� 5���� ���
		// ���� 1) 1, 2, 3, 4, 5

		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		System.out.println("===========================");
		for (int y = 1; y<=10; y++) {
			if(y>=5 && y<=9) {
				System.out.println(y);
			}
		}
		
		System.out.println("===========================");
		
		// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
		// ���� 3) 6, 5, 4, 3
		for (int k = 10; k>=1; k--) {
			if(k<=6 && k>=3) {
				System.out.println(k);
			}
		}
		System.out.println("===========================");
		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		for(int i = 1; i<=10;i++) {
			if(i<3 || i>=7) {
				System.out.println(i);
			}
		}
		


	}
}
