package ex;
class Ex05{
	
	int test1(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		return cnt;
		
	}
	int[] test2(int[] arr) {
		int cnt = test1(arr);
		int [] temp = new int [cnt];
		
		int j=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				temp[j] = arr[i];
				j+=1;
			}
		}
		return temp;
		
	}
	
	void print(int[]arr) {
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
}
public class Day23_Ex10_method03_land3 {
	public static void main(String[] args) {
		Ex05 e = new Ex05();
		
		int [] arr = {87,12,21,56,100};
		
		int cnt = e.test1(arr);
		System.out.println("cnt = " + cnt);
		
		
		int[] temp = e.test2(arr);
		e.print(temp);
	}
}
