package memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVo {
	public static int count;
	private int no;
	private String name;
	private String password;
	private String memo;
	private Date writeDate; 
	
	public MemoVo() {}
	// �̸�, ��й�ȣ, �޸� ������ �Է¹޾� ���� ��ȣ�� ��¥�� �����ϴ� ������. 
	public MemoVo(String name,String password, String memo) {
		no = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}
	// ���� ��ȣ, �̸�, ��й�ȣ, �޸�,��¥�� �Է¹޾� �����ϴ� ������. 
	public MemoVo(int no, String name, String password,String memo, String writeDate) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.memo = memo.replace("_"," ");
		int year = Integer.parseInt(writeDate.substring(0,4))-1900;
		int month = Integer.parseInt(writeDate.substring(5,7))-1;
		int day =  Integer.parseInt(writeDate.substring(8,10));
		int hour = Integer.parseInt(writeDate.substring(11,13));
		int min = Integer.parseInt(writeDate.substring(14,16));
		int sec = Integer.parseInt(writeDate.substring(17));
		this.writeDate = new Date(year,month,day,hour,min,sec);
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	// vo�� ������ print ���� ��, ��µǴ� ���� 
	public String toString() {
		Date date = new Date();
		SimpleDateFormat sdf = null;
//		�ۿ� ���� ��/��/�� �� ������ ��:��:�ʸ� sdf�� ���� �ϰ� �װ� �ƴϸ� ��/��/���� sdf�� �����ؼ�, � ��¥�� � ���� ������� �����ϴ� �޼�,
		if(date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth()&&
			date.getDate() == writeDate.getDate()) {
			sdf = new SimpleDateFormat("HH:mm:ss");
		}else {
			sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		}
		return no+"."+name+"����("+password+")"+sdf.format(writeDate) +"�� ���主"+memo;
	}
}
