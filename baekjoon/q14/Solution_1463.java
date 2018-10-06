package my.baekjoon.q14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1463 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(solution(N)));
		
		br.close();
		bw.close();
	}
	
	public static int solution(int N) {
		int[] dp = new int[N+1];
		Arrays.fill(dp, -1);
		dp[0] = dp[1] = 0;
		
		for(int i=2; i<=N; i++) {
			int min = Integer.MAX_VALUE;
			
			if(i%3 == 0) {
				min = Math.min(min, dp[i/3]);
			}
			if(i%2 == 0) {
				min = Math.min(min, dp[i/2]);
			}
			min = Math.min(min, dp[i-1]);
			
			dp[i] = min + 1;
		}
		return dp[N];
	}

}