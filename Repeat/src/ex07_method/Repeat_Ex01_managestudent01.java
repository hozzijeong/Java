package ex07_method;
class Ex01{
	int test1(int [] arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}						
	int test2(int [] arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				total+= arr[i];
			}
		}
		
		return total;
	}
	int test3(int [] arr) {
		int cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				cnt+= 1;
			}
		}
		
		return cnt;}
	
	int test4(int [] arr) {
		int cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				cnt+= 1;
			}
		}
		
		return cnt;}
}
public class Repeat_Ex01_managestudent01 {
	public static void main(String[] args) {
		Ex01 e = new Ex01();
		
		int[] arr = {87,100,11,72,92};
		
		
		// ���� 1) ��ü �� ����
		// ���� 1) 362
		System.out.println(e.test1(arr));
		
		// ���� 2) 4�� ����� �� ����
		// ���� 2) 264
		System.out.println(e.test2(arr));
		
		// ���� 3) 4�� ����� ���� ����
		// ���� 3) 3
		System.out.println(e.test3(arr));
		
		// ���� 4) ¦���� ���� ����
		// ���� 4) 3
		System.out.println(e.test4(arr));


	}
}
