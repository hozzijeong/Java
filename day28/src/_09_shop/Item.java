package _09_shop;

import java.util.Scanner;
import java.util.Vector;

public class Item {
	String name;
	int price;
	String category; // 카테고리 // 육류 , 과자 , 어류 , 과일 등등

	Item(String na, int pr, String cate) { // 아이템의 기본을 생성자로 설정. 
		name = na;
		price = pr;
		category = cate;
	}

	void print() {
		System.out.println("[" + name + "]" + "[" + price + "]" + "[" + category + "]");
	}
}

class Cart {
	String userId; // 구입한 유저 id
	String itemName; // 구입한 아이템

	void print() {
		System.out.println("[" + userId + "]" + "아이템 : " + itemName);
	}
}

class ItemManager {
	Scanner scan = new Scanner(System.in);
	Vector<String> category = new Vector<String>();
	Vector<Item> itemList = new Vector<Item>(); // 전체 아이템리스트
	Vector<Cart> jangList = new Vector<Cart>(); // 전체 장바구니
	ItemManager() {
		init();
	}
	void init() {
		category.add("과자");
		category.add("생선");
		category.add("육류");
		category.add("음료수");
		Item temp = new Item("새우깡", 1000, category.get(0));
		itemList.add(temp);
		temp = new Item("고등어", 2000, category.get(1));
		itemList.add(temp);
		temp = new Item("칸쵸", 3600, category.get(0));
		itemList.add(temp);
		temp = new Item("소고기", 6500, category.get(2));
		itemList.add(temp);
		temp = new Item("콜라", 500, category.get(3));
		itemList.add(temp);
		temp = new Item("새우", 1800, category.get(1));
		itemList.add(temp);
	}

	void printJang() {
		for (int i = 0; i < jangList.size(); i++) {
			jangList.get(i).print();
		}
	} // 전체 장바구니 리스트

	void printJang(User u) {
		for (int i = 0; i < jangList.size(); i++) {
			if (u.id.equals(jangList.get(i).userId)) {
				jangList.get(i).print();
			}
		} // 해당 유저의 장바구니 리스트 
	}

	void printCategory() {
		for (int i = 0; i < category.size(); i++) {
			System.out.println("[" + i + "] " + category.get(i));
		} // 전체 카테고리 목록 출력
	}

	void printItemList() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "]");
			itemList.get(i).print();
		} // 전체 아이템 목록 출력
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
		System.out.println("[아이템추가] 카테고리를 입력하세요. ");
		int sel = scan.nextInt();
		System.out.println("[아이템추가] 아이템이름을 입력하세요.");
		String name = scan.next();
		System.out.println("[아이템추가] 가격을 입력하세요. ");
		int price = scan.nextInt();
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp); // 새로운 아이템을 추가함으로써, 아이템에 관련된 정보(이름,가격,몇번째 카테고리 인지)를 새로 저장하고, item리스트에 저장 
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
		} // 해당 유저의 장바구니 리스트
		n=0;
		System.out.println("[아이템 삭제] 아이템 번호를 입력하세요.");
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
		System.out.print("[아이템 삭제] 삭제할 번호 입력:");
		int delItem = scan.nextInt();
		itemList.remove(delItem);
	}

	void addCategory() {
		System.out.println("[카테고리추가] 카테고리 이름을 입력하세요. ");
		String name = scan.next();
		category.add(name); // 카테고리 목록을 추가함. (이것은 애초에 String이어서 생성자로 초기회 시켜줄 필요 x )
	}

	void addCart(String usID, int caID, int itemID) { // itemID는 카트에 아이템을 넣었을때 선택한 번호.
		int n = 0;
		Cart temp = new Cart();
		temp.userId = usID;
		for (int i = 0; i < itemList.size(); i++) {
			if (category.get(caID).equals(itemList.get(i).category)) {
				if (itemID == n) { // n이 의미하는 것은 카테고리에서 분류되어있는 아이템의 넘버가 같은지를 확인. 
					temp.itemName = itemList.get(i).name;
				}
				n += 1;
			}
		}
		jangList.add(temp);
	}
	
	void delCategory() {
		printCategory();
		System.out.println("[카테고리 삭제] 번호 입력:");
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
