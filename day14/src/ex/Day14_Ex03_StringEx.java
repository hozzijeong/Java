package ex;

public class Day14_Ex03_StringEx {
	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];

		String[] strArr = str.split("/");
		
		int sum = 0;
		
		for(int i=0; i<strArr.length;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			// 문자열을 숫자로 변경
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println("========================");
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String[] arrtext = new String[scores.length];
		String text = "";
		
		for(int i=0; i<3;i++) {
			arrtext[i] = "";
		}		
		for(int i=0; i<scores.length;i++) {
			if(i<2) {
				arrtext[i] = String.valueOf(scores[i]+"/");
			}else {
				arrtext[i] = String.valueOf(scores[i]);
				// 숫자를 문자열로 변경. 
			}
		}
		
		for(int i=0; i<3;i++)	{
			text += arrtext[i];
		}
		
		System.out.println(text);
		
		
		String text1 = "";
		for(int i=0; i<scores.length;i++) {
			text1 += scores[i]+"";
			if(i != scores.length-1) {
				text1+="/";
			}
		}
		System.out.println(text1);
		
	}
}
