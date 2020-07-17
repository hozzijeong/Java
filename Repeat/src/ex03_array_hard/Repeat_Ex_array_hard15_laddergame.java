package ex03_array_hard;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class Repeat_Ex_array_hard15_laddergame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		for(int i=0;i<ladder.length;i++) {
			for(int j=0; j<ladder[i].length;j++) {
				if(ladder[i][j] == 0) {
					System.out.print("��");
				}else if(ladder[i][j] ==1) {
					if(j!=0 && ladder[i][j-1]==1) {
						System.out.print("��");
					}else if(j !=4 && ladder[i][j+1]==1) {
						System.out.print("��");
					}
				}
			}
			System.out.println();
		}
		System.out.println("[0~4]�Է�:");
		x = scan.nextInt();
		for(int i=0;i<ladder.length;i++) {
			if(ladder[y][x] == 0) {
				y+=1;
			}else if(ladder[y][x]==1) {
				if(x!=0 && ladder[y][x-1]==1) {
					x-=1;
				}else if(x!=4 && ladder[y][x+1]==1) {
					x+=1;
				}
				y+=1;
			}
		}
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		

	}
}
