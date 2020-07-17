package calc;
class Calculator{
	int left,right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class Sb extends Calculator{
	public void substract() {
		System.out.println(this.left-this.right);
	}
}
public class calc01 {
	public static void main(String[] args) {
		Sb sb = new Sb();
		sb.setOperands(10, 20);
		sb.sum();
		sb.avg();
		sb.substract();
	}
}
