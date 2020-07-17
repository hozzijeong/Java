package ex;

import java.util.HashMap;
import java.util.Map;

public class StudentDAo {
	private Map<String , Student> stDB = new HashMap<String, Student>();
	// �л��� ������ ���� �̿��ؼ� �л��̸� : �л� ����(�̸�,�й�..���)�� ������. 
	
	//Map �� hashMap�� ����,,,?
	
	public void insert(Student st) {
		this.stDB.put(st.getId(), st); // �л� ������ ������, �л��� �̸� : �л����� ������ ������ ��. 
	}
	
	public Student select(String id) { // �л� ������ Ȯ���ϴ� �޼ҵ�
		return this.stDB.get(id);
	}
	
	public Student remove(String id) {
		return this.stDB.remove(id);
	}
	
	public Map<String,Student> getStudentDB(){
		return stDB;
	} // ĸ��ȭ�� stDB ���� ������ �� �ִ� �޼ҵ� 
	
	// �� ��ü�� Ŭ������ �� ���°� �� �� �ִ�.

}
