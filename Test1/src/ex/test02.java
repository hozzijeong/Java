package ex;

public class test02 {
	
	public static void main(String[] args) {
		int[] arr = {100,1,2,3,1,47,100,3,2,5,4,1,66,2,3,5,2};	
		Solution sol = new Solution();
		for(int i=0; i<sol.solution(arr).length; i++) {			
			System.out.print(sol.solution(arr)[i]);
		}
	}
}


class Solution{	
	public int[] solution(int[] arr) {
		boolean total_check = false;
		boolean element_check = true;
		boolean length_check = true;		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 100) {
				element_check = false;
			}
		}		
		if(arr.length>100) {
			length_check = false;
		}		
		if(element_check && length_check) {
			total_check = true;
		}
		
		if(total_check) {	
			sort(arr);
			int size = arr.length;
			int max = arr[size-1];
			int [] temp = new int[size];
			
			/*
			 * �߿��� ���� �ߺ� Ƚ���� ���? 
			 * 1. �ϴ� �ߺ��Ǵ� ���ڵ��� ������ ������ ���� �Ѵ�.
			 * 		1. ���ڰ� �ߺ��������� �˾Ƴ���.
			 * 		2. �ߺ��� ���ڵ��� ���� ��� �ϳ��� �ؼ� �����´�. 
			 * 2. �׷������� ��� �󸶳� �ߺ��Ǵ��� return �Ѵ�. 
			 */
		
			int idx = 0;
			/*
			 * 1. 1 ~ �迭���� ���� ū ���� �߿��� arr[i]�� ���� ���� �͵��� ele_cnt++ �Ѵ�.
			 * 2. ele_cnt�� ���� 2 �̻��� �͵��� ���� �ߺ��� �͵��̴�. �� ������ �����鸸 �ӽù迭 temp�� �����ѵ� idx�� �ø���.
			 * 3. �ߺ��Ǵ� ���ڵ��� �������� ������ temp�� ��� ���� 0�� �ǰ� �װ� �ƴ϶�� ��� 2�̻��� ���� ������.
			 */
			for(int j=1; j<=max; j++) {
				int ele_cnt = 0;
				int check = -1;
				for(int i=0; i<size; i++) {
					if(arr[i] == j) {
						ele_cnt++;
					}
				}
				if(ele_cnt>1) {
					temp[idx] = ele_cnt;
					idx++;
				}
			}
			/*
			 * temp�� ������ 0�� �ƴ� ������ ���ڸ� ���� -> ���������� return�� arr�� �迭 ���̸� ���ϴ� ���̴�. 
			 */
			
			int count = 0;
			for(int i=0; i<size; i++) {
				if(temp[i] != 0) {
					count++;
				}
			}
			/*
			 * ������ return �� �迭 answer�� �����, count�� ���� ���� answer�� ���� ���� �ִ´�.
			 * count == 0 �̶�� ���� �ߺ��Ǵ� ���ڰ� ���ٴ� �ǹ̷� -1�� return ���ش�.
			 * 
			 * count �� ���� 0�� �ƴ϶�� ���� �ߺ��Ǵ� ���ڰ� �����Ѵٴ� �ǹ��̴�.
			 * ����, ���ο� �迭�� ���̸� count��ŭ �������ְ�, temp���� 0�� �ƴ� ���ڵ��� answer �� �־��ش�.
			 * �׸��� answer�� �������ش�.
			 */
			
			int[] answer;			
			if(count == 0) {
				answer = new int[1];
				answer[0] = -1;
			}else {
				answer = new int[count];
				int answer_cnt = 0;
				for(int i=0; i<size; i++) {
					if(temp[i] != 0) {
						answer[answer_cnt] = temp[i];
						answer_cnt++;
					}
				}
			}
			return answer;
		}
		return arr;
	}	
	public void sort(int[] arr) {
		int i=0; 
		while(true) {
			if( i == arr.length) {
				break;
			}
			int j=0; 
			while(i>j) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			
			i++;
		}
	}
	
}

