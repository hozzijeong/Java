package ex;

import java.util.Random;

public class Day18_Ex_racegame {
	public static void main(String[] args) {
		int horse[][] = new int[5][20]; // ����� �迭
		Random ran = new Random();
		int max = 20; // �ִ� ������
		int rank[] = new int[5]; // ������ ������ �ű�� �迭
		
 		int total[] = new int[5]; // ������ ��ġ�� �����ϴ� �迭 
		
		
		
		boolean run = true;
		int count = 1;
		
		
		// �ڵ� ���� ������, ���� ���� ¥��, ����������ִ� ����. 
		
		for (int i = 0; i < 20; i++) {
			int check = 0;
			for (int n = 0; n < 5; n++) {
				if (total[n] >= 19) {
					horse[n][i] = 0;
					// horse�� ��ġ���� 19�� �Ѿ���� ���� 0���� �ٲ���. 
				} else {
					int r = ran.nextInt(4) + 1;
					horse[n][i] = r;
					total[n] = total[n] + horse[n][i];
					if (total[n] >= 19) {
						rank[n] = count++;
						check += 1;
						// n��° ���� ������� ����������, n��° ������ ������ �ű�. 
						// 1���� ���Դٴ� check�� ��. 
						
						if (check >= 2) {
							
							i = 0;
							horse = new int[5][20];
							total = new int[5];
							rank = new int[5];
							count = 1;
							break;
							// ���ÿ� ���� ���� �ִٸ�, �ƿ� �ʱ�ȭ�� �ع���. 
						}
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			// System.out.println(total[i]);
			System.out.println(rank[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 20; n++) {
				System.out.print(horse[i][n]);
			}
			System.out.println();
		}

		int show[][] = new int[5][20];
		int index[] = new int[5];
		run = true;
		count = 0;
		while (run) {
			for (int i = 0; i < 5; i++) {
				for (int n = 0; n < 20; n++) {
					if (show[i][n] == 0) {
						System.out.print("[ ]");
					} else {
						System.out.print("[��]");
					}
				}
				System.out.println("");
			}
			System.out.println("===============");
			for (int n = 0; n < 5; n++) {
				 show[n][index[n]] = 0;
				 index[n] += horse[n][count]; 
				 if(index[n] >= 20) index[n] = 19;
				 show[n][index[n]] = 1;
				 
			}
			
			
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			
			
			count += 1;
			if (count == 20)
				break;
		}

	}
}
