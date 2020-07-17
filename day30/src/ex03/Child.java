package ex03;
class Parent{
	protected String name;
	protected boolean gender;
	
	public Parent() {
		this("����",true);
		System.out.println("�θ� Ŭ������ �⺻ ������ ����.");
	}
	public Parent(String name,boolean gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return name+"("+(gender ? "��":"��")+")";
	}
	
	
}
public class Child extends Parent {

	private int age;
	private String nickName;
	public Child() {
		super();
		System.out.println("�ڽ� Ŭ������ �⺻ ������ ����");
	}
	
	public Child(String name, boolean gender,int age,String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	public String toString() {
		return name+"("+(gender ? "��": "��")+")"+age+","+nickName;
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println("p:"+p);
		Parent p2 = new Parent("������", false);
		System.out.println("p2: "+p2);
		System.out.println("===================");
		
		Child c = new Child();
		System.out.println("c: "+c);
	
		Child c2 = new Child("�Ӳ���", true, 42, "����");
		System.out.println("c2: "+c2);
	
	}
}
