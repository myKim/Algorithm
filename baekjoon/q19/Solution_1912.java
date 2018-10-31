package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1912 {

	private static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp[0] = Integer.parseInt(st.nextToken());
		int max = dp[0];
		
		for(int i=1; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			dp[i] = Math.max(value, value + dp[i-1]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
		br.close();
	}
}