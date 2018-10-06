package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Test_2_Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Test_2_Q2 t = new Test_2_Q2();
		int a = 5;
		int[] b = {2,1,2,6,2,4,3,3};
//		int a = 4;
//		int[] b = {4,4,4,4};
		int[] res= t.solution(a, b);
		
		for(int i : res) {
			System.out.println(i);
		}
		
		
		bw.close();
		br.close();
	}
	
////////////////////////////////////////////////////////////////////
	

	
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.fill(answer, 0);
        boolean[] exist = new boolean[N+1];
        Arrays.fill(exist, false);
        
        PriorityQueue<StageInfo> pq = new PriorityQueue<>();
        Arrays.sort(stages);
        
        int cnt = 0; // 도달했으나 클리어 실패
        for(int i=stages.length-1; i>=0; i--) {
        	cnt++;
        	
        	if(i-1 >= 0 && stages[i-1] == stages[i]) {
        		continue;
        	}
        	
        	if(stages[i] <= N) {
        		double dif = getDifLevel(cnt, stages.length - i);
            	pq.offer(new StageInfo(stages[i],  dif));
            	exist[stages[i]] = true;
        	}
        	cnt = 0;
        }
                
        for(int i=1; i<exist.length; i++) {
        	if(!exist[i]) {
        		pq.offer(new StageInfo(i, 0));        	}
        }
        
        for(int i=0; i<answer.length; i++) {
        	StageInfo tmp = pq.poll();
        	answer[i] = tmp.stageNum;
        }
        
        return answer;
	}
	
	public static double getDifLevel(int a, int b) {
		return (double) a / b;
	}
	
	public static class StageInfo implements Comparable<StageInfo> {
		int stageNum;
		double difLevel;
		
		public StageInfo(int stageNum, double difLevel) {
			this.stageNum = stageNum;
			this.difLevel = difLevel;
		}

		@Override
		public int compareTo(StageInfo o) {
			if(difLevel > o.difLevel) return -1;
			else if(difLevel < o.difLevel) return 1;
			else {
				if(stageNum > o.stageNum) return 1;
				else if(stageNum < o.stageNum) return -1;
				else return 0;
			}
		}
	}
////////////////////////////////////////////////////////////////////
}
