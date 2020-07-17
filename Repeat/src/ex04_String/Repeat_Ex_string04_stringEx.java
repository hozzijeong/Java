package ex04_String;

public class Repeat_Ex_string04_stringEx {
	public static void main(String[] args) {

		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];

		/*
		 * 1. 문자를 split을 이용해서 나누고
		 * 2. 각각의 배열 주소를 정수로 만든 뒤 arr에 값을 저장
		 * 3. arr의 합 출력
		 */
		
		String[] strArr = str.split("/");

		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			sum+=arr[i];
			
		}
		System.out.println(" 총합: "+sum);
		
		System.out.println("========================");
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		/*
		 * 1. 정수들을 일단 문자열로 바꾼뒤, text에 추가할 때 "/"를 같이 추가
		 */
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0; i<scores.length;i++) {
			if(i!= scores.length-1) {
				text += scores[i] + "" +"/";
			}else {
				text +=scores[i];
			}
		}
		System.out.println(text);


	}
}
