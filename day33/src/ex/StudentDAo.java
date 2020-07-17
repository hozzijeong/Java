package ex;

import java.util.HashMap;
import java.util.Map;

public class StudentDAo {
	private Map<String , Student> stDB = new HashMap<String, Student>();
	// 학생의 정보를 맵을 이용해서 학생이름 : 학생 정보(이름,학번..등등)을 저장함. 
	
	//Map 과 hashMap의 차이,,,?
	
	public void insert(Student st) {
		this.stDB.put(st.getId(), st); // 학생 정보를 넣으면, 학생의 이름 : 학생정보 순으로 저장이 됨. 
	}
	
	public Student select(String id) { // 학생 정보를 확인하는 메소드
		return this.stDB.get(id);
	}
	
	public Student remove(String id) {
		return this.stDB.remove(id);
	}
	
	public Map<String,Student> getStudentDB(){
		return stDB;
	} // 캡슐화된 stDB 값에 접근할 수 있는 메소드 
	
	// 맵 자체도 클래스의 한 형태가 될 수 있다.

}
