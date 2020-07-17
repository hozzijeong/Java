package ex02;

import java.util.Date;

/*
 * # VO(Value Object) : 한 건의 데이터와 데이터를 처리할 메소드가 정의된 클래스. DTO(Data Transfer Object), bean
 * # bean : 자바로 작업하기 위한 최소의 작업 단위로 처리할 데이터를 기억할 기억 장소.
 * 			(멤버 변수, 필드)와 기억 장소에 데이터를 입출력 할 수 있는 getters & setters 메소드로만 구성된 클래스를 말한다.
 */

public class Person {
	public static int count;
	private int no;
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;
	
	public Person() {
		this("무명새",true,"없음");
	}
	public Person(String name, boolean gender, String memo) {
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
