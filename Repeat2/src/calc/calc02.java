package calc;

class Mul extends Calculator{
	public void mul() {
		System.out.println(this.left*this.right);
	}
}

public class calc02 {
	public static void main(String[] args) {
		Mul m = new Mul();
		m.setOperands(10, 20);
		m.mul();
	
	}
}
