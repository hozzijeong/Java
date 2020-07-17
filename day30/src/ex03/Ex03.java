package ex03;

class Person{
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void p() {
		System.out.println(name+":"+age);
	}

	
	void love() {}
	
}

class Student extends Person{
	int score;
	Person p = new Person("고길동", 46);
	@Override
	void love() {
		System.out.println("우정");
		System.out.println(p.name+":"+p.age);
	}
}

class Doctor extends Person{
	int salaray;
	
	@Override
	void love() {
		System.out.println("동료애");
	}
}



public class Ex03 {
	public static void main(String[] args) {
		
		Student st = new Student();
		Doctor dc = new Doctor();
		st.p();
		st.love();
		dc.love();
		
	}
}
