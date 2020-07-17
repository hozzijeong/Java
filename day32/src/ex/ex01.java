package ex;
class Base{
	String name;
	public void say() {
		System.out.println(name+"님 안녕하세요.");
	}
}

class Sub extends Base	{
	int age;
	@Override
	public void say() {
		System.out.println(name+"님은"+age+"살 입니다.");
	}
}
public interface ex01 {
	 public static void main(String[] args) {
		 Base base = new Base();
		 Sub sub = new Sub();
		 
		 
		 if(sub instanceof Base) {
			Base b = (Base) sub;
			System.out.println(b.name);
		}else {
			System.out.println("base 객체를 sub클래스 타입으로 형변환 x");
		}
		 
		 try {
			 Sub s = (Sub)base;
		 }catch(ClassCastException e) {
			 System.out.println("base 객체를 sub클래스 타입으로 형변환 x");
		 }
	}
}
