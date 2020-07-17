package day24;

import java.util.Scanner;

class Subject1{
	String name;
	int score;
}
class Student{
	Subject1[] subjects;
	String name;
}
public class Day24_Ex10_class_array_ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student[] list = new Student[3];
		int count = 0; //학생수
		
		while(true) {
			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 성적을 입력받아 출력		
			
			int choice = scan.nextInt();
			
			if(choice==1) {
				if(count>3) {
					System.out.println("더이상 학생을 추가할 수 없습니다.");
					continue;
				}
				if(count >0) {
					System.out.print("[학생 추가]이름 입력");	
					list[count].name = scan.next();
					count +=1;
					
				}
			}
			else if(choice ==2) {
				System.out.print("[과목 추가] 학생 이름 입력:");
				String name = scan.next();
				int check = -1;
				for(int i=0; i<list.length;i++) {
					if(name.equals(list[i].name)) {
						check = i;
					}
				}
				if(check ==-1) {
					System.out.println("해당 학생은 존재하지 않습니다.");
					continue;
				}
				System.out.println("[과목추가] 과목 입력:");
				list[check].subjects[check].name = scan.next();
				
			}
			else if(choice ==3) {}
			
		}


	}
}
