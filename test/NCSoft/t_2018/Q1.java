package my.ncsoft.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		br.close();
		bw.close();
	}
	
	
    public int solution(String[] bakery_schedule, String current_time, int K) {
        int answer = -1;
        
        int cur = 0;
        int[] sch = new int[bakery_schedule.length];
        int[] cnt = new int[bakery_schedule.length];
        
        StringTokenizer st = new StringTokenizer(current_time, " :");
        cur = Integer.parseInt(st.nextToken());
        cur = (cur*60) + Integer.parseInt(st.nextToken());
        
        for(int i=0; i<bakery_schedule.length; i++) {
        	st = new StringTokenizer(bakery_schedule[i], " :");
        	sch[i] = Integer.parseInt(st.nextToken());
        	sch[i] = (sch[i]*60) + Integer.parseInt(st.nextToken());
        	
        	cnt[i] = Integer.parseInt(st.nextToken());
        }
        
        int sale = 0;
        for(int i=0; i<sch.length ; i++) {
        	if(cur > sch[i]) continue;
        	
        	sale += cnt[i];
        	if(sale >= K) {
        		answer = sch[i] - cur;
        		break;
        	}
        }
        
        return answer;
    }


}
