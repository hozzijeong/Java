package ex;

public class Day14_Ex05_StringEx_two_demention_land2 {
	public static void main(String[] args) {

		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		String str = "";

		String[] temp = new String[score.length];
		for(int i=0; i<score.length;i++) {
			temp[i] = score[i] +"";
			
			if(i != score.length-1) {
				str +=name[i]+"/"+temp[i] +",";
			}else {
				str += name[i]+"/"+temp[i];
			}
		}
		
		System.out.println(str);
		

	

	}
}
