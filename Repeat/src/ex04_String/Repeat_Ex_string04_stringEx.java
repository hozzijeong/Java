package ex04_String;

public class Repeat_Ex_string04_stringEx {
	public static void main(String[] args) {

		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];

		/*
		 * 1. ���ڸ� split�� �̿��ؼ� ������
		 * 2. ������ �迭 �ּҸ� ������ ���� �� arr�� ���� ����
		 * 3. arr�� �� ���
		 */
		
		String[] strArr = str.split("/");

		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			sum+=arr[i];
			
		}
		System.out.println(" ����: "+sum);
		
		System.out.println("========================");
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		/*
		 * 1. �������� �ϴ� ���ڿ��� �ٲ۵�, text�� �߰��� �� "/"�� ���� �߰�
		 */
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0; i<scores.length;i++) {
			if(i!= scores.length-1) {
				text += scores[i] + "" +"/";
			}else {
				text +=scores[i];
			}
		}
		System.out.println(text);


	}
}
