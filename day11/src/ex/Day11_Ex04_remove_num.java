package ex;

// 위 배열에서 중복안된숫자를 제거하시요 
// 1) {1,2,1,2}
// 2) {4,4}
// 3) {1,1,1,1}
public class Day11_Ex04_remove_num {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		int[] temp = new int[5];
		int count = 0;
		for(int i=0; i<test1.length;i++) {
			temp[count] = test1[i]; // test의 값을 일단 temp에 저장함. 
			int check = 0; // 비교 했을때 해당 인덱스가 중복된 숫자가 존재하면 check = 1로 변경
			for (int j=0; j<test1.length;j++) {
				if(i!=j && temp[count] == test1[j]) {
					check = 1; // test1중에서 i 즉, temp[count]와 같지 않으면서 배열 안에 같은 수가 존재하면 check = 1로 변형)
				}
			}
			if(check ==1) {
				count+=1; // check= 1이되면 count한개를 추가해 줌으로써, temp에 기존에 있던 숫자를 저장(통과)하고, test1의 다음 배열의 숫자를 검사함.
				// 만약에 check 가 그대로 0이라면 test의 해당 숫자는 건너뛰게 되고, i++가 된 숫자가 다시 그 자리를 대신하게됨.
				// 결국에 temp의 방 크기는 5이지만, 출력을 count만큼만 해주면 보이는것은 똑같음. 
			}
		}
	
		
	}
}
