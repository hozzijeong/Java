package ex03;

/*
 * [1] 오버로딩
 * . 메서드 이름절약
 * . println()
 * [2] 오버라이딩
 * . 상속관계에서만 적용가능
 * . 부모의 형태는 유지(선언부 일치)
 */

// ctrl + t 해당 클래스의 족보를 알 수 있음. 
class Toy /*extends Object*/{
	String name;
	int price;
	// toString()메서드 : 재정의를 기다리는 메서드
	
	// 어노테이션 : 문법적 규칙을 잘 준수했는지 체크해주는 주석
	@Override
	public String toString() {
		return name + ": " + price + "원";
	}
	
}

class AA{
	void a() 							// 선언부
	{
		System.out.println("부모꺼");		// 구현부
	}
	// 오버로딩
	void a(int num) 
	{
		System.out.println("오버라이딩 아님");
	}
}

class BB extends AA{

	// 오버라이딩 : 부모의 메서드의 선언부는 동일하게 하되, 구현부를 달리하는 것
	@Override
	void a() {
		System.out.println("내꺼");
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
		t.name = "곰인형";
		t.price = 3800;
		System.out.println(t/*.toString()*/);
		System.out.println(t.toString());
		
		BB b = new BB();
		b.a();
	}
}













