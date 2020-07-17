package _10_rpg;

import java.util.ArrayList;

public class Guild {
	final int PARTY_SIZE = 4;
	// �̱��� ������ arrayList���� ������ �����Ѱ�? -> Ŭ�������� ���� �����Ѱ�,,, 
	// 
	ArrayList<Unit> guildList = new ArrayList<>();
	Unit [] partyList; // arrayList�� �������� ���� ������, �ִ� �ο����� 4���̱� ����
	public void setGuild() {
		Unit temp = new Unit("ȣ����", 1, 100, 10, 5, 0);
		guildList.add(temp);
		temp = new Unit("������", 1, 80, 7, 3, 0);
		guildList.add(temp);
		temp = new Unit("�罿", 1, 50, 3, 1, 0);
		guildList.add(temp);
		temp = new Unit("�δ���", 1, 70, 5, 2, 0);
		guildList.add(temp);
		temp = new Unit("����", 1, 200, 4, 8, 0);
		guildList.add(temp);
		temp = new Unit("����", 1, 120, 11, 7, 0);
		guildList.add(temp);
		for (int i = 0; i < 4; i++) {
			guildList.get(i).party = true;
		} // ù��° ���� 4��° ���� ��Ƽ ����. 
		partyList = new Unit[PARTY_SIZE]; // Ŭ���� �迭 ���� ����. 
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) {
			if(guildList.get(i).party == true) {
				partyList[n] = guildList.get(i);
				n += 1; // ��Ƽ ���ΰ� true�̸�, partyList�� �߰� .
			}
		}	
	}
	public Unit getGuildUnit(int num) {
		return guildList.get(num); // num��° ������ Unit������ ������
	}
	public void printAllUnitStaus() {
		System.out.println("======================================");
		System.out.println("[��� : " + Player.money + "]");
		System.out.println("============= [����] =================");
		for (int i = 0; i < guildList.size(); i++) {
			System.out.print("[" + (i + 1) + "��]");
			System.out.print(" [�̸� : " + guildList.get(i).name + "]");
			System.out.print(" [���� : " + guildList.get(i).level + "]");
			System.out.print(" [ü�� : " + guildList.get(i).hp);
			System.out.println(" / " + guildList.get(i).maxHp + "]");
			System.out.print("[���ݷ� : " + guildList.get(i).att + "]");
			System.out.print(" [���� : " + guildList.get(i).def + "]");
			System.out.println(" [��Ƽ�� : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=================================");
	} // ���� ���� ������ 
	public void printUnitStaus(int num) {
		guildList.get(num).printStatus(); // num��° ���� ���� print
	}
	public void printUnitItem(int num) {
		guildList.get(num).printEquitedItem(); // num��° ���� ������ print
	}
	public void buyUnit() {
		if (Player.money < 5000)
			return;
		String[] n1 = { "��", "��", "��", "��", "��", "��", "��"};
		String[] n2 = { "��", "��", "��", "��", "��", "��", "��"};
		String[] n3 = { "��", "��", "��", "��", "��", "��", "ö"};

		String name = n1[MainGame.ran.nextInt(n1.length)];
		name += n2[MainGame.ran.nextInt(n1.length)];
		name += n3[MainGame.ran.nextInt(n1.length)];
		int ran = MainGame.ran.nextInt(8) + 2;
		int hp = ran * 11;
		int att = ran + 1;
		int def = ran / 2 + 1;
		Unit temp = new Unit(name, 1, hp, att, def, 0);

		System.out.println("=====================================");
		System.out.print("[�̸� : " + name + "]");
		System.out.print(" [���� : " + 1 + "]");
		System.out.print(" [ü�� : " + hp);
		System.out.println(" / " + hp + "]");
		System.out.print("[���ݷ� : " + att + "]");
		System.out.println(" [���� : " + def + "]");
		System.out.println("������ �߰��մϴ�.");
		System.out.println("=====================================");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		guildList.add(temp);
		Player.money -= 5000;
	}

	public void removeUnit() {
		printAllUnitStaus();
		System.out.println("������ ��ȣ�� �Է��ϼ��� ");
		int sel = MainGame.scan.nextInt();
		if (guildList.get(sel - 1).party) {
			System.out.println("��Ƽ���� ����� �����Ҽ� �����ϴ�.");
		} else {
			System.out.println("=================================");
			System.out.print("[�̸� : " + guildList.get(sel - 1).name + "]");
			System.out.println("������ �����մϴ�.");
			System.out.println("=================================");
			guildList.remove(sel - 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	public void printParty() {
		System.out.println("================ [��Ƽ��] ===============");
		for(int i = 0; i < PARTY_SIZE; i++) {
			System.out.print("[" + (i + 1) + "��]");
			System.out.print(" [�̸� : " + partyList[i].name + "]");
			System.out.print(" [���� : " + partyList[i].level + "]");
			System.out.print(" [ü�� : " + partyList[i].hp);
			System.out.println(" / " + partyList[i].maxHp + "]");
			System.out.print("[���ݷ� : " + partyList[i].att + "]");
			System.out.print(" [���� : " + partyList[i].def + "]");
			System.out.println(" [��Ƽ�� : " + guildList.get(i).party + "]");
			System.out.println("");	
		}
		System.out.println("=====================================");
	}
	
	public void partyChange() {
		
		printParty();
		System.out.println("��ü�� ��ȣ�� �Է��ϼ��� ");
		int partyNum = MainGame.scan.nextInt();//4
		printAllUnitStaus(); 
		System.out.println("������ ��ȣ�� �Է��ϼ��� ");
		int guildNum = MainGame.scan.nextInt();//8
		
		partyList[partyNum - 1].party = false; // 3��° = false
		guildList.get(guildNum - 1).party = true; // 7��° = true
		
		System.out.println("====================================");
		System.out.print("[�̸� : " + partyList[partyNum - 1].name + "]");
		System.out.print("���� ");
		System.out.print("[�̸� : " + guildList.get(guildNum - 1).name + "]");
		System.out.println("���� ��ü �մϴ�. ");
		System.out.println("====================================");
		
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) { // size = 8
			if(guildList.get(i).party) {
				System.out.println(guildList.get(i).name);
				partyList[n] = guildList.get(i); 
				n += 1;
			} // �ٽ��ѹ� ��Ƽ�� �ʱ�ȭ 
		}		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public void sortUnit() {
		for(int i=0; i<guildList.size(); i++) {
			Unit s1 = guildList.get(i);
			for(int j=0; j<guildList.size();j++) {
				Unit s2 = guildList.get(j);
				if(s1.name.compareTo(s2.name)<0) {
					Unit temp = guildList.get(i);
					guildList.set(i, guildList.get(j));
					guildList.set(j,temp);
				}
			}
		}
	}
	
	public void guildMenu() {
		while (true) {
			System.out.println("=============== [������] ================");
			System.out.println("[1.�����] [2.�����߰�] [3.��������]\n"
					+ "[4.��Ƽ����ü] [5.����]  [0.�ڷΰ���]");
			int sel = MainGame.scan.nextInt();
			if (sel == 1) {
				printAllUnitStaus();
			} else if (sel == 2) {
				buyUnit();
			} else if (sel == 3) {
				removeUnit();
			} 
			else if (sel == 4) {
				partyChange();
			}else if(sel ==5) {
				sortUnit();
			}
			else if(sel == 0){
				break;
			}
		}
	}

}
