package ex;
class Ex08{
	
	int test1(int []arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
	int test2(int []arr) {
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				total+=arr[i];
			}
		}
		return total;
	}
	int test3(int []arr) {
		int cnt = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		return cnt;
	}
	int test4(int []arr) {
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				cnt+=1;
			}
		}
		return cnt;
	}
	
	
}
public class Day23_Ex14_method_student_manage {
	public static void main(String[] args) {
		Ex08 e = new Ex08();
		
		int[] arr= {87,100,11,72,92};
		// ���� 1) ��ü �� ����
		// ���� 1) 362
		int a = e.test1(arr);
		System.out.println(a);
		
		// ���� 2) 4�� ����� �� ����
		// ���� 2) 264
		a = e.test2(arr);
		System.out.println(a);
		
		// ���� 3) 4�� ����� ���� ����
		// ���� 3) 3
		a = e.test3(arr);
		System.out.println(a);
		// ���� 4) ¦���� ���� ����
		// ���� 4) 3
		System.out.println(e.test4(arr));


	}
}
