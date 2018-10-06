package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2579 {

	private static final int MAX_STAIRS = 10000;
	private static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] stairs = new int[MAX_STAIRS];
		
		for(int i=0; i<N; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		dp = new int[MAX_STAIRS][2];
		
		// 0 : 이전 계단을 밟은 경우 중 최대값
		// 1 : 이전 계단을 밟지 않은 경우 중 최대값
		dp[0][0] = stairs[0];
		dp[0][1] = 0;
		dp[1][0] = stairs[1];
		dp[1][1] = stairs[1] + dp[0][0];
		
		for(int i=2; i<dp.length; i++) {
			dp[i][0] = stairs[i] + Math.max(dp[i-2][0], dp[i-2][1]);
			dp[i][1] = stairs[i] + dp[i-1][0];
		}
		
		int res = Math.max(dp[N-1][0], dp[N-1][1]);
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
}