package ex;
/*
 * # ���� ���
 * . ���� ������ �̸� ���
 */


public class Day09_Ex03_print_grade {
	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};

		for(int i=0; i<name.length;i++) {
			
			int maxSco = score[i];
			int maxIdx = i;
			
			for(int j=i; j<score.length;j++) {
				if(maxSco<score[j]) {
					maxSco = score[j];
					maxIdx = j;
				}
			}
			
			int temp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = temp;
			
			String strTemp = name[i];
			name[i] = name[maxIdx];
			name[maxIdx] = strTemp;
		}
		
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i]+"\t");
			
		}
		System.out.println();
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
		
	}
}
