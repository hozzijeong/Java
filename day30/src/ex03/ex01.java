package ex03;
//Ŭ���� 4�Ӽ� 
//1. ���м�  ==> private default public ����������.
//2. ��� ==> Ŭ�������� �θ��ڽ��� �����ؼ� Ŭ������ �������ϰ� ��밡���ϴ�. 
//�ڹ��� ���Ŭ������ Object Ŭ������ ��ӹ������¼� �����Ѵ�. 
//����� Ư¡ ==> 1���� ����Ҽ� �ִ�.
class D{
	int d = 1;
}

class A extends D {
	static int aaaa=1;
	int a;
}
class B extends A{
	int b;
}
class C {
	A aa = new A();
	int c;
}


public class ex01 {
	public static void main(String[] args) {
		B bb = new B();
		C cc = new C();
		A aa = new A();
		bb.a = 10;
		System.out.println("A -> D�� d�� �� ���� " + aa.d);
		bb.d = 10; // B->D�� d�� �� ���� 
		System.out.println("B->D�� d�� �� ����"+bb.d);
	}
}
