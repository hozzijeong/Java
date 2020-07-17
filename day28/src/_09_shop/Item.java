package _09_shop;

import java.util.Scanner;
import java.util.Vector;

public class Item {
	String name;
	int price;
	String category; // ī�װ� // ���� , ���� , ��� , ���� ���

	Item(String na, int pr, String cate) { // �������� �⺻�� �����ڷ� ����. 
		name = na;
		price = pr;
		category = cate;
	}

	void print() {
		System.out.println("[" + name + "]" + "[" + price + "]" + "[" + category + "]");
	}
}

class Cart {
	String userId; // ������ ���� id
	String itemName; // ������ ������

	void print() {
		System.out.println("[" + userId + "]" + "������ : " + itemName);
	}
}

class ItemManager {
	Scanner scan = new Scanner(System.in);
	Vector<String> category = new Vector<String>();
	Vector<Item> itemList = new Vector<Item>(); // ��ü �����۸���Ʈ
	Vector<Cart> jangList = new Vector<Cart>(); // ��ü ��ٱ���
	ItemManager() {
		init();
	}
	void init() {
		category.add("����");
		category.add("����");
		category.add("����");
		category.add("�����");
		Item temp = new Item("�����", 1000, category.get(0));
		itemList.add(temp);
		temp = new Item("����", 2000, category.get(1));
		itemList.add(temp);
		temp = new Item("ĭ��", 3600, category.get(0));
		itemList.add(temp);
		temp = new Item("�Ұ��", 6500, category.get(2));
		itemList.add(temp);
		temp = new Item("�ݶ�", 500, category.get(3));
		itemList.add(temp);
		temp = new Item("����", 1800, category.get(1));
		itemList.add(temp);
	}

	void printJang() {
		for (int i = 0; i < jangList.size(); i++) {
			jangList.get(i).print();
		}
	} // ��ü ��ٱ��� ����Ʈ

	void printJang(User u) {
		for (int i = 0; i < jangList.size(); i++) {
			if (u.id.equals(jangList.get(i).userId)) {
				jangList.get(i).print();
			}
		} // �ش� ������ ��ٱ��� ����Ʈ 
	}

	void printCategory() {
		for (int i = 0; i < category.size(); i++) {
			System.out.println("[" + i + "] " + category.get(i));
		} // ��ü ī�װ� ��� ���
	}

	void printItemList() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "]");
			itemList.get(i).print();
		} // ��ü ������ ��� ���
	}

	void printItemList(int caID) {
		int n = 0;
		for (int i = 0; i < itemList.size(); i++) {
			if (category.get(caID).equals(itemList.get(i).category)) {
				System.out.print("[" + n + "]");
				itemList.get(i).print();
				n += 1; 
			}
		}
	}
	
	void addItem() {
		printCategory();
		System.out.println("[�������߰�] ī�װ��� �Է��ϼ���. ");
		int sel = scan.nextInt();
		System.out.println("[�������߰�] �������̸��� �Է��ϼ���.");
		String name = scan.next();
		System.out.println("[�������߰�] ������ �Է��ϼ���. ");
		int price = scan.nextInt();
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp); // ���ο� �������� �߰������ν�, �����ۿ� ���õ� ����(�̸�,����,���° ī�װ� ����)�� ���� �����ϰ�, item����Ʈ�� ���� 
	}
	
	void deleteItem(User u) {
		int n=0;
		int idx = -1;
		for (int i = 0; i < jangList.size(); i++) {
			if (u.id.equals(jangList.get(i).userId)) {
				System.out.print("["+n+"] ");
				jangList.get(i).print();
				n+=1;
			}
		} // �ش� ������ ��ٱ��� ����Ʈ
		n=0;
		System.out.println("[������ ����] ������ ��ȣ�� �Է��ϼ���.");
		int delitem = scan.nextInt();
		 for(int i=0; i<jangList.size(); i++) {
			 if(u.id.equals(jangList.get(i).userId)) {
				 if(n == delitem) {
					 jangList.remove(i);
				 }
				 n+=1;
			 }
		 }
	}
	
	void deleteItem() {
		printItemList();
		System.out.print("[������ ����] ������ ��ȣ �Է�:");
		int delItem = scan.nextInt();
		itemList.remove(delItem);
	}

	void addCategory() {
		System.out.println("[ī�װ��߰�] ī�װ� �̸��� �Է��ϼ���. ");
		String name = scan.next();
		category.add(name); // ī�װ� ����� �߰���. (�̰��� ���ʿ� String�̾ �����ڷ� �ʱ�ȸ ������ �ʿ� x )
	}

	void addCart(String usID, int caID, int itemID) { // itemID�� īƮ�� �������� �־����� ������ ��ȣ.
		int n = 0;
		Cart temp = new Cart();
		temp.userId = usID;
		for (int i = 0; i < itemList.size(); i++) {
			if (category.get(caID).equals(itemList.get(i).category)) {
				if (itemID == n) { // n�� �ǹ��ϴ� ���� ī�װ����� �з��Ǿ��ִ� �������� �ѹ��� �������� Ȯ��. 
					temp.itemName = itemList.get(i).name;
				}
				n += 1;
			}
		}
		jangList.add(temp);
	}
	
	void delCategory() {
		printCategory();
		System.out.println("[ī�װ� ����] ��ȣ �Է�:");
		int idx = scan.nextInt();
		
		category.remove(idx);
		
	}
	
	int Purchase(User u) {
		printJang(u);
		int total = 0;
		for(int i=0; i<jangList.size();i++) {
			if(u.id.equals(jangList.get(i).userId)) {
				for(int j=0; j<itemList.size();j++) {
					if(jangList.get(i).itemName.equals(itemList.get(j).name)) {
						total += itemList.get(j).price;
					}
				}
			}
		}
		return total;
	}
}
