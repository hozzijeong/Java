package ex02;

public class PersinTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.toString());
		
		Person p2 = new Person("��浿", true, "�ֹ��� ����");
		System.out.println(p2.getName());
		
		Person p3 = new Person("�Ѹ�", false, "�Ʊ����");
		
		System.out.println(p3.getName());
		System.out.println(p2.count);
		p.count = 5;
		System.out.println(p3.count);
	}
}
