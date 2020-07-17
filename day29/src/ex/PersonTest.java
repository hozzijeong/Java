package ex;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("person : "+person);
		// toString() : 객체에 저장된 내용을 출력한다. 
        // 객체를 출력할 때 toString() 메소드를 붙여주지 않아도 자바 컴파일러가 자동으로 붙여준다.
		System.out.println(person.toString());
	
		Person person2 = new Person("홍길동", true, "의적");
		System.out.println("person2 : "+person2);
		
		Person person3 = new Person("임꺽정",true,"???");
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
