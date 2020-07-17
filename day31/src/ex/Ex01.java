package ex;
/*
 * . �̱��� ������ ����ϴ� Ŭ������ ����� ���� �ʴ´�.
 * . ����� ���� ������ ����. ���� getInstance()�� ������ �� �� �ֱ� ����
 */

class A{
	String name;
	int age;
	
	private A() {
		this("a",10);
	}
	private A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private static A a = new A(); 
	public static A getInstance () {return a;}
}

public class Ex01 {	
	public static void main(String[] args) {
		A a = A.getInstance();
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println(a.name+","+a.age);
		System.out.println(a1);
		System.out.println(a2);
		
	}

}
