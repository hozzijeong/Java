package ex;

import java.util.Scanner;

abstract class Shape{
	int x,y;
	public void move() {}
	abstract void draw();
	public String turn() {
		return "1.�� 2.�� 3.�� 4.�簢�� 5.�ﰢ��";
	}
}

class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("���� ��´�.");
	}
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}
class TriAngle extends Shape{
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}



public class Ex02 {
	public static void main(String[] args) {
		Shape [] shape = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���ϴ� �۾��� �����ϼ���");
			int sel = scan.nextInt();
			shape[sel-1].draw();
			
		}
		
	}
}
