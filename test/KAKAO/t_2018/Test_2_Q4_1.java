package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_2_Q4_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Test_2_Q4_1 t = new Test_2_Q4_1();
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
        	System.out.println("sec : "+sec);
        	for(int f : food_times) {
        		System.out.print(f);
        	}
        	System.out.println();
        	sec++;
        	
        	if(sec > k) {
        		break;
        	}
        	
        	food_times[idx]--;
        	
        	System.out.println("현재 : " + idx);
        	idx = getNextIdx(food_times, idx);
        	System.out.println("다음 : " + idx);
        	if(idx == -1) {
        		return -1;
        	}
        }
        
        return idx + 1;
    }
    
    public static int getNextIdx(int[] food_times, int idx) {
    	int cnt = food_times.length - 1;
    	
    	while(cnt-- > 0) {
    		int res = (++idx) % food_times.length;
    		System.out.println("idx : " + idx + " " + food_times.length + " res:" + res);
    		if(food_times[res] > 0) {
    			System.out.println(res);
    			return res;
    		}
    	}
    	return -1;
    }
////////////////////////////////////////////////////////////////////
}
