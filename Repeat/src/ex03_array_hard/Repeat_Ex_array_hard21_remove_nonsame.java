package ex03_array_hard;

public class Repeat_Ex_array_hard21_remove_nonsame {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};
		int [] temp = new int[test1.length];
		
		int count = 0;
		for(int i=0; i<test1.length;i++) {
			temp[count] = test1[i];
			//temp의 count번째 값에 test1의 i번째 값을 대입.
			int check = 0;
			for(int n=0; n<5; n++) {
				if(i!=n && temp[count]==test1[n]) {
					check =1;
				}
				// i!=n 즉, 두 숫자의 순서가 같지 않을때, 
				// temp[count] = test1[i] 값과 같고, i ==n이면 두 값이 같을 수 밖에 없기 때문!
				// check 1을 함으로써, 서로 값이 같은 것들만 남겨놓고, 나중에 출력도, count의 길이만큼만 하면 됨.
			}
			if (check ==1) {
				count +=1;
			}
		}
		
		for(int i=0; i<count;i++) {
			System.out.print(temp[i]+" ");
		}
		
		
	}
}
