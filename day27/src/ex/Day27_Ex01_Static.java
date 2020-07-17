package ex;

import java.util.ArrayList;

class ST{
	int num;
	String name;
}
class St_manager{
	static ArrayList<ST> list = new ArrayList<>();
	static int count = 0;
	
	void Count() {
		count = list.size();
	}
		

}
public class Day27_Ex01_Static {
	public static void main(String[] args) {
		ST st = new ST();

		St_manager m = new St_manager();
		
		st.num = 1001;
		st.name = "±èÃ¶¼ö";
		St_manager.list.add(st);
		
		System.out.println(St_manager.list.get(0).num);
		System.out.println(St_manager.list.get(0).name);
		System.out.println("size:"+St_manager.list.size());
		m.Count();
		System.out.println("count:"+St_manager.count);
		
		st = new ST();
		st.num = 1002;
		st.name = "ÃÖ¿µÈñ";
		St_manager.list.add(st);
		System.out.println(St_manager.list.get(1).num);
		System.out.println(St_manager.list.get(1).name);
		System.out.println("size:"+St_manager.list.size());
		m.Count();
		System.out.println("count:"+St_manager.count);
		
	}
}
