package ex02;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution_1 {
	public int[] solution(int N, int[] votes) {
		int answer[] = null;
		// votes는 최종적으로 받은 투표 수고 N은 최대 숫자를 의미한다. 
		int candidate[] = new int[N];
		
		for(int i=0; i<votes.length; i++) {
			candidate[votes[i]-1]++;
		}
		
		int max = candidate[0];
		int max_cnt = 0;
		for(int i=0; i<N; i++) {
			if(max<candidate[i]) {
				max = candidate[i];
			}
		}
			
		for(int i=0; i<N; i++) {
			if(max == candidate[i]) {
				max_cnt++;
				
			}
		}
		answer = new int[max_cnt];
		int k=0;
		
		for(int i=0; i<N; i++) {
			if(max == candidate[i]) {
				answer[k] = i+1;
				k++;
			}
		}
		
		
		for(int i=0; i<max_cnt; i++) {
			for(int j=0; j<max_cnt; j++) {
				if(i!=j && answer[i] < answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
			
		return answer;
	}
}



public class cospro_1_5 {
	public static void main(String[] args) {
		Solution_1 sol = new Solution_1();
		int N1 = 5;
		int[] votes1 = { 1, 5, 4, 3, 2, 5, 2, 5, 5, 4 };
		int[] ret1 = sol.solution(N1, votes1);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");

		int N2 = 4;
		int[] votes2 = { 1, 3, 2, 3, 2 };
		int[] ret2 = sol.solution(N2, votes2);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");


	}
}
