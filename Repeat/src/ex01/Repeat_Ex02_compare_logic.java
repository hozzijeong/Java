package ex01;

public class Repeat_Ex02_compare_logic {
	public static void main(String[] args) {
		//��) ������ 60�� �̻��̸� true ���
        int score = 30;
        System.out.println(score >= 60);
        
        
        //����1) 3�� ����̸� true ���
        //��Ʈ1) ���� % 3 == 0 (3�� ���)
        System.out.println(score%3 == 0);
        
        
        
        //����2) ¦���̸� true ���
        //��Ʈ2) ���� % 2 == 0 (¦��)
        //��Ʈ2) ���� % 2 == 1 (Ȧ��)
        
        System.out.println(score%2 ==0);
        
         //����3)�Ʒ����� 1000��¥�� �̻�ȭ�� ������
         //     1000��¥���� 3�� �̻��̸� true ���
         int money = 178600;
         
         System.out.println((money%5000)/1000 >=3	);
         
         
         System.out.println("===========logic==========");
         
         
      // ��) 3�� ����̸鼭, ¦���̸� true ���
 		int num = 12;
 		System.out.println(num % 3 == 0 && num % 2 == 0);
 		
 		// ���� 1) ����
 		// 3������ ����� 60�� �̻��̸�, true
 		// ��, ��� �� �����̶� 50�� �̸��̸�, false
 		int kor = 100;
 		int eng = 87;
 		int math = 41;
 		System.out.println((kor+eng+math)/3.0>=60 && kor>=50 && eng>=50 && math>=50);
 		

 		// ���� 2) Ű�� 200cm�̻��̰ų� �����԰� 200kg �̻��̸�, ����(true)
 		int height1 = 199;
 		int weight1 = 199;

 		int height2 = 200;
 		int weight2 = 68;

 		System.out.println(height1>=200 || weight1>=200);
 		System.out.println(height2>=200 || weight2>=200);


	}
}
