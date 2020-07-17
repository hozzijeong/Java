package ex;

import java.util.Random;

class ranNum{
	int num;
}
public class Day25_Ex01_class_array_nonsamenum {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		
		ranNum[] arr = new ranNum[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = new ranNum();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			int r = ran.nextInt(5)+1;
			int check = 1;
			arr[i].num = r;
			
			for(int j=0; j<i; j++) {
				if(arr[i].num == arr[j].num	) {
					check = -1;
				}
			}
			
			if(check == -1) {
				i-=1;
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i].num+" ");
		}
		System.out.println();
		
		
		
	}
}
