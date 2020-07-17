package ex03_array_hard;

public class Repeat_Ex_array_hard10_print_grade {
	public static void main(String[] args) {
		String[] name = {"È«±æµ¿", "±è¿µ", "ÀÚ¹ÙÅ·", "¹Îº´Ã¶", "¸Þ°¡¸Ç"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		
		int idx = 0;
		while(idx<score.length) {
			int max = score[idx];
			int maxIdx = idx;
			
			for(int i=idx; i<score.length;i++) {
				if(score[i] > max) {
					max = score[i];
					maxIdx = i;
				}
			}
			
			int temp = score[idx];
			score[idx] = score[maxIdx];
			score[maxIdx] = temp;
			
			String str = name[idx];
			name[idx] = name[maxIdx];
			name[maxIdx] = str;
			
			idx+=1;
		}

		for (int i=0; i<5;i++) {
			System.out.print(name[i] +"\t");
		}
		System.out.println();
		for (int i=0; i<5;i++) {
			System.out.print(score[i] +"\t");
		}
		
	}
}
