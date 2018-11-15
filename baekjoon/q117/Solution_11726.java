package my.baekjoon.q117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11726 {
	
	private static final int DIV = 10_007;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		
		dp[0] = 1;
		if(n > 1) {
			dp[1] = 2;
			
			for(int i=2; i<dp.length; i++) {
				dp[i] = (dp[i-1] + dp[i-2]) % DIV;
			}
		}
		
		System.out.println(dp[n-1]);
		
		br.close();
	}
	
}
