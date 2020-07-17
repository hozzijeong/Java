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
	// 이름, 비밀번호, 메모 내용을 입력받아 글의 번호와 날짜를 저장하는 생성자. 
	public MemoVo(String name,String password, String memo) {
		no = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}
	// 글의 번호, 이름, 비밀번호, 메모,날짜를 입력받아 저장하는 생성자. 
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
	// vo의 내용을 print 했을 때, 출력되는 내용 
	public String toString() {
		Date date = new Date();
		SimpleDateFormat sdf = null;
//		글에 적힌 연/월/일 이 같으면 시:분:초를 sdf에 저장 하고 그게 아니면 연/월/일을 sdf에 저장해서, 어떤 날짜에 어떤 글을 남겼는지 리턴하는 메섣,
		if(date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth()&&
			date.getDate() == writeDate.getDate()) {
			sdf = new SimpleDateFormat("HH:mm:ss");
		}else {
			sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		}
		return no+"."+name+"님이("+password+")"+sdf.format(writeDate) +"에 남긴말"+memo;
	}
}
