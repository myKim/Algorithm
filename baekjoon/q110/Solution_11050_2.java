package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11050_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		K = Math.min(K, N-K);
		
		System.out.println(bino(N, K));
		
		br.close();
	}
	
	public static int bino(int N, int K) {
		if(N == K || K == 0) return 1;
		
		return bino(N-1, K-1) + bino(N-1, K);
	}

}