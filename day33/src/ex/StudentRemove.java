package ex;

public class StudentRemove {
	private StudentDAo studentDAo;
	public StudentRemove(StudentDAo stDAo) {
		this.studentDAo = stDAo;
	}
	
	public void remove(String id) {
		if(checkId(id)) {
			studentDAo.remove(id);
		}else {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
	}
	
	public boolean checkId(String id) {
		Student student = studentDAo.select(id);
		// 삼항연산자
		//	조건식 ? 참 : 거짓
		return student != null ? true:false;
	}
	
	
}
