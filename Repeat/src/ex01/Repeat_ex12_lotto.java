package ex01;

import java.util.Random;

public class Repeat_ex12_lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		int lotto = ran.nextInt(10);
		if(lotto<3) {
		System.out.println("´çÃ·");
		}
		if(lotto>=3) {
			System.out.println("²Î");
		}
	}

}
