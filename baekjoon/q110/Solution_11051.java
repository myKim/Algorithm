package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11051 {

	static final int MAX_VALUE = 10007;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		K = Math.min(K, N-K);
		
		dp = new int[N+1][K+1];
		
		System.out.println(bino(N, K));
		
		br.close();
	}
	
	public static int bino(int N, int K) {
		if(N == K || K == 0) return 1;
		if(dp[N][K] > 0) return dp[N][K];
			
		return dp[N][K] = (bino(N-1, K-1) + bino(N-1, K)) % MAX_VALUE;
	}

}