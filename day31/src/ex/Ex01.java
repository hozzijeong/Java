package ex;
/*
 * . 싱글턴 패턴을 사용하는 클래스는 상속을 받지 않는다.
 * . 상속을 받을 이유가 없다. 그저 getInstance()로 접근을 할 수 있기 때문
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
