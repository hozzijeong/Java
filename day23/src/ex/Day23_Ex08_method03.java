package ex;
/*
 * # �޼����� ����[3�ܰ�] : ���ϰ��� �ִ� �޼���
 * int getNum(�Ű�����[parameter]){
 * 		������ ����;
 * 		return 10;
 * } 
 *
 * # �޼����� ���(ȣ��)
 * int num = getNum(����,�μ�[argument]);
 */
class Ex30{
	int num;
	
	void setNum(int num) {
		this.num = num;
	}
	
	
	int getNum() {
		return num;
	}
}

public class Day23_Ex08_method03 {
	public static void main(String[] args) {
		Ex30 e = new Ex30();
		
		e.setNum(10);
		
		int result = e.getNum();
		System.out.println(e.getNum());
	}
}
