package ex;

// �� �迭���� �ߺ��ȵȼ��ڸ� �����Ͻÿ� 
// 1) {1,2,1,2}
// 2) {4,4}
// 3) {1,1,1,1}
public class Day11_Ex04_remove_num {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		int[] temp = new int[5];
		int count = 0;
		for(int i=0; i<test1.length;i++) {
			temp[count] = test1[i]; // test�� ���� �ϴ� temp�� ������. 
			int check = 0; // �� ������ �ش� �ε����� �ߺ��� ���ڰ� �����ϸ� check = 1�� ����
			for (int j=0; j<test1.length;j++) {
				if(i!=j && temp[count] == test1[j]) {
					check = 1; // test1�߿��� i ��, temp[count]�� ���� �����鼭 �迭 �ȿ� ���� ���� �����ϸ� check = 1�� ����)
				}
			}
			if(check ==1) {
				count+=1; // check= 1�̵Ǹ� count�Ѱ��� �߰��� �����ν�, temp�� ������ �ִ� ���ڸ� ����(���)�ϰ�, test1�� ���� �迭�� ���ڸ� �˻���.
				// ���࿡ check �� �״�� 0�̶�� test�� �ش� ���ڴ� �ǳʶٰ� �ǰ�, i++�� �� ���ڰ� �ٽ� �� �ڸ��� ����ϰԵ�.
				// �ᱹ�� temp�� �� ũ��� 5������, ����� count��ŭ�� ���ָ� ���̴°��� �Ȱ���. 
			}
		}
	
		
	}
}
