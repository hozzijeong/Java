package ex;

public class StudentController {
	private StudentDAo stDAo;
	private StudentInsert insert;
	private StudentSelect select;
	private StudentSelectAll selectAll;
	private StudentRemove remove;
	
	
	public StudentController() {
		stDAo = new StudentDAo();
		insert = new StudentInsert(stDAo);
		select = new StudentSelect(stDAo);
		selectAll = new StudentSelectAll(stDAo);
		remove = new StudentRemove(stDAo);
	}

	public StudentRemove getRemove() {
		return remove;
	}

	public void setRemove(StudentRemove remove) {
		this.remove = remove;
	}

	public StudentDAo getStDAo() {
		return stDAo;
	}

	public void setStDAo(StudentDAo stDAo) {
		this.stDAo = stDAo;
	}

	public StudentInsert getInsert() {
		return insert;
	}

	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}

	public StudentSelect getSelect() {
		return select;
	}

	public void setSelect(StudentSelect select) {
		this.select = select;
	}

	public StudentSelectAll getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentSelectAll selectAll) {
		this.selectAll = selectAll;
	}
}
