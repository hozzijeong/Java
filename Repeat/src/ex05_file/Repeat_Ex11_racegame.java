package ex05_file;

import java.util.Random;

//# �渶 ����
//5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
//�̵��ѰŸ��� ���� 20�̻��̸� ���� 
//��� ��� 
//����) ��! ���õ��� ����ó��


public class Repeat_Ex11_racegame {
	public static void main(String[] args) {
		int horse[][] = new int[5][20];
		
		Random ran = new Random();
		
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];

		int time = 1;
		
		int []horse_idx = new int[5];
		
		for(int i=0; i<5;i++) {
			horse[i][horse_idx[i]] = 2;
		}
		
		while(true) {
			System.out.println("--------------------"+time+"ȸ��--------------------");
			for(int i=0; i<5;i++) {
				for(int j=0; j<max;j++) {
					if(horse[i][j] ==2) {
						System.out.print("�� ");
					}else if(horse[i][j] ==0) {
						System.out.print(j+1 + " ");
					}
				}
				System.out.println();
			}
			for(int i=0; i<5;i++) {
				int r = ran.nextInt(4)+1;
				horse_idx[i] +=r;
			}
			
			for(int i=0;i<5;i++) {
				if(horse_idx[i]>=20) {
					break;
				}
			}
			time+=1;
			
		}

	}
}
