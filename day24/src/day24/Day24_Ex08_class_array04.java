package day24;
class Member{
	String name;
	int num;
}
class MemberManager{
	Member[] list = new Member[3];
}
public class Day24_Ex08_class_array04 {
	public static void main(String[] args) {
		
		MemberManager mg = new MemberManager();
	
		Member m1 = new Member();
		mg.list[0] = m1;
		m1.name = "��ö��";
		m1.num = 1001;
		
		m1 = new Member();
		mg.list[1] = m1;
		m1.name = "�̸���";
		m1.num	 = 1002;
		
		m1 = new Member();
		mg.list[2] = m1;
		m1.name = "�ڿ���";
		m1.num = 1003;
		
		for(int i=0; i<mg.list.length;i++) {
			System.out.println(mg.list[i].name+"\t:"+mg.list[i].num);
		}
		
	}
}
