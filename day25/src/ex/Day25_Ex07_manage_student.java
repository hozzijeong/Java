package ex;

import java.util.Scanner;

class Student{
	String id = "";
	String pw = "";
	
	void set_data (String i, String p) {
		id = i; pw = p;
	}
	void print_data()	{
		System.out.println("이름:" + id + "비밀번호:"+pw);
	}
}
class Manager {
	Student[] list = null;
	int count = 0;
	
	void addStudent(Student st) {
		if(count ==0) {
			list = new Student[1];
		}else if(count>0) {
			Student[] temp = list;
			list = new Student[count +1];
			for(int i=0; i<count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[count] = st;
		count +=1;
	}
	
	Student remove_student(int idx) {
		Student del_st = list[idx];
		if(count ==1) {
			list = null;
		}else if(count >1) {
			Student [] temp = list;
			
			list = new Student[count -1];
			
			for(int i=0; i<idx; i++) {
				list[i] = temp[i];
			}
			for(int i= idx; i<count-1; i++) {
				list[i] = temp[i+1];
			}
			temp = null;
		}
		count -=1;
		return del_st;
	}
	
	int check_id(Student st) {
		int check = -1;
		for(int i=0; i<count; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	
	void print_student() {
		for(int i=0; i<count; i++) {
			list[i].print_data();
		}
	}
	
	void sort_student() {
		for(int i=0; i<count; i++) {
			for(int j=i; j<count; j++) {
				if(list[i].id.compareTo(list[j].id)>0) {
					Student temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
}
public class Day25_Ex07_manage_student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Manager m  = new Manager();
		
		boolean run = true;
		
		while(run) {
			for(int i=0; i<m.count;i++) {
				m.list[i].print_data();
			}
			System.out.println("[1]가입");
			System.out.println("[2]탈퇴");
			System.out.println("[3]정렬");
			System.out.println("[4]출력");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			int sel = scan.nextInt();
			
			if(sel==1) {
			
			}
			else if(sel ==2) {
				
			}
			else if(sel ==3) {
				
			}
			else if(sel ==4) {}
			else if(sel ==5) {}
			else if(sel ==6) {}
			
		}
	}
}
