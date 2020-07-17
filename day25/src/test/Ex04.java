package test;

import javax.swing.JOptionPane;

/*
 * # 캡슐화(encapsulation), 은닉성(c언어)
 * . 변수에는 private
 * . 메서드에는 public
 * . 값의 유효성 검사
 * . 캡슐화의 포멧은 변수 선언과, get,set 메서드를 만들어 주는 것이 하나의 포멧임
 */

class Student{
	private int age;		// 10 ~ 15세
	
	// 단축키 : alt + shift + s, r
	public void setAge(int age) {
		if(10 <= age && age <= 15) {
			this.age = age;
		}else {
			// System.out.println("[메세지]잘못입력했어요!!!");
			JOptionPane.showMessageDialog(null, "나이 입력 오류!!!");
		}
	}
	
	public int getAge() {
		return age;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Student hgd = new Student();

		// The field Student.age is not visible
		// hgd.age = 100;
		
		hgd.setAge(12);
		int age = hgd.getAge();
		System.out.println(age);
		
		
	}
}
