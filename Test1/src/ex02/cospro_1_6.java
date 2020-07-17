package ex02;

class Solution_2{
	  
    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
        int size = recordA.length;
        for(int i=0; i<size; i++) {
        	if(recordA[i] == ((recordB[i]+1)%3)) {
        		cnt +=3;
        	}else if(recordA[i] > ((recordB[i]+1)%3)) {
        		if(cnt -1 >=0) {
        			cnt -=1;
        		}else {
        			cnt = 0;
        		}
        	}
        }
        return cnt;
    }
}



public class cospro_1_6 {
	public static void main(String[] args) {
		Solution_2 sol = new Solution_2();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");

	}

}
