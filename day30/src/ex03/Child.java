package ex03;
class Parent{
	protected String name;
	protected boolean gender;
	
	public Parent() {
		this("무명씨",true);
		System.out.println("부모 클래스의 기본 생성자 실행.");
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
		return name+"("+(gender ? "남":"여")+")";
	}
	
	
}
public class Child extends Parent {

	private int age;
	private String nickName;
	public Child() {
		super();
		System.out.println("자식 클래스의 기본 생성자 실행");
	}
	
	public Child(String name, boolean gender,int age,String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	public String toString() {
		return name+"("+(gender ? "남": "여")+")"+age+","+nickName;
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println("p:"+p);
		Parent p2 = new Parent("성춘향", false);
		System.out.println("p2: "+p2);
		System.out.println("===================");
		
		Child c = new Child();
		System.out.println("c: "+c);
	
		Child c2 = new Child("임꺽정", true, 42, "도적");
		System.out.println("c2: "+c2);
	
	}
}
