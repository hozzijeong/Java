package ex;
class Base{
	String name;
	public void say() {
		System.out.println(name+"님 안녕하세요.");
	}
}

class Sub extends Base{
	int age;
	@Override
	public void say() {
		System.out.println(name+"님은"+age+"살 입니다.");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Base base = new Base();
		base.name = "홍길동";
		base.say();
		
		Sub sub = new Sub();
		sub.name = "임꺽정";
		sub.age = 42;
		sub.say();
		
		//Base b = new Sub(); ---> (O)
		//Base b = new Base(); ---> (O)
		//Sub s = new Base(); ---> (X)
		
		Base b = sub;
		b.say();
//		자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입한다. ==>  downcasting
//		자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입하면 에러가 발생되는데 이 때, casting을 하면
//		대입은 가능하다. ==> 문법적인 에러는 발생되지 않지만 실행시켰을 때 ClassCastException가 발생된다.
//		Sub s = (Sub) base;
		
//		instanceof 연산자를 사용하면 객체끼리 정상적으로 형변환이 가능한가 여부를 판단할 수 있다.

/*
 * 		Base b2 = new Sub(); --->(O)
 * 		Sub  s2 = new  Sub(); --->(O)
 * 		둘 다 가능하다.
 * 		하지만 b2가 접근 할 수 있는 인자는 Base에 있는 데이터와 메서드에만 접근이 가능하고,
 * 		s2가 접근 할 수 있는 인자는 Base+Sub에 있는 모든 데이터와 메서드에 접근이 가능하다.
 * 
 * 		만약에 Base가 abstract된 클래스라 할지라도, 선언 자체는 가능하며, new 만 되지 않는다.
 * 		따라서, Base가 abstract라고 한다면, new Sub 를 통해 Base의 데이터에 접근 하면 된다. 
 * 
 * 
 * 
 */
		
		
		
		
		
		
		if(base instanceof Sub) {
			Sub s = (Sub)  base;
		}else {
			System.out.println("base 객체를 sub클래스 타입으로 형변환 시킬 수 없습니다.");
		}
		
		
		try {
			Sub s = (Sub) base;
		}catch(ClassCastException e) {
			System.out.println("base 객체를 sub클래스 타입으로 형변환 시킬 수 없습니다.");
		}
	}
}
