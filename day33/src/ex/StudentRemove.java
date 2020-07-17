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
			System.out.println("�ش� ���̵�� �������� �ʽ��ϴ�.");
		}
	}
	
	public boolean checkId(String id) {
		Student student = studentDAo.select(id);
		// ���׿�����
		//	���ǽ� ? �� : ����
		return student != null ? true:false;
	}
	
	
}
