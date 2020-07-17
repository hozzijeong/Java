package ex;

import java.util.ArrayList;

/*
 * # �迭�� �Ѱ�
 * - �迭�� �ѹ� �����ϸ� ���α׷����� �� ũ�⸦ �ٲ� �� ����.
 * 
 * # java.util.ArrayList
 * - ArrayList Ŭ������ �����Ͱ� �ԷµǸ�, �ڵ����� ũ�Ⱑ Ŀ����
 * - �����Ͱ� ���ŵǸ�, �ڵ����� ũ�Ⱑ �۾�����.
 * - �߰��� �����Ͱ� ���ԵǸ�, �����Ͱ� ���Ե� ��ġ���� ��� �����Ͱ� �ڷ� �̵��ǰ�
 * - �߰��� �����Ͱ� ���ŵ� ���� ��ġ���� ��� �����Ͱ� ������ �̵��Ѵ�.
 * 
 * # <E>
 * - ���׸�(generic)�̶� �θ��� ArrayList�� ����� ������ Ÿ����
 *   �ݵ�� Ŭ������ �ۼ��Ѵ�.
 * - �⺻ �ڷ��� �����͸� �����ϴ� ArrayList�� ������ �ϴ� ��쿡��
 *   ���� Ŭ������ ����Ѵ�.
 *   
 *   ArrayList list = new ArrayList();                        // JDK 1.4 ����
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 ����
 *   ArrayList<Integer> list = new ArrayLIst<>();            // JDK 1.7 ����
 */
class myVector{
	int arr[];
	int count = 0;
	
	void add(int a) {
		if(count ==0) {
			arr = new int[1];
		}else if(count>0) {
			int [] temp = arr;
			arr = new int[count +1];
			for(int i=0; i<count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = a;
		count +=1;
	}
	
	int size() {
		return count;
	}
	
	void remove(int idx) {
		int [] temp = arr;
		arr = new int [count -1];
		
		for(int i=0; i<idx; i++) {
			arr[i] = temp[i];
		}
		for(int i = idx; i<count -1; i++) {
			arr[i] = temp[i+1];
		}
		
		count -=1;
	}
}

public class ArrayList01 {
	public static void main(String[] args) {
		int []arr = new int[5];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		list.add(5, 500);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(new Integer(30));
		System.out.println(list);
		
		int count = list.size();
		System.out.println("count = "+ count);
		
		System.out.print("[");
		for(int i=0; i<count; i++) {
			System.out.print(list.get(i));
			if(i!= count -1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.println(list.get(3));
		
		
		
		list.set(3, 5);
		System.out.println(list);
		
		for(int num: list) {
			System.out.println(num);
		}
		
		list.clear();
		System.out.println(list.size());
	
	
	}
}
