package ex01;

public class Repeat_Ex02_compare_logic {
	public static void main(String[] args) {
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 3의 배수이면 true 출력
        //힌트1) 숫자 % 3 == 0 (3의 배수)
        System.out.println(score%3 == 0);
        
        
        
        //문제2) 짝수이면 true 출력
        //힌트2) 숫자 % 2 == 0 (짝수)
        //힌트2) 숫자 % 2 == 1 (홀수)
        
        System.out.println(score%2 ==0);
        
         //문제3)아래돈중 1000원짜리 이상화폐를 제외한
         //     1000원짜리가 3장 이상이면 true 출력
         int money = 178600;
         
         System.out.println((money%5000)/1000 >=3	);
         
         
         System.out.println("===========logic==========");
         
         
      // 예) 3의 배수이면서, 짝수이면 true 출력
 		int num = 12;
 		System.out.println(num % 3 == 0 && num % 2 == 0);
 		
 		// 문제 1) 과락
 		// 3과목의 평균이 60점 이상이면, true
 		// 단, 어느 한 과목이라도 50점 미만이면, false
 		int kor = 100;
 		int eng = 87;
 		int math = 41;
 		System.out.println((kor+eng+math)/3.0>=60 && kor>=50 && eng>=50 && math>=50);
 		

 		// 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
 		int height1 = 199;
 		int weight1 = 199;

 		int height2 = 200;
 		int weight2 = 68;

 		System.out.println(height1>=200 || weight1>=200);
 		System.out.println(height2>=200 || weight2>=200);


	}
}
