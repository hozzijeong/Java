package ex;

public class StudentSelect {
	
	private StudentDAo studentDAo;
	
	public StudentSelect(StudentDAo stDAo) {
		studentDAo = stDAo;
	}
	
	public Student select(String id) {
		if(checkId(id)) {
			return studentDAo.select(id);
		}else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		Student student = studentDAo.select(id);
		return student != null ? true:false;
	}
}
