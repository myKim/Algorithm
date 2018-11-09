package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1010 {

	private static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			dp = new int[M+1][N+1];
			for(int[] arr : dp) {
				Arrays.fill(arr, 0);
			}
			
			bw.write(String.valueOf(solution(M, N)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	// 이항계수
	public static int solution(int M, int N) {
		if(dp[M][N] > 0) {
			return dp[M][N];
		}
		
		if(N==0 || M==N) {
			return dp[M][N] = 1;
		}
		
		return dp[M][N] = solution(M-1, N) + solution(M-1, N-1);
	}

}
