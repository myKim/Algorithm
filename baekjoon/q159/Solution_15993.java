package my.baekjoon.q159;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_15993 {

	public static long[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		dp = new long[100001][2];
		
		dp[1][0] = 0; // ¦
		dp[1][1] = 1; // Ȧ
		dp[2][0] = dp[1][1];
		dp[2][1] = dp[1][0] + 1;
		dp[3][0] = dp[1][1] + dp[2][1];
		dp[3][1] = dp[1][0] + dp[2][0] + 1; 
		
		for(int i=4; i<=100000; i++) {
			dp[i][0] = (dp[i-3][1] + dp[i-2][1] + dp[i-1][1]) % 1000000009;
			dp[i][1] = (dp[i-3][0] + dp[i-2][0] + dp[i-1][0]) % 1000000009;
		}
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			bw.write(dp[N][1] + " " + dp[N][0]);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}