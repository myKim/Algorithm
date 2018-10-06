package my.baekjoon.q23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] arr = new int[M];
		for(int i=0; i<M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int res = 1;
		if(N > 1) {
			int[] dp = new int[N+1];
			dp[1] = 1;
			dp[2] = 2;
			for(int i=3; i<dp.length; i++) {
				dp[i] = dp[i-1] + dp[i-2];
			}
			
			int startPos = 1;
			int len = 0;
			for(int i=0; i<M; i++) {
				len = arr[i]-startPos;
				startPos = arr[i]+1;
				if(len > 0) {
					res *= dp[len];
				}
			}
			len = N+1-startPos;
			if(len > 0) {
				res *= dp[len];
			}
		}
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
}