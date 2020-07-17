package text02;
/*
 * # ������(constructor)
 * 1. �����ڴ� �ݵ�� Ŭ���� �̸��� ���ƾ� �Ѵ�.
 * 2. �����ڴ� new Ŭ������(); �̶� ȣ��ȴ�.
 * 3. �����ڴ� ��������� �ʱ�ȭ ��ų �������� ����Ѵ�.
 * 4. �����ڸ� �������� ������, �ڹ� �����Ϸ��� �ڵ����� �⺻ �����ڸ� �����.
 * 5. �⺻�����ڶ�, �Ű������� �ƹ��͵� ���� �����ڸ� �ǹ��Ѵ�.
 * 6. �����ڸ� �����ϸ� �⺻ �����ڴ� �ڵ����� ��������� �ʴ´�.
 * 7. �����ڴ� ����Ÿ���� ������ �ʰ� return�� ������� �ʴ´�.(�޼������ ������)
 */

class Fruit{
	String name;
	int price;
	Fruit(){}
	Fruit(String name, int price){
		this.name = name;
		this.price = price	;
		
	}
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void printData() {
		System.out.println(name + "("+price+"��)");
	}
}
public class Day25_02_constructor {
	public static void main(String[] args) {
		/*
         * # ������ �޼���
         * �ν��Ͻ� ������ �ʱ�ȭ�� �� ������ �޼��带 ������ �ʰ�,
         * ������ �޼��带 �����Ѵ�.
         */
		
		Fruit apple = new Fruit();
		// .���� ������ ������� �ʱ�ȭ	
		apple.name = "���";
		apple.price = 1000;
		
		// �޼��带 ����� ������� �ʱ�ȭ	
		apple.setData("���", 1000);
		apple.printData();

		
		//�����ڸ� Ȱ���� ������� �ʱ�ȭ	
		Fruit banana = new Fruit("�ٳ���",3700);
		banana.printData();
	}
}
