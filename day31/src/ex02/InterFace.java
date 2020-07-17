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

//인터페이스(Interface) 클래스
//인터페이스는 추상클래스보다 더 추상화된 클래스 (전부강제)
//1. 실제 구현된 것이 전혀없는 기본 설계도.
//2. 상수와 추상 메서드만 멤버로 갖는다.
//3. 인스턴스를 생성할수 없고 , 클래스 작성에 도움을 줄목적으로
//   사용되는 클래스
//4. 미리 정해진 규칙에 맞게 구현하도록 "표준"을 제시하는데 사용
//5. 다중상속이 가능하다.

public class InterFace {
	public static void main(String[] args) {
		
	}
}
