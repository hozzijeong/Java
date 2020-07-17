package ex;

import java.util.ArrayList;

class Tv{
	String name;
	String brand;
	int price;
	
	Tv(String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

class myList1{
	Tv[] arr;
	int count;
	
	void add(Tv e) {
		if(count ==0) {
			arr = new Tv[count+1];
		}else if(count >0) {
			Tv[] temp = arr;
			
			arr = new Tv[count +1];
			
			for(int i=0; i<count; i++) {
				arr[i] = temp[i];
			}
		}

		arr[count] = e;
		count +=1;
	}
	
	int size() {
		return count;
	}
	
	void remove(int idx) {
		if(count ==1) {
			arr = null;
		}else if(count >1) {
			Tv[] temp = arr;
			
			arr = new Tv[count -1];
			
			int j=0; 
			
			for(int i=0; i<count; i++) {
				if(i!= idx) {
					arr[j] = temp[i];
					j+=1;
				}
			}
		}
		count -=1;
		
	}
	
	Tv get(int idx) {
		return arr[idx];
	}
}
public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<Tv>list = new ArrayList<>();
		
		Tv temp = new Tv("TV","»ï¼º",1000);
		list.add(temp);
		
		System.out.println(temp.name);
		
		myList1 ml = new myList1();
		
		temp = new Tv("Tv", "»ï¼º",1000);
		ml.add(temp);
		
		System.out.println(temp.name);
		
	}
}
