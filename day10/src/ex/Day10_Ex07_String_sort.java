package ex;
/*
 * # ���ڿ�[����]
 * 1. compareTo() �޼���
 * 2. 2���� ���ڿ��� ���� int�� ���� ��ȯ�ϴ� �޼���
 * 3. A.compareTo(B)
 * 4. ���
 * 		A�� B�� ������						0
 *      A�� B���� ���������� ������ ���̸�		����
 *      A���� B�� ���������� ������ ���̸�		���
 *      ������ �غ���
 *      ���غ���
 *      
 */


public class Day10_Ex07_String_sort {
	public static void main(String[] args) {
		
		
		String str1 = "��";			// 876			
		String str2 = "��";			// 877
		String str3 = "��";
		
				// "��".compareTo("��")		"��" - "��"
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		// ���� ) ���� ������ �̸� ����
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		
		// ������ ������ ������ �ڹ�ŷ ȫ�浿 
//		int idx=0;
//		while(idx<names.length) {
//			int max = 0;
//			int maxIdx = 0;
//			for(int i=idx; i<names.length;i++) {
//				int str = names[idx].compareTo(names[i]);
//				if(str>=max) {
//					str = max;
//					maxIdx = i;
//				}
//			}
//			String temp = names[idx];
//			names[idx] = names[maxIdx];
//			names[maxIdx] = temp;
//			
//			
//			idx+=1;
//		}
		
		for(int i=0; i<names.length;i++) {
			String minName = names[i];
			int minIdx = i;
			for (int j = i; j<names.length;j++) {
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
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
}
