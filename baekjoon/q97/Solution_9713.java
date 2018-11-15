package my.baekjoon.q97;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_9713 {
	
	private static final int MAX_NUM = 100;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] dp = new int[MAX_NUM + 1];
		dp[1] = 1;
		for(int i=2; i<dp.length; i++) {
			if((i&1) == 0) { // Â¦¼ö
				dp[i] = dp[i-1];
			}
			else { // È¦¼ö
				dp[i] = dp[i-1] + i;
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			bw.write(String.valueOf(dp[N]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
