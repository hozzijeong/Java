package ex;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("person : "+person);
		// toString() : ��ü�� ����� ������ ����Ѵ�. 
        // ��ü�� ����� �� toString() �޼ҵ带 �ٿ����� �ʾƵ� �ڹ� �����Ϸ��� �ڵ����� �ٿ��ش�.
		System.out.println(person.toString());
	
		Person person2 = new Person("ȫ�浿", true, "����");
		System.out.println("person2 : "+person2);
		
		Person person3 = new Person("�Ӳ���",true,"???");
		System.out.println("person3 : "+person3);
		
		person.count = 100;
		System.out.println(person2.count);
		
		Person.count = 999;
		System.out.println(person.count);
		System.out.println(person2.count);
		System.out.println(person3.count);
	
		
		System.out.println(person.getMemo());
	
	
	
	
	}
}
