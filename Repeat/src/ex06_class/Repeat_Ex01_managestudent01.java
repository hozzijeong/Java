package ex06_class;



class Ex01{
	int [] arr = {87,100,11,72,92};
}

public class Repeat_Ex01_managestudent01 {
	public static void main(String[] args) {
		
		Ex01 e = new Ex01();
		
		
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int sum = 0; 
		for (int i=0; i<e.arr.length;i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		
		sum = 0;
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i] %4 ==0) {
				sum += e.arr[i];
			}
		}
		System.out.println(sum);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int cnt = 0;
		
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i]%4 ==0) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		cnt = 0;
		for(int i=0; i<e.arr.length;i++) {
			if(e.arr[i] %2 ==0) {
				cnt+=1;
			}
		}
		
		System.out.println(cnt);


	}
}
