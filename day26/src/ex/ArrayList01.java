package ex;

import java.util.ArrayList;

/*
 * # 배열의 한계
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * 
 * # java.util.ArrayList
 * - ArrayList 클래스는 데이터가 입력되면, 자동으로 크기가 커지고
 * - 데이터가 제거되면, 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면, 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고
 * - 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * 
 * # <E>
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을
 *   반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는
 *   래퍼 클래스를 사용한다.
 *   
 *   ArrayList list = new ArrayList();                        // JDK 1.4 이전
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 이후
 *   ArrayList<Integer> list = new ArrayLIst<>();            // JDK 1.7 이후
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
