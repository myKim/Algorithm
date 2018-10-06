package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1149 {

	public static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int[][] cost = new int[N][3];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		// Solution
		dp = new int[N][3];
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
		for(int i=1; i<cost.length; i++) {
			for(int j=0; j<cost[i].length; j++) {
				dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
				dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
				dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
			}
		}
		
		int min = dp[dp.length-1][0];
		min = Math.min(min, dp[dp.length-1][1]);
		min = Math.min(min, dp[dp.length-1][2]);
		
		bw.write(String.valueOf(min));
		
		br.close();
		bw.close();
	}
	
}
