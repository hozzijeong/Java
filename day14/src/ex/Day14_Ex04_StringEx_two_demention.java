package ex;

public class Day14_Ex04_StringEx_two_demention {
	public static void main(String[] args) {

			// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
			
			String str = "김철수/87,이만수/42,이영희/95";
			
			String[] name = new String[3];
			int[] score = new int[3];
			
			String[] temp = str.split(",");
			// 김철수/81
			// 이만수/42
			// 이영희/95	로 저장이됨. 
			
			
			for(int i=0; i<3;i++) {
				String[] info = temp[i].split("/");
				name[i] = info[0];
				score[i] = Integer.parseInt(info[1]);
			}
			// 어차피 info는 i 가 + 될때마다 계속 생성되기 때문에 순차적으로 김철수/ 87
			// 이만수 / 42  이영희/95가 나타나게 됨. 이것을 다시 "/"로 split하고 그 값을
			// 각각 name 과 score 에 저장함 
			
		

	}
}
