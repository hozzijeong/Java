package ex;

import java.util.Iterator;
import java.util.Map;

public class StudentSelectAll {
	private StudentDAo studentDAo;
	public StudentSelectAll(StudentDAo stDAo) {
		this.studentDAo = stDAo;
	}
	
	public Map<String , Student> allSelect(){
		return studentDAo.getStudentDB();
	}
	
	public void printAll() {
		Map<String, Student> map  = studentDAo.getStudentDB();
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			map.get(key).print();
		}
	}
}
