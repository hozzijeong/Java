package ex;
//# �渶 ����
//5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
//�̵��ѰŸ��� ���� 20�̻��̸� ���� 
//��� ��� 
//����) ��! ���õ��� ����ó��
// ���� �̵�ó�� �ϴ°��� �ƴ�. ��, horse[5][20]���� 20�� �� ��ȸ�� �ǹ��ϴ� ���̰�, 
// �� �ȿ��� [i][j] ���, j�� +1~4�� ���ؼ� ���� ���� [i][j]�� ���� 20�� �Ǵ� ���� ã�� ���α׷�. 


import java.util.Random;



public class Day18_Ex01_racegame {
	public static void main(String[] args) {

		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int [5]; 
		
		int count = 1; // ���� ����� Ȯ���� ���� count
		
		for(int i=0;i <20; i++) {
			int check = 0; // ���õ����� ����ó���ϱ� ���� check; 
			for(int j=0; j<5; j++) {
				if(total[j] >=19) {
					horse[j][i] = 0;
				}else {
					int r = ran.nextInt(4)+1; // [i][j]�� �� ������ �� r
					horse[j][i] = r; // horse[j][i]�� r�� ���������ν�, ���� ǥ��
					total[j] += horse[j][i]; // total ���� ���� �̵��Ÿ��� �����ؼ� ����.
					if (total[j] >= 19) {
						rank[j] = count++; // total�� 19�� ���� �������� ��ŷ�� ������� ��ŷ�� �ű� 
						check +=1; // ���� ������ ���� �ִ��� üũ
						if(check >=2) { // ���õ����� ���� ������ �ƿ� �ʱ�ȸ ���Ѽ� ó������ �ٽ� ����. 
							i = 0;
							horse = new int [5][20];
							rank = new int [5];
							total = new int [5];
							count = 1;
							break;
							}
						}
					
					}
				}
			}
//		for(int i=0; i<5; i++) {
//			System.out.printf("%d���� : %d��", i+1,rank[i]);
//			System.out.println();
//		}
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<20; j++) {
//				System.out.print(horse[i][j] +" ");
//			}
//			System.out.println();
//		}
		
		int[][] show = new int [5][20]; // �ܼ�â�� ��Ÿ�� �迭 show
		int [] index = new int [5]; // ������ ��ġ�� ��Ÿ�� �迭 index
		count = 0; // ������ ��ġ�� ��Ÿ�� ���� 0 
		int check = 0;
		while(true) {
			System.out.println("       �ڡڡڡڡڡڡڡڡڡڰ渶���� "+(count+1)+"ȸ���ڡڡڡڡڡڡڡڡڡ�");
			for(int i=0; i<5;i++) {
				for(int j=0; j<20; j++) {
					if(show[i][j] == 0) {
						System.out.print("�� ");
					}else {
						System.out.print("�� ");
					}
				}
				System.out.println();
			}
			
			for(int i=0; i<5; i++) {
				show[i][index[i]] = 0;
				index[i] += horse[i][count];
				if(index[i] >=20) {
					index[i] = 19;
				}
				show[i][index[i]] = 1;
			}
			count +=1;
			
			if(count == 20)	{
				for(int i=0; i<5; i++) {
					System.out.printf("%d���� : %d��", i+1,rank[i]);
					System.out.println();
				}
				break;
			}
			
			
			
		}
		
	}
		
}
