package ex;

public class Day14_Ex03_StringEx {
	public static void main(String[] args) {
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];

		String[] strArr = str.split("/");
		
		int sum = 0;
		
		for(int i=0; i<strArr.length;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			// ���ڿ��� ���ڷ� ����
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println("========================");
		
		
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String[] arrtext = new String[scores.length];
		String text = "";
		
		for(int i=0; i<3;i++) {
			arrtext[i] = "";
		}		
		for(int i=0; i<scores.length;i++) {
			if(i<2) {
				arrtext[i] = String.valueOf(scores[i]+"/");
			}else {
				arrtext[i] = String.valueOf(scores[i]);
				// ���ڸ� ���ڿ��� ����. 
			}
		}
		
		for(int i=0; i<3;i++)	{
			text += arrtext[i];
		}
		
		System.out.println(text);
		
		
		String text1 = "";
		for(int i=0; i<scores.length;i++) {
			text1 += scores[i]+"";
			if(i != scores.length-1) {
				text1+="/";
			}
		}
		System.out.println(text1);
		
	}
}
