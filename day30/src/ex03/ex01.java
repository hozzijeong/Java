package ex03;
//클래스 4속성 
//1. 은닉성  ==> private default public 접근제어자.
//2. 상속 ==> 클래스간의 부모자식을 설정해서 클래스를 광범위하게 사용가능하다. 
//자바의 모든클래스는 Object 클래스를 상속받은상태서 시작한다. 
//상속의 특징 ==> 1개만 상속할수 있다.
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
		System.out.println("A -> D로 d의 값 접근 " + aa.d);
		bb.d = 10; // B->D로 d의 값 접근 
		System.out.println("B->D로 d의 값 접근"+bb.d);
	}
}
