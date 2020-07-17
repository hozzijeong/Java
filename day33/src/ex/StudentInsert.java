package ex;

public class StudentInsert {
	private StudentDAo studentDAo;
	
	public StudentInsert(StudentDAo stDAo) {
		this.studentDAo = stDAo;
	}
	
	public void insert(Student student) {
		String id = student.getId();
		if(checkId(id)) {
			studentDAo.insert(student);
		}else {
			System.out.println("중복된 아이디입니다.");
		}
	}
	
	public boolean checkId(String id) {
		Student student = studentDAo.select(id);
		return student == null ? true:false; // ? 
	}
}
