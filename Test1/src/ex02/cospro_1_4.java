package ex02;
/*
 * #����4
	������������ ���ĵǾ��ִ� �� �迭 arrA, arrB�� �ϳ��� �迭�� ��ġ�� �մϴ�. 
	��, ��ģ ���� �迭�� ������������ ���ĵǾ� �־�� �մϴ�.
	
	���� ��� arrA = [-2, 3, 5, 9], arrB = [0, 1, 5]�� ��� 
	�� �迭�� ������������ ���ĵ� �ϳ��� �迭�� ��ġ�� [-2, 0, 1, 3, 5, 5, 9]�� �˴ϴ�.
	
	������������ ���ĵ� �� �迭 arrA�� arrB�� �־����� ��, 
	�� �迭�� ������������ ���ĵ� �ϳ��� �迭�� ���ļ� return �ϵ���
	 solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.
	
	---
	##### �Ű����� ����
	������������ ���ĵ� �� �迭 arrA�� arrB�� solution �޼ҵ��� �Ű������� �־����ϴ�.
	
	* arrA�� ���̴� 1 �̻� 200,000 �����Դϴ�.
	* arrA�� ���Ҵ� -1,000,000 �̻� 1,000,000 ������ �����Դϴ�.
	* arrB�� ���̴� 1 �̻� 200,000 �����Դϴ�.
	* arrB�� ���Ҵ� -1,000,000 �̻� 1,000,000 ������ �����Դϴ�.
	
	---
	##### return �� ����
	�� �迭 arrA, arrB�� ������������ ���ĵ� �ϳ��� �迭�� ���ļ� return ���ּ���.


 */

class Solution {
	  public int[] solution(int[] arrA, int[] arrB) {
		// Write code here.
		  int answer[] = null;

		  int size = arrA.length + arrB.length;
		  answer = new int[size];
		  
		  int j =0;
		  for(int i=0; i<size; i++) {
			  if(i<arrA.length) {
				  answer[i] = arrA[i];
			  }else {
				  answer[i] = arrB[j];
				  j++;
			  }
		  }
		  
		  
		  for(int i=0; i<size; i++) {
			  for(int k=0; k<size; k++) {
				  if( i!= k && answer[i] < answer[k]) {
					  int temp = answer[i];
					  answer[i] = answer[k];
					  answer[k] = temp;
				  }
			  }
		  }
		  
		  
		
		  return answer;
	}
}


public class cospro_1_4 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);
 
        // Press Run button to receive output.
        System.out.print("[ ");
        for(int i=0; i<ret.length; i++) {
        	System.out.print(ret[i]+" ");        	
        }
        System.out.print("]");


	}

}
