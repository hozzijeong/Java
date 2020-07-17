package ex;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ids = {"test", "koreait","stst","jsp"};
		String [] names = {"�̸���", "��ö��","�̿���","���缮"};
		int [] nums = {1001,1002,1003,1004};
	
		StudentController controller = new StudentController();
		StudentInsert stInsert = controller.getInsert();
		for(int i=0; i<ids.length; i++	) {
			Student st = new Student(nums[i], ids[i], names[i]);
			stInsert.insert(st);
		}
		
		boolean run = true;
		while(run) {
			System.out.println("1.�߰� 2.���� 3.��� 4.��ü���");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.println("[�߰�] ��ȣ �Է�:");
				int num = scan.nextInt();
				System.out.println("[�߰�] ���̵� �Է�:");
				String id = scan.next();
				System.out.println("[�߰�] �̸� �Է�:");
				String name = scan.next();
				Student st = new Student(num, id, name);
				stInsert.insert(st);
			}
			
			else if(sel ==2){
				System.out.println("[����] ���̵� �Է�:");
				String id = scan.next();
				StudentRemove stRemove = controller.getRemove();
				stRemove.remove(id);
			}
			else if(sel ==3) {
				System.out.println("[���] ���̵� �Է�:");
				String id = scan.next();
				StudentSelect stSelect = controller.getSelect();
				Student st = stSelect.select(id);
				if(st != null) {
					st.print();
				}
			}
			else if(sel ==4) {
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			}
			
		}
	
	}
}
