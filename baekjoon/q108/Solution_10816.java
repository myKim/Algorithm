package my.baekjoon.ing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10816 {

	private static final int MAX_VALUE = 10_000_000;
	private static final int MIN_VALUE = -10_000_000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[MAX_VALUE - MIN_VALUE + 1];
		Arrays.fill(cnt, 0);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			cnt[n - MIN_VALUE]++;
		}
				
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(M-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(cnt[n - MIN_VALUE]+" ");
		}
		System.out.print(sb);
		
		br.close();
	}
	
}
