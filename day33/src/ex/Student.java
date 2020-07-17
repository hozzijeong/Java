package ex;

public class Student {
	private int num;
	private String id;
	private String name;
	public void print() {
		System.out.println(num+" "+id+" "+name);
	} // 학생의 정보를 나타내주는 메소드 print
	
	public Student(int num, String id, String name) {
		this.num = num;
		this.id = id;
		this.name = name;
	} // 생성자로 Student 클래스 재정의
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
