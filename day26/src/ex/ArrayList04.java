package ex;

import java.util.ArrayList;
import java.util.Vector;

class Student{
	String id;
	String pw;
	
	void setData(String i,String p) {
		id = i;
		pw = p;
	}
	
	void printData(){
		System.out.println("ID :"+id+" PW :"+pw);
	}
}

class Manager{
	// 클래스선택 : ctrl + 마우스 클릭(1)
	ArrayList<Student> list = new ArrayList<>();
	
	void add(Student st) {
		list.add(st);
	}
	
	Student remove(int idx) {
		Student del = list.get(idx);
		list.remove(idx);
		return del;
	}
	
	int check(Student st) {
		int check = -1;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	void print() {
		for(int i=0; i<list.size();i++) {
			list.get(i).printData();
		}
	}
	
	void sort() {
		for(int i=0; i<list.size();i++) {
			Student s1 = list.get(i);
			for(int j=0; j<list.size();j++) {
				Student s2 = list.get(j);
				if(s1.id.compareTo(s2.id)>0) {
					Student temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	

	
	
}
public class ArrayList04 {
	public static void main(String[] args) {
		
	}
}
