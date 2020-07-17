package ex;

import java.util.Scanner;

abstract class Shape{
	int x,y;
	public void move() {}
	abstract void draw();
	public String turn() {
		return "1.점 2.선 3.원 4.사각형 5.삼각형";
	}
}

class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("점을 찍는다.");
	}
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}
class TriAngle extends Shape{
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}



public class Ex02 {
	public static void main(String[] args) {
		Shape [] shape = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 작업을 선택하세요");
			int sel = scan.nextInt();
			shape[sel-1].draw();
			
		}
		
	}
}
