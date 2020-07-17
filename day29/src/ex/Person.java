package ex;

import java.util.Date;

/*
 * # VO(Value Object) : 한 건의 데이터와 데이터를 처리할 메소드가 정의된 클래스. DTO(Data Transfer Object), bean
 * # bean : 자바로 작업하기 위한 최소의 작업 단위로 처리할 데이터를 기억할 기억 장소.
 * 			(멤버 변수, 필드)와 기억 장소에 데이터를 입출력 할 수 있는 getters & setters 메소드로만 구성된 클래스를 말한다.
 */

public class Person {
	/*
	 * # 멤버 변수 정의
	 * . 멤버 변수를 선언할 때 "="를 사용해 초기화 시킬 수 있다.
	 * . 초기화 시키지 않으면 숫자는 0, boolean은 false, 클래스로 만든 모든 객체는 null로 자동 초기화 된다.
	 * . 멤버 변수의 종류는 정적(static)멤버 변수와 인스턴스 멤버 변수가 있다.
	 * . 정적 멤버 변수는 현재 클래스로 생성한 모든 객체에서 공유해서 사용한다.
	 * . 인스턴스 멤버 변수는 현재 클래스로 생성한 모든 객체에서 독립된 기억 공간을 가진다.
	 * . 정적 멤버 변수는 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 접근할 수 있다.
	 */

	// [접근 권한 지정자] [static] 자료형 변수명 [= 초기치];
	public static int count; 	// 정적 멤버 변수
	private int no; 			// 객체가 생성될 때 마다 자동 증가

	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate; 	// 객체가 생성되는 순간의 날짜와 시간 자동 초기화

	/*
	 * # 생성자
	 * . 생성자 메소드(이하 생성자)를 정의한다.
	 * . 생성자 이름은 반드시 클래스 이름과 같아야 한다.
	 * . 생성자는 객체가 생성되는 순간 자동으로 실행되며 멤버 변수를 초기화 시킬 목적으로 사용한다.
	 * . 생성자를 정의하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본 생성자를 자동으로 만든다.
	 * . 단, 생성자를 정의하면 기본 생성자는 자동으로 만들어 지지 않는다.
	 * . 생성자는 리턴 타입을 가지지 않고(void도 사용하지 않는다.) return도 사용하지 않는다.
	 */
	public Person() {
		// name = "무명씨";
		// gender = true;
		// memo = "없음";
		// 현재 클래스의 다른 생성자 Person(String name, boolean gender, String memo)를 호출한다.


		this("무명씨",true,"없음");
	}
	
	public Person(String name, boolean gender, String memo) {
		// super()와 this()는 반드시 생성자의 첫 문장에 써야한다. 동시에 사용할 수 없다.
		// super()를 생략하면 자바 컴파일러가 자동으로 붙여준다.
		// super(); // 부모 클래스의 생성자를 의미한다.
		// this(); 	// 현재 클래스의 다른 생성자를 의미한다.
		// super 	// 부모 클래스를 의미한다.
		// this 	// 현재 클래스를 의미한다.

		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
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
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
	
}
