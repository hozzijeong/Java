package ex;
// ǥ�� �������̽�, ������ ������ �������̽� ���⿡ �߰�
interface Repairble{
	
}
// ġ�ᰡ ������ �������̽� ���� �߰�
interface Cureable{
	
}

class Unit {
	final int MAX_HP;
	int hp;
	final int MAX_MP;
	int mp;
	
	
	public Unit(int hp){
		MAX_HP = hp;
		MAX_MP = 0;
	}
	public Unit(int hp, int mp) {
		MAX_HP = hp;
		MAX_MP = mp;
	}
}

class GroundUnit extends Unit{
	public GroundUnit(int hp) {
		super(hp);
	}
	
	public GroundUnit(int hp, int mp) {
		super(hp,mp);
	}
}

class AirUnit extends Unit{
	public AirUnit (int hp) {
		super(hp);
	}
	public AirUnit (int hp,int mp) {
		super(hp,mp);
	}
}

class Tank extends GroundUnit implements Repairble{
	public Tank() {
		super(150);
		hp = MAX_HP;
		System.out.println("Tank�� ���� ü���� "+hp+"�Դϴ�.");
	}
	
	@Override
	public String toString() {
		return "Tank [hp ="+hp+"]";
	}
}

class Marine extends GroundUnit implements Cureable{
	public Marine() {
		super(75);
		hp = MAX_HP;
		System.out.println("Marine�� ���� ü����"+hp+"�Դϴ�.");
	}
	
	@Override
	public String toString() {
		return "Marine [hp ="+hp+"]";
	}
}

class SCV extends GroundUnit implements Repairble{
	public SCV() {
		super(100);
		hp = MAX_HP;
		System.out.println("SCV�� ����ü���� "+hp+"�Դϴ�.");
	}
	
	public void repair(Repairble repairble) {
		Unit unit = (Unit) repairble;
		while(unit.hp != MAX_HP) {
			unit.hp ++;
		}
		System.out.println(unit+"���� �Ϸ�");
		
	}
	
	@Override
	public String toString() {
		return "SCV [hp"+hp+"]";
	}
}

class Medic extends GroundUnit implements Cureable{
	public Medic(){
		super(100,50);
		mp = MAX_MP;
		hp = MAX_HP;
		
		
		System.out.println("Medic�� ���� ü��/������ "+hp+"/"+mp+"�Դϴ�.");
	}
	
	public void cure (Cureable cureable, Medic medic) {
		Unit unit = (Unit) cureable;
		while(medic.mp != 0	) {
			if(unit.hp == MAX_HP) {
				break;
			}
			medic.mp --;
			unit.hp ++;
		}
		
		System.out.println(unit.hp+" ġ�� �Ϸ�/"+medic.mp+" ����");
	}
	@Override
	public String toString() {
		return "Medic�� [hp/mp"+hp+"/"+mp+"]" ;
	}
}

class DropShip extends AirUnit implements Repairble{
	public DropShip() {
		super(200);
		hp = MAX_HP;
		
		System.out.println("DropShip�� ���� ü����"+hp+"�Դϴ�.");
	}
	
	public String toString() {
		return "DropShip�� [hp"+hp+"]";
	}
}

public class Interface {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		Medic medic = new Medic();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		
		scv.repair(dropship);
		
		marine.hp = 1;
		medic.cure(marine, medic);
		
	}
}
