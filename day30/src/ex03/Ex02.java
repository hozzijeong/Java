package ex03;

/*
 * [1] �����ε�
 * . �޼��� �̸�����
 * . println()
 * [2] �������̵�
 * . ��Ӱ��迡���� ���밡��
 * . �θ��� ���´� ����(����� ��ġ)
 */

// ctrl + t �ش� Ŭ������ ������ �� �� ����. 
class Toy /*extends Object*/{
	String name;
	int price;
	// toString()�޼��� : �����Ǹ� ��ٸ��� �޼���
	
	// ������̼� : ������ ��Ģ�� �� �ؼ��ߴ��� üũ���ִ� �ּ�
	@Override
	public String toString() {
		return name + ": " + price + "��";
	}
	
}

class AA{
	void a() 							// �����
	{
		System.out.println("�θ�");		// ������
	}
	// �����ε�
	void a(int num) 
	{
		System.out.println("�������̵� �ƴ�");
	}
}

class BB extends AA{

	// �������̵� : �θ��� �޼����� ����δ� �����ϰ� �ϵ�, �����θ� �޸��ϴ� ��
	@Override
	void a() {
		System.out.println("����");
	}
	
}


class DD{
	void test() {
		
	}
}

class X extends DD{
	
//	@Override
//	void test(int num) {
//	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Toy t = new Toy();
		t.name = "������";
		t.price = 3800;
		System.out.println(t/*.toString()*/);
		System.out.println(t.toString());
		
		BB b = new BB();
		b.a();
	}
}













