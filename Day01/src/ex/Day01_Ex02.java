package ex;

public class Day01_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10%3);
		
		// ��������� �߿��� �Ҽ������� ��Ÿ���� ������
		// ������ �Ǽ� ���� �����ؾ��Ѵ�.
		System.out.println(10/3.0);
		
		// ���������ڸ� ���� Ȱ��
		// ���� + ���� = ���� 
		System.out.println("hello"+ "it's me");
		// ���� + ���� = ���� (�ݴ뵵 �Ȱ���)
		System.out.println("10"+3);
		
		//�տ��� ���ߵ���, ���� +���� = ���ڰ� �Ǳ⶧����
		// 1) "���ϱ� =" + 10+3 = "���ϱ� = 10"+3
		// 2) "���ϱ� = 10" + 3 = "���ϱ� = 10 + 3"
		// 3) "���ϱ� = 103"�� �ǹ���.
		System.out.println("���ϱ� = "+ 10+3);
		//���� ���ڳ��� ���� ����� �ϰ� �ʹ� �ϸ� ()�� �̿�
		System.out.println("���ϱ� = "+ (10+3));
	}

}
