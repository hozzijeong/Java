package ex;

public class Ex {
	public static void main(String[] args) {
		
		// ����(Exception) ó��
		// java.lang.ArithmeticException: / by zero
		// System.out.println(10 / 0);

		int x = 10;
		int y = 0;
		
		if(y == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println(x / y);
		}
		
		//-----------------------------------------------------
		
		try {
			// ������ �߻��� ������ �ִ� �ڵ�
			System.out.println(x / y);
		}catch(ArithmeticException e) {
			// ������ �߻����� �� ������ �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e) {
			System.out.println("��� ������ ó�����ݴϴ�.");
		}
		
	}
}
