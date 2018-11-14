package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2460 {

	private static final int MAX_CNT = 10_000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int cnt = 0;
		int N = 10;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			cnt -= m;
			cnt += p;
			cnt = cnt > MAX_CNT ? MAX_CNT : cnt;
			
			max = Math.max(max, cnt);
		}
		
		System.out.print(max);
		
		br.close();
	}
	
}
