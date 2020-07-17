package ex08_class_Array;

import java.util.Scanner;

class Subject{
	String name;
	int score;
}
class Student{
	Subject[] subjects;
	String name;
}
// # 학생 추가 삭제 컨트롤러
//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//   김철수 : 과목3개 수학 50 국어50 영어 60 
//   이만수 : 과목2개 수학 20 국어 30 
//   이영희 : 과목1개 수학 100


public class Repeat_Ex01_class_Array01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] list = new Student[3];
		
		int count = 0; // 현재 등록된 학생 수.
		
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(list[i].name + ":");
				if(list[i].subjects != null) {
					for(int j=0; j<list[i].subjects.length;i++) {
						System.out.print(list[i].subjects[j].name + "=" + list[i].subjects[j].score);
					}
				}
				System.out.println();
			}
			System.out.println("[1] 학생 추가");
			System.out.println("[2] 과목 추가");
			System.out.println("[3] 성적 추가");
		
			int choice = scan.nextInt();
			
			if(choice ==1) {
				if(count>list.length) {
					System.out.println("[메세지] 더이상 추가할 수 없습니다.");
					continue;
				}else {
					System.out.print("[학생추가] 이름 입력:");
					String name = scan.next();
					
					list[count] = new Student();
					list[count].name = name;
					
					count +=1;
					
				}
			}else if(choice ==2) {
				if(count ==0) {
					System.out.println("[메세지] 등록된 학생이 없습니다.");
					continue;
				}else if(count >0) {
					for(int i=0; i<count; i++) {
						System.out.println("["+(i+1)+"]"+list[i].name);
					}
					System.out.println("[과목추가] 학생 선택");
					int stu_sel = scan.nextInt();
					stu_sel -=1;
					
					System.out.println("[과목추가] 과목명 작성");
					String sub_name = scan.next();
					if(list[stu_sel].subjects == null) {
						list[stu_sel].subjects = new Subject[1];
						
						list[stu_sel].subjects[0] = new Subject();
						list[stu_sel].subjects[0].name = sub_name;
					}else {
						
						int size = list[stu_sel].subjects.length;
						
						
						Subject[] temp = list[stu_sel].subjects;
						
						list[stu_sel].subjects = new Subject[size+1];
						
						for(int i=0; i<size;i++) {
							list[stu_sel].subjects[i] = temp[i];
						}
						list[stu_sel].subjects[size] = new Subject();
						list[stu_sel].subjects[size].name = sub_name;
						
						temp = null;
					}
				}
			}else if(choice ==3) {
				for(int i=0; i<count ;i++) {
					System.out.println("["+(i+1)+"]" +list[i].name);
					
				}
				System.out.println("[성적 추가] 학생 선택" );
				int sel = scan.nextInt();
				sel -=1;
				
				if(list[sel].subjects != null) {
					for(int i=0; i<list[sel].subjects.length;i++) {
						System.out.println("["+(i+1)+"]"+list[sel].subjects[i].name);
					}
				}
				System.out.println("[성적 추가] 과목 선택");
				int num = scan.nextInt();
				num -=1;
				
				System.out.println("[성적추가] 성적 입력:");
				int score = scan.nextInt();
				
				
				list[sel].subjects[num].score = score;
			
			
			}
		
		}
		
	
	}
}
