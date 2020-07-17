package ex;
class MyList{
	int [] arr;
	int count;
	
	void print() {
		System.out.print("[");
		for(int i=0; i<count; i++) {
			System.out.print(arr[i]);
			if(i!=count-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	void add(int value) {
		if(count ==0) {
			arr = new int [1];
		}else if(count >0) {
			int [] temp =  arr;
			arr = new int [count +1];
			
			for(int i=0; i<count; i++) {
				arr[i] = temp [i];
			}
			temp = null;
		}
		
		arr[count] = value;
		count +=1;
	}
	
	void add(int idx, int value) {
		if(count ==0) {
			arr = new int[count +1];
		}else if(count >1) {
			int []temp = arr;
			arr = new int[count +1];
		
			int j=0;
			for(int i=0; i<count; i++) {
				if(i!= idx) {
					arr[i] = temp[j];
					j+=1;
				}
			}
			
			temp = null;
		
		}
		
		arr[idx] = value;
		count +=1;
		
	}
	
	void remove(int idx) {
		int [] temp = arr;
		if(count ==1) {
			arr = null;
		} else if(count >1) {
			if(idx <0 || count-1 <idx) {
				return;
			}
			arr = new int [count -1];
			for(int i=0; i<idx; i++) {
				arr[i] = temp[i];
			}
			for(int i= idx; i<count -1; i++) {
				arr[i] = temp[i+1];
			}
		}
		
		count -=1;
		
	}
	
	int size() {
		return count;
	}

	int get(int idx) {
		return arr[idx];
	}
	
	void set(int idx, int value) {
		arr[idx] = value;
	}
	
	void clear() {
		arr  =null;
		count = 0;
	}
}
public class ArrayList02 {
	public static void main(String[] args) {
		
	}
}
