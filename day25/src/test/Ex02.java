package test;

class Person{
	
	String name;
	int jumin;
	
	// �޼���
	void print() {}
	
	// ������
	// .Ÿ�� ����
	// .�޼���� = Ŭ������
	// .new �Ҷ����� ȣ�Ⱑ��
	// .������ �����ε� ���밡��
	// .�����ڴ� ���(�ν��Ͻ�)������ �ʱ�ȭ�� ���� ���
	// .�⺻�����ڴ� �ڵ����� :	Ŭ������(){}
	//  ��, ����ڰ� �����ڸ� �߰��� ���� ���, �⺻ �����ڴ� �������.
	
	/*
	 * ���� �⺻�����ڴ� �ڵ�����������,
	 * ������ ���Ƿ� �����ڸ� �߰��� ������,
	 * �� �ڵ������ϴ� ������ ���� X
	 */
	Person(){} // �⺻ ������
	
	Person(String name, int jumin){
		this.name = name;
		this.jumin = jumin;
	}
}

/*
 * # ���� ������
 * . public : ������Ʈ ��ü ���� ��� ����
 * */

public class Ex02 {
	public static void main(String[] args) {
		
		//               ������(constructor) : "������ ��(new) ȣ��Ǵ� ��"��� �ؼ� ������
		Person hgd = new Person();
		// hgd.name = "ȫ�浿";
		// hgd.jumin = 1234;
		
		System.out.println(hgd.name);
		
		
	}
}
