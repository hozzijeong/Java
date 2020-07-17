package ex;
/*
 * # �޼����� ����[2�ܰ�]
 * void print(�Ű�����[parameter]){
 * 		������ ����;
 * } 
 *
 * # �޼����� ���(ȣ��)
 * print(����,�μ�[argument]);
 */
class Ex20{
	void test1(int x, int y) {
		int total = 0;
		for(int i = x; i<=y; i++) {
			total += i;
		}
		System.out.println("total = "+ total);
		System.out.println();
	}
	
	void test2(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println();
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		
		System.out.println("before : "+arr[idx1]+","+arr[idx2]);
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println();
		System.out.println("after : "+arr[idx1]+","+arr[idx2]);
		
	}
}

public class Day23_Ex07_method_2 {
	public static void main(String[] args) {
		Ex20 e = new Ex20();
		
		// ���� 1) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		e.test1(x, y);
		
		// ���� 2) arr�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		
		// ���� 3) arr�迭�� ���޹޾� �ε��� 2���� �Է¹ް�, �ش� ��ġ�� ���� ��ü�ϴ� �޼���
		int idx1 = 1;
		int idx2 = 4;
		
		e.test3(arr, idx1, idx2);


	}
}
