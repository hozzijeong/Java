package ex02;
abstract class A{
	abstract void test1();
	void test2() {}
}
class B extends A{
	void test1() {}
}

interface E{
	public void test3();
}

interface C{
	public void test1();
	public void test2();
}



class D extends A implements C,E{
	public void test1() {}
	public void test2() {}
	public void test3() {}
}

//�������̽�(Interface) Ŭ����
//�������̽��� �߻�Ŭ�������� �� �߻�ȭ�� Ŭ���� (���ΰ���)
//1. ���� ������ ���� �������� �⺻ ���赵.
//2. ����� �߻� �޼��常 ����� ���´�.
//3. �ν��Ͻ��� �����Ҽ� ���� , Ŭ���� �ۼ��� ������ �ٸ�������
//   ���Ǵ� Ŭ����
//4. �̸� ������ ��Ģ�� �°� �����ϵ��� "ǥ��"�� �����ϴµ� ���
//5. ���߻���� �����ϴ�.

public class InterFace {
	public static void main(String[] args) {
		
	}
}
