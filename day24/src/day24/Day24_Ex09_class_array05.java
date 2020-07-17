package day24;
class Subject{
	String name;
	int score;
}
class Student02{
	Subject[] subjects;
	String name;
}

public class Day24_Ex09_class_array05 {
	public static void main(String[] args) {
		Student02[] st = new Student02[3];
		st[0] = new Student02();
		
		st[0].subjects = new Subject[3];
		
		for(int i=0; i<st[0].subjects.length;i++) {
			st[0].subjects[i] = new Subject();
		}
		
		st[1] = new Student02();
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student02();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();
		
		
	}
}
