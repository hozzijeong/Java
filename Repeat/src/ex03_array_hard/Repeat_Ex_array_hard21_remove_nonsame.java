package ex03_array_hard;

public class Repeat_Ex_array_hard21_remove_nonsame {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};
		int [] temp = new int[test1.length];
		
		int count = 0;
		for(int i=0; i<test1.length;i++) {
			temp[count] = test1[i];
			//temp�� count��° ���� test1�� i��° ���� ����.
			int check = 0;
			for(int n=0; n<5; n++) {
				if(i!=n && temp[count]==test1[n]) {
					check =1;
				}
				// i!=n ��, �� ������ ������ ���� ������, 
				// temp[count] = test1[i] ���� ����, i ==n�̸� �� ���� ���� �� �ۿ� ���� ����!
				// check 1�� �����ν�, ���� ���� ���� �͵鸸 ���ܳ���, ���߿� ��µ�, count�� ���̸�ŭ�� �ϸ� ��.
			}
			if (check ==1) {
				count +=1;
			}
		}
		
		for(int i=0; i<count;i++) {
			System.out.print(temp[i]+" ");
		}
		
		
	}
}
