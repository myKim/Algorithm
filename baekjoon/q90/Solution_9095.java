package my.baekjoon.q90;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_9095 {

	private static final int MAX_NUMBER = 11;
	private static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		dp = new int[MAX_NUMBER+1];
		
		dp[1] = 1;
		dp[2] = dp[1] + 1;
		dp[3] = dp[1] + dp[2] + 1;
		
		for(int i=4; i<=MAX_NUMBER; i++) {
			dp[i] = (dp[i-3] + dp[i-2] + dp[i-1]);
		}
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			bw.write(String.valueOf(dp[N]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}