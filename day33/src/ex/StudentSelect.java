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
			System.out.println("������ �����ϴ�.");
		}
		return null;
	}
	
	public boolean checkId(String id) {
		Student student = studentDAo.select(id);
		return student != null ? true:false;
	}
}
