package ex03;

// �߻�Ŭ������ new�� �� �� ����.

/*
 * # ������������ ���� ǥ������ ������ �����Ͻÿ�.
 * 
 * public > protected > default > private
 * . public : ��ü ������Ʈ ������
 * . protected : 1) ���� ��Ű��		2) (�ٸ� ��Ű��������)��Ӱ���
 * . default(�ƹ��͵� �� ���̴� ��) : ���� ��Ű��
 * . private : ���� Ŭ���� �ȿ�����
 */

// static
// final

abstract class Ex {
	
	void print() {}			// �Ϲݸ޼���
	abstract void say();				// �߻�޼����� Ư¡:������X, �ٵ�{}�� X
}

class Test extends Ex{

	@Override
	void say() {
		
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		// Ex e = new Ex();
	}
}
