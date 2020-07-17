package text02;
/*
 * # 생성자(constructor)
 * 1. 생성자는 반드시 클래스 이름과 같아야 한다.
 * 2. 생성자는 new 클래스명(); 이때 호출된다.
 * 3. 생성자는 멤버변수를 초기화 시킬 목적으로 사용한다.
 * 4. 생성자를 정의하지 않으면, 자바 컴파일러가 자동으로 기본 생성자를 만든다.
 * 5. 기본생성자란, 매개변수에 아무것도 없는 생성자를 의미한다.
 * 6. 생성자를 정의하면 기본 생성자는 자동으로 만들어지지 않는다.
 * 7. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.(메서드와의 차이점)
 */

class Fruit{
	String name;
	int price;
	Fruit(){}
	Fruit(String name, int price){
		this.name = name;
		this.price = price	;
		
	}
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void printData() {
		System.out.println(name + "("+price+"원)");
	}
}
public class Day25_02_constructor {
	public static void main(String[] args) {
		/*
         * # 생성자 메서드
         * 인스턴스 변수를 초기화할 때 별도의 메서드를 만들지 않고,
         * 생성자 메서드를 제공한다.
         */
		
		Fruit apple = new Fruit();
		// .으로 접근해 멤버변수 초기화	
		apple.name = "사과";
		apple.price = 1000;
		
		// 메서드를 만들어 멤버변수 초기화	
		apple.setData("사과", 1000);
		apple.printData();

		
		//생성자를 활용해 멤버변수 초기화	
		Fruit banana = new Fruit("바나나",3700);
		banana.printData();
	}
}
