package day24;
class Product{
	String name;
	int price;
}
public class Day24_Ex05_class_array {
	public static void main(String[] args) {
		Product pr = new Product();
		
		pr.name  = "���ڱ�";
		pr.price = 1000;
		//�迭
		
		Product[] arr = new Product[3];
		
		for(int i=0; i<args.length;i++)	{
			arr[i] = new Product();
			arr[i].price = (i+1)*10;
		}
		arr[0].name = "�̸���";
		arr[1].name = "�̿���";
		
		
	}
}
