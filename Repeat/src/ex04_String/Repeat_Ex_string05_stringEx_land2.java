package ex04_String;

public class Repeat_Ex_string05_stringEx_land2 {
	public static void main(String[] args) {
	// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		/*
		 * 1. ","split으로 김철수 /87 과 같이 나눈다. 이름을 각각 저장한다
		 */
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];

		String[] arrStr = str.split(",");
		// 1)split으로 한번 나눠주고,
		for(int i=0; i<arrStr.length;i++) {
			String[] info = arrStr[i].split("/");
			//2) 다시한번 문자열 배열을 만들어서 split으로 한번 더 나눠줌.
			name[i] = info[0];
			score[i]= Integer.parseInt(info[1]);
		}
		for(int i=0; i<3; i++) {
			System.out.println(name[i]+":"+score[i]+"점");
		}

	}
}
