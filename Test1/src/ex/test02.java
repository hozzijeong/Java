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
			 * 중요한 것은 중복 횟수가 몇개냐? 
			 * 1. 일단 중복되는 숫자들의 순수한 개수를 세야 한다.
			 * 		1. 숫자가 중복인지부터 알아낸다.
			 * 		2. 중복된 숫자들을 따로 요소 하나씩 해서 빼놓는다. 
			 * 2. 그런다음에 몇개가 얼마나 중복되는지 return 한다. 
			 */
		
			int idx = 0;
			/*
			 * 1. 1 ~ 배열에서 가장 큰 숫자 중에서 arr[i]와 값이 같은 것들을 ele_cnt++ 한다.
			 * 2. ele_cnt의 값이 2 이상인 것들은 값이 중복된 것들이다. 그 값들의 개수들만 임시배열 temp에 저장한뒤 idx를 늘린다.
			 * 3. 중복되는 숫자들이 존재하지 않으면 temp의 모든 값은 0이 되고 그게 아니라면 적어도 2이상의 값을 가진다.
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
			 * temp의 값들중 0이 아닌 값들의 숫자를 센다 -> 최종적으로 return할 arr의 배열 길이를 구하는 것이다. 
			 */
			
			int count = 0;
			for(int i=0; i<size; i++) {
				if(temp[i] != 0) {
					count++;
				}
			}
			/*
			 * 정답을 return 할 배열 answer를 만들고, count의 값에 따라 answer에 값을 집어 넣는다.
			 * count == 0 이라는 것은 중복되는 숫자가 없다는 의미로 -1을 return 해준다.
			 * 
			 * count 의 값이 0이 아니라는 것은 중복되는 숫자가 존재한다는 의미이다.
			 * 따라서, 새로운 배열의 길이를 count만큼 선언해주고, temp에서 0이 아닌 숫자들을 answer 에 넣어준다.
			 * 그리고 answer를 리턴해준다.
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

