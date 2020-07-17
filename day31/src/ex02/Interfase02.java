package ex02;

class Point {
	int x, y;
	public void move() {}
}

class ShapeOfObject{
//	final�� ��� ���� ����� �տ� �ٿ��ָ� �� ������ ���α׷����� ���� �����ų �� ����. ==> ���
//	final�� �޼ҵ� ����� �տ� �ٿ��ָ� �� �޼ҵ�� override ��ų �� ����.
//	final�� Ŭ���� ����� �տ� �ٿ��ָ� �� Ŭ������ ��ӽ�ų �� ����.
	public static final double PI = 3.141592;
	public void draw() {}
	public void erase() {}
}
//�������̽��� ������ ����(static) ��� ����(���)�� �߻� �޼ҵ�θ� ������ Ŭ������ Ư���� �����̴�.

interface Draw{
	public static final double PI = 3.141592;
//	�������̽��� ���� ����� ���� ������ �����ϸ� public static final�� �����Ϸ��� �ڵ����� �ٿ��ش�.

	int LIMIT = 1000;
	public abstract void movel(); // �߻� �޼���
//  �������̽��� �޼ҵ� ����� ���� ������ �����ϸ� public abstract�� �����Ϸ��� �ڵ����� �ٿ��ش�. 
	void erase();
//	�������̽��� {}����� ������ �Ϲ� �޼ҵ带 �����ϸ� ������ �߻��ȴ�.
//	void erase() { } // ���� �߻�
}

interface Graphic{
	void resize();
	void rotate();
}

//  Ŭ������ �������̽��� ��ӹ��� �� ���� ������ ������ �߻��Ѵ�. 
//  �������̽��� '�����Ѵ�' �� ������ ������ ����

//  �������̽��� Ŭ������ ��ӹ��� �� ���� ������ ������ �߻��Ѵ�.

//  Ŭ������ Ŭ�������� �������̽��� �������̽� ���� ��ӽ�ų �� �ִ�.
// Ŭ������ ���� ����� ������� ������ �������̽��� ���� ����� ����Ѵ�.

interface Graphics extends Draw,Graphic{
	//�ƹ��� ������ ������ �ʴ� �������̽��� ǥ��(marker) �������̽��� �θ���.
}

// Line Ŭ������ point Ŭ������ ��ӹް�, Draw,Graphic �������̽��� �����޾� �����.
// Ŭ�������� �������̽��� ��ӹ޴� ȿ���� ������ extends ���� ������� �ʰ� implements���� ����ϸ�
// ����̶� �θ��� �ʰ� �����̶� �θ���. 

class Line extends Point implements Draw,Graphic{
	@Override
	public void resize() {
		
	}
	@Override
	public void rotate() {
		
	}
	@Override
	public void erase() {
		
	}
	@Override
	public void movel() {
		
	}
}


public class Interfase02 {
	public static void main(String[] args) {
//		static ��� ������ ��ü�� �������� �ʰ� Ŭ���� �̸���"."�� �� �ٷ� ���� ����.
		System.out.println(ShapeOfObject.PI);
//		final ����(���)�� ���� ���α׷����� �����Ϸ� �����Ƿ� ������ �߻��ȴ�.
//		ShapeOfObject.PI = 1.23456;
		
		System.out.println(Math.PI);
		
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
	
	
	
	}
}
