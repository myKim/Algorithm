package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_2_Q4_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Test_2_Q4_2 t = new Test_2_Q4_2();
		int[] food_times = {3,1,2};
		int k = 5;
		System.out.println(t.solution(food_times, k));
		
		bw.close();
		br.close();
	}
	
////////////////////////////////////////////////////////////////////
    public int solution(int[] food_times, long k) {
        long sec = 0;
        int idx = 0;
        while(true) {
        	sec++;
        	
        	if(sec == k) {
        		break;
        	}
        	
        	food_times[idx]--;
        	idx = getNextIdx(food_times, idx);
        	if(idx == -1) {
        		return -1;
        	}
        }
        
        return idx + 1;
    }
    
    public static int getNextIdx(int[] food_times, int idx) {
    	int cnt = food_times.length - 1;
    	
    	while(cnt-- > 0) {
    		int res = food_times[(++idx) % food_times.length];
    		if(food_times[res] > 0) {
    			return res;
    		}
    	}
    	return -1;
    }
////////////////////////////////////////////////////////////////////
}
