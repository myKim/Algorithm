package my.baekjoon.q57;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5724 {

	static int[] dp = new int[101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 0;
		while((N = Integer.parseInt(br.readLine())) != 0) {
			int cnt = 0;
			
			cnt = getSquareCount(N);
			
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int getSquareCount(int N) {
		if(dp[N] > 0) {
			return dp[N];
		}
		
		if(N <= 1) {
			return dp[N] = N;
		}
		return dp[N] = getSquareCount(N-1) + (N*N);
	}
	
}
