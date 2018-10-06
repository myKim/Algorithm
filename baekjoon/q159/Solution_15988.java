package my.baekjoon.q159;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_15988 {

	public static long[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		dp = new long[1000001];
		
		dp[1] = 1;
		dp[2] = dp[1] + 1;
		dp[3] = dp[1] + dp[2] + 1;
		
		for(int i=4; i<=1000000; i++) {
			dp[i] = (dp[i-3] + dp[i-2] + dp[i-1]) % 1000000009;
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