package my.baekjoon.q21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N+1][2];		
		
		dp[1][0] = 0; // ���ڸ��� 0 ���� ������ ���
		dp[1][1] = 1; // ���ڸ��� 1 �� ������ ���
		
		for(int i=2; i<=N; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		}
		
		bw.write(String.valueOf(dp[N][0] + dp[N][1]));
		
		br.close();
		bw.close();
	}
}