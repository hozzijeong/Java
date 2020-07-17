package ex;
class Base{
	String name;
	public void say() {
		System.out.println(name+"�� �ȳ��ϼ���.");
	}
}

class Sub extends Base{
	int age;
	@Override
	public void say() {
		System.out.println(name+"����"+age+"�� �Դϴ�.");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Base base = new Base();
		base.name = "ȫ�浿";
		base.say();
		
		Sub sub = new Sub();
		sub.name = "�Ӳ���";
		sub.age = 42;
		sub.say();
		
		//Base b = new Sub(); ---> (O)
		//Base b = new Base(); ---> (O)
		//Sub s = new Base(); ---> (X)
		
		Base b = sub;
		b.say();
//		�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� �����Ѵ�. ==>  downcasting
//		�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� �����ϸ� ������ �߻��Ǵµ� �� ��, casting�� �ϸ�
//		������ �����ϴ�. ==> �������� ������ �߻����� ������ ��������� �� ClassCastException�� �߻��ȴ�.
//		Sub s = (Sub) base;
		
//		instanceof �����ڸ� ����ϸ� ��ü���� ���������� ����ȯ�� �����Ѱ� ���θ� �Ǵ��� �� �ִ�.

/*
 * 		Base b2 = new Sub(); --->(O)
 * 		Sub  s2 = new  Sub(); --->(O)
 * 		�� �� �����ϴ�.
 * 		������ b2�� ���� �� �� �ִ� ���ڴ� Base�� �ִ� �����Ϳ� �޼��忡�� ������ �����ϰ�,
 * 		s2�� ���� �� �� �ִ� ���ڴ� Base+Sub�� �ִ� ��� �����Ϳ� �޼��忡 ������ �����ϴ�.
 * 
 * 		���࿡ Base�� abstract�� Ŭ������ ������, ���� ��ü�� �����ϸ�, new �� ���� �ʴ´�.
 * 		����, Base�� abstract��� �Ѵٸ�, new Sub �� ���� Base�� �����Ϳ� ���� �ϸ� �ȴ�. 
 * 
 * 
 * 
 */
		
		
		
		
		
		
		if(base instanceof Sub) {
			Sub s = (Sub)  base;
		}else {
			System.out.println("base ��ü�� subŬ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");
		}
		
		
		try {
			Sub s = (Sub) base;
		}catch(ClassCastException e) {
			System.out.println("base ��ü�� subŬ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");
		}
	}
}
