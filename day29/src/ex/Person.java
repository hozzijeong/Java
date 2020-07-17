package ex;

import java.util.Date;

/*
 * # VO(Value Object) : �� ���� �����Ϳ� �����͸� ó���� �޼ҵ尡 ���ǵ� Ŭ����. DTO(Data Transfer Object), bean
 * # bean : �ڹٷ� �۾��ϱ� ���� �ּ��� �۾� ������ ó���� �����͸� ����� ��� ���.
 * 			(��� ����, �ʵ�)�� ��� ��ҿ� �����͸� ����� �� �� �ִ� getters & setters �޼ҵ�θ� ������ Ŭ������ ���Ѵ�.
 */

public class Person {
	/*
	 * # ��� ���� ����
	 * . ��� ������ ������ �� "="�� ����� �ʱ�ȭ ��ų �� �ִ�.
	 * . �ʱ�ȭ ��Ű�� ������ ���ڴ� 0, boolean�� false, Ŭ������ ���� ��� ��ü�� null�� �ڵ� �ʱ�ȭ �ȴ�.
	 * . ��� ������ ������ ����(static)��� ������ �ν��Ͻ� ��� ������ �ִ�.
	 * . ���� ��� ������ ���� Ŭ������ ������ ��� ��ü���� �����ؼ� ����Ѵ�.
	 * . �ν��Ͻ� ��� ������ ���� Ŭ������ ������ ��� ��ü���� ������ ��� ������ ������.
	 * . ���� ��� ������ Ŭ������ ��ü�� �������� �ʰ� Ŭ���� �̸��� "."�� �� ������ �� �ִ�.
	 */

	// [���� ���� ������] [static] �ڷ��� ������ [= �ʱ�ġ];
	public static int count; 	// ���� ��� ����
	private int no; 			// ��ü�� ������ �� ���� �ڵ� ����

	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate; 	// ��ü�� �����Ǵ� ������ ��¥�� �ð� �ڵ� �ʱ�ȭ

	/*
	 * # ������
	 * . ������ �޼ҵ�(���� ������)�� �����Ѵ�.
	 * . ������ �̸��� �ݵ�� Ŭ���� �̸��� ���ƾ� �Ѵ�.
	 * . �����ڴ� ��ü�� �����Ǵ� ���� �ڵ����� ����Ǹ� ��� ������ �ʱ�ȭ ��ų �������� ����Ѵ�.
	 * . �����ڸ� �������� ������ �ڹ� �����Ϸ��� �ƹ��� �ϵ� ���� �ʴ� �⺻ �����ڸ� �ڵ����� �����.
	 * . ��, �����ڸ� �����ϸ� �⺻ �����ڴ� �ڵ����� ����� ���� �ʴ´�.
	 * . �����ڴ� ���� Ÿ���� ������ �ʰ�(void�� ������� �ʴ´�.) return�� ������� �ʴ´�.
	 */
	public Person() {
		// name = "����";
		// gender = true;
		// memo = "����";
		// ���� Ŭ������ �ٸ� ������ Person(String name, boolean gender, String memo)�� ȣ���Ѵ�.


		this("����",true,"����");
	}
	
	public Person(String name, boolean gender, String memo) {
		// super()�� this()�� �ݵ�� �������� ù ���忡 ����Ѵ�. ���ÿ� ����� �� ����.
		// super()�� �����ϸ� �ڹ� �����Ϸ��� �ڵ����� �ٿ��ش�.
		// super(); // �θ� Ŭ������ �����ڸ� �ǹ��Ѵ�.
		// this(); 	// ���� Ŭ������ �ٸ� �����ڸ� �ǹ��Ѵ�.
		// super 	// �θ� Ŭ������ �ǹ��Ѵ�.
		// this 	// ���� Ŭ������ �ǹ��Ѵ�.

		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
	
}
