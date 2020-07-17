package test;

class Person{
	
	String name;
	int jumin;
	
	// 메서드
	void print() {}
	
	// 생성자
	// .타입 없음
	// .메서드명 = 클래스명
	// .new 할때에만 호출가능
	// .생성자 오버로딩 적용가능
	// .생성자는 멤버(인스턴스)변수의 초기화를 위해 사용
	// .기본생성자는 자동생성 :	클래스명(){}
	//  단, 사용자가 생성자를 추가로 만들 경우, 기본 생성자는 사라진다.
	
	/*
	 * 본래 기본생성자는 자동생성되지만,
	 * 개발자 편의로 생성자를 추가로 만들경우,
	 * 그 자동생성하던 역할을 하지 X
	 */
	Person(){} // 기본 생성자
	
	Person(String name, int jumin){
		this.name = name;
		this.jumin = jumin;
	}
}

/*
 * # 접근 제어자
 * . public : 프로젝트 전체 에서 사용 가능
 * */

public class Ex02 {
	public static void main(String[] args) {
		
		//               생성자(constructor) : "생성할 때(new) 호출되는 자"라고 해서 생성자
		Person hgd = new Person();
		// hgd.name = "홍길동";
		// hgd.jumin = 1234;
		
		System.out.println(hgd.name);
		
		
	}
}
