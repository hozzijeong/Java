package ex02;

public class PersinTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.toString());
		
		Person p2 = new Person("고길동", true, "쌍문동 거주");
		System.out.println(p2.getName());
		
		Person p3 = new Person("둘리", false, "아기공룡");
		
		System.out.println(p3.getName());
		System.out.println(p2.count);
		p.count = 5;
		System.out.println(p3.count);
	}
}
