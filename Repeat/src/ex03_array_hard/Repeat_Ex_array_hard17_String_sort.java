package ex03_array_hard;

public class Repeat_Ex_array_hard17_String_sort {
	public static void main(String[] args) {
		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		// ���� ) ���� ������ �̸� ����
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		
		for(int i=0;i<names.length;i++) {
			String minName = names[i];
			int minIdx = i;
			for(int j=i; j<names.length;j++) {
				if(minName.compareTo(names[j])>0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		
		for(int i=0; i<names.length;i++) {
			System.out.print(names[i] +" ");
		}
		
		
		


	}
}
