package ex01;

import java.util.Random;
import java.util.Scanner;

public class Repeat_Ex11_Randomcoin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		
		int coin = ran.nextInt(2);

		System.out.println("�Է� [�ո�(0) �޸�(1)]");
		int answer = scan.nextInt();
		
		if(answer == coin) {
			System.out.println("����!");
		}
		if(answer != coin) {
			System.out.println("��");
		}
	}
}
