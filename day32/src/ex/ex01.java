package ex;
class Base{
	String name;
	public void say() {
		System.out.println(name+"�� �ȳ��ϼ���.");
	}
}

class Sub extends Base	{
	int age;
	@Override
	public void say() {
		System.out.println(name+"����"+age+"�� �Դϴ�.");
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
			System.out.println("base ��ü�� subŬ���� Ÿ������ ����ȯ x");
		}
		 
		 try {
			 Sub s = (Sub)base;
		 }catch(ClassCastException e) {
			 System.out.println("base ��ü�� subŬ���� Ÿ������ ����ȯ x");
		 }
	}
}
