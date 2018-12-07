package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10844 {
	
	private static final int DIVIDER = 1_000_000_000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		int[][] dp = new int[10][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<dp.length; j++) {
				if(i==0) {
					if(j==0) dp[j][i] = 0;
					else dp[j][i] = 1;
					
					continue;
				}
				
				if(j-1 >= 0) {
					dp[j][i] = (dp[j][i] + dp[j-1][i-1]) % DIVIDER;
				}
				
				if(j+1 < 10) {
					dp[j][i] = (dp[j][i] + dp[j+1][i-1]) % DIVIDER;
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<dp.length; i++) {
			sum = (sum + dp[i][dp[i].length-1]) % DIVIDER;
		}
		
		System.out.println(sum);
		
		br.close();
	}
	
}
