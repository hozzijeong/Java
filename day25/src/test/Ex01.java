package test;

/*
 * # �޼��� �����ε�(overloading) vs �޼��� �������̵�
 * 
 * # �޼��� �����ε�(overloading)
 * . �޼��� �̸� ���� ���
 * . �޼����� �̸��� ���������� �ϵ�,
 * . ����1) �Ű�����(parameter)�� ������ �޸� �Ѵ�.
 * . ����2) �Ű�����(parameter)�� ������ �޸� �Ѵ�.
 * . ����3) �Ű�����(parameter)�� ������ �޸� �Ѵ�.
 * . ��ǥ������ System.out.pritln() �޼��尡 �̿� �ش��Ѵ�.
 */
class ScoreMng{
	// ��Ž���� 2, 3, 4���� ������ ����
	void total(int s1, String s2) {}
	void total(String s1, int s2) {}
	void total(int s1, int s2) {}
	// void total(int s2, int s1) {}		// ��������� ������
	void total(int s1, int s2, int s3) {}
	void total(int s1, int s2, int s3, int s4) {}
}

public class Ex01 {
	public static void main(String[] args) {
		
	System.out.println();
		
	}
}
