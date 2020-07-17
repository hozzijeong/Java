package ex04;

class Solution {
    public String solution(int n) {
        String answer = "";
        
        /*
           String answer = "";
	         int temp = n; 
	        while(temp>0){
	            if(temp%3 == 0){
	                answer = "4"+answer;
	            }else if(temp%3==1){
	                answer = "1"+answer;
	            }else if(temp%3 ==2){
	                answer = "2"+answer;
	            }
	            temp = (temp-1)/3;
	        }
	        return answer;
         */
        
        
        
        
        
         String[] num = {"4","1","2"};
         int k=0;
         while(n>0) {
        	 answer = num[n%3]+answer;
        	 n = (n-1)/3;
         }
         
        return answer;
    }
}


public class programus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		
		System.out.println(sol.solution(2));
		
			
	}

}
